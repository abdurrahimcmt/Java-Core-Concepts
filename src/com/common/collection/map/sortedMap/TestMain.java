package com.common.collection.map.sortedMap;

public class TestMain {
    public static void main(String[] args) {
        ScoreBoard sb = new ScoreBoard();
        sb.addStudentsScore("Rahim", 180);
        sb.addStudentsScore("Karim", 150);
        sb.addStudentsScore("Nadia", 180);
        sb.addStudentsScore("Tamim", 160);
        sb.addStudentsScore("Lamia", 140);
        sb.addStudentsScore("Shuvo", 150);

        sb.ScoreBoardPrint();
        System.out.println("\n\n");
        sb.ShowTopStudents(2);
        System.out.println("\n\n");
        sb.showStudentsByScore(150);
        System.out.println("\n\n");
        sb.showStudentsLowerAndHigherScore(155);

        System.out.println("\n\n");
        sb.deleteStudent("Nadia");
        System.out.println("After delete score board list : ");
        sb.ScoreBoardPrint();

    }
}
