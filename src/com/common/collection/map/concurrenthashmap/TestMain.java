package com.common.collection.map.concurrenthashmap;

public class TestMain {
    public static void main(String[] args) throws InterruptedException {
        OnlineExamResultSystem exam = new OnlineExamResultSystem();

        Thread submit = new Thread(() -> {
            exam.submitScore("Polok",95);
            exam.submitScore("Khalek",85);
            exam.submitScore("Jiku",97);
            exam.submitScore("Jisan",82);
            exam.submitScore("Sagor",75);
            exam.submitScore("Shahnaz",98);
            exam.submitScore("Sarmin",85);
            exam.submitScore("Forhad",88);
        });


        Thread update = new Thread(() -> {
            exam.submitScore("Sagor",80);
            exam.submitScore("Forhad",75);
        });

        Thread getScore = new Thread(() -> {
            exam.getScore("Shahnaz");
        });

        Thread printTopStudents = new Thread(() -> {
            exam.printTopStudents(3);
        });
        Thread printStudentsWithScoreAbove = new Thread(() -> {
            exam.printStudentsWithScoreAbove(90);
        });
        Thread printNearbyScores = new Thread(() -> {
            exam.printNearbyScores(90);
        });

        submit.start();
        Thread.sleep(100);
        update.start();
        Thread.sleep(100);
        getScore.start();
        Thread.sleep(100);
        printTopStudents.start();
        Thread.sleep(100);
        printStudentsWithScoreAbove.start();
        Thread.sleep(100);
        printNearbyScores.start();

        try {
            submit.join();
            update.join();
            getScore.join();
            printTopStudents.join();
            printStudentsWithScoreAbove.join();
            printNearbyScores.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
