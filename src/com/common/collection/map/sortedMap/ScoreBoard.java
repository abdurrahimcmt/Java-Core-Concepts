package com.common.collection.map.sortedMap;
import java.util.*;

public class ScoreBoard {
    TreeMap<Integer,Set<String>> scoreList = new TreeMap<>();
    Map<String , Integer> sortedList = new TreeMap<>();
    //Add a student with a score.
    public void addStudentsScore(String name, Integer score){
        //check existing score
        if(scoreList.containsKey(score)){
            //If scoreList contains the same score and student, then the student's name
            // will be removed from the set of names.
            Integer oldScore = sortedList.get(name);
            if(oldScore != null){
                if(oldScore.equals(score)){
                    sortedList.remove(name);
                }
            }
            scoreList.get(score).remove(name);
            //If set is empty the remove this set(student name list),
            if(scoreList.get(score).isEmpty()){
                scoreList.remove(score);
            }
        }
        // Add score as key and check the student list (set) if student is not present then add
        scoreList.computeIfAbsent(score,k -> new HashSet<>()).add(name);
        sortedList.put(name,score);
    }
    //Print the full scoreboard (sorted by score descending).
    public void ScoreBoardPrint(){
        for(Integer hm : scoreList.descendingKeySet()){
            System.out.println(hm + " - " + scoreList.get(hm));
        }
    }
    //Show top N scores with student names.
    public void ShowTopStudents(int number){
        for(Integer hm : scoreList.descendingKeySet()){
            if(number != 0){
                System.out.println(hm + " - " + scoreList.get(hm));
                number--;
            }
        }
    }
    //Show all students who scored greater than or equal to X.
    public void showStudentsByScore(Integer score){
        SortedMap<Integer, Set<String>> ngMap = scoreList.tailMap(score);
        for(Integer st : ngMap.keySet()){
            System.out.println(st + " - " + scoreList.get(st));
        }
    }
    //Show closest lower and higher score for a given score.
    public void showStudentsLowerAndHigherScore(Integer score){
        System.out.println("Lower Score : "  + scoreList.lowerKey(score));
        System.out.println("Higher Score : " + scoreList.higherKey(score));
    }

    //Add a method to delete a student by name.
    public void deleteStudent(String name){
        if(sortedList.containsKey(name)){
            Integer score = sortedList.get(name);
            scoreList.get(score).remove(name);
            sortedList.remove(name);
            System.out.println(name + " deleted successfully");
        }
        else{
            System.out.println(name + " is invalid student name");
        }
    }
}
