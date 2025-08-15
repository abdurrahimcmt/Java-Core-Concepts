package com.common.collection.map.concurrenthashmap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class OnlineExamResultSystem implements ResultManager{
    ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
    ConcurrentSkipListMap<Integer, Set<String>> skipListMap = new ConcurrentSkipListMap<>();

    @Override
    public synchronized void submitScore(String name, int score) {
        boolean isUpdate = false;
        if(map.containsKey(name)){
            Integer oldScore = map.get(name);
            if(skipListMap.containsKey(oldScore)){
                skipListMap.get(oldScore).remove(name);
                map.remove(name);
                if(skipListMap.get(oldScore).isEmpty()){
                    isUpdate = true;
                }
            }
        }
        map.put(name,score);
        skipListMap.computeIfAbsent(score,K -> new HashSet<>()).add(name);
        if(isUpdate){
            System.out.println(name +  " is updated successfully");
        }
        System.out.println(name +  " is insert successfully");
    }

    @Override
    public Integer getScore(String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(map.containsKey(name)){
            return map.get(name);
        }
        else {
            System.out.println("Student name is invalid");
            return 0;
        }
    }

    @Override
    public void printTopStudents(int topN) {
        System.out.println("Top " + topN + " Students list : ");
        int count = 0;
        for(Integer score : skipListMap.descendingKeySet()){
            if(count < topN){
                System.out.println(skipListMap.get(score) + "->" + score);
                count++;
            }
        }
    }

    @Override
    public void printStudentsWithScoreAbove(int minScore) {
        System.out.println("Student list which score is above : " + minScore);
        ConcurrentNavigableMap<Integer, Set<String>> students = skipListMap.tailMap(minScore);
        for(Integer score : students.keySet()){
            System.out.println(skipListMap.get(score) + " -> " + score);
        }
    }

    @Override
    public void printNearbyScores(int score) {
            System.out.println("higher or lower score Students list for score :" + score);
            System.out.println("Higher -> " + skipListMap.higherEntry(score));
            System.out.println("Lower -> " + skipListMap.lowerEntry(score));
    }
}
