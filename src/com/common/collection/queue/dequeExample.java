package com.common.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class dequeExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert your word");
        String word = scan.nextLine();
        if(!word.isBlank()){
            if(isPalindrome(word)){
                System.out.println(word + " is palindrome");
            }
            else{
                System.out.println(word + " is not palindrome");
            }
        }
        scan.close();
    }
    public static boolean isPalindrome(String word){
        Deque<Character> charSet = new ArrayDeque<>();
        word = word.toLowerCase().replaceAll("[^a-z]", "");
        for(char ch : word.toCharArray()){
            charSet.offerLast(ch);
        }
        while(charSet.size() > 1){
            char fast = charSet.pollFirst();
            char last = charSet.pollLast();

            if(last != fast){
                return false;
            }
        }
        return true;
    }
}
