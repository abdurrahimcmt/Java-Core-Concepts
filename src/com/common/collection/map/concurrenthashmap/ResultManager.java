package com.common.collection.map.concurrenthashmap;

public interface ResultManager {
    void submitScore(String name, int score);
    Integer getScore(String name);
    void printTopStudents(int topN);
    void printStudentsWithScoreAbove(int minScore);
    void printNearbyScores(int score);
}
