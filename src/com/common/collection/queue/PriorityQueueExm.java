package com.common.collection.queue;

import java.util.*;

public class PriorityQueueExm {
    public static void main(String[] args) {
        Queue<Integer> num = new PriorityQueue<>();

        num.offer(4);
        num.offer(1);
        num.offer(7);
        num.offer(3);
        num.offer(8);

        System.out.println("peek : " + num.peek());

        while (!num.isEmpty()){
            System.out.println(num.poll());
        }

        Queue<String> name = new PriorityQueue<>();
        name.offer("Banana");
        name.offer("Apple");
        name.offer("Peach");
        name.offer("Orange");

        while (!name.isEmpty()){
            System.out.println(name.poll());
        }

        Queue<Integer> maxNumber = new PriorityQueue<>(Collections.reverseOrder());

        maxNumber.offer(4);
        maxNumber.offer(1);
        maxNumber.offer(7);
        maxNumber.offer(3);
        maxNumber.offer(8);

        while (!maxNumber.isEmpty()){
            System.out.println(maxNumber.poll());
        }

        Queue<Student> students = new PriorityQueue<>();
        students.offer(new Student("bob",65));
        students.offer(new Student("alex",75));
        students.offer(new Student("max",60));
        students.offer(new Student("mia",80));
        students.offer(new Student("lisa",85));
        System.out.println("Alphabet order : ");
        while (!students.isEmpty()){
            Student student = students.poll();
            System.out.println(student.studentName + " -> " + student.num);
        }

        System.out.println("Number revers order : ");
        LinkedList<Student> students1 = new LinkedList<>(students);
        students1.sort(Comparator.comparing(Student::getNum).reversed());
        Iterator<Student> numberStudents = students1.iterator();
        while (numberStudents.hasNext()){
            Student student = numberStudents.next();
            System.out.println(student.studentName + " -> " + student.num);
        }

    }
}
