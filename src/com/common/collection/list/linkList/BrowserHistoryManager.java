package com.common.collection.list.linkList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BrowserHistoryManager {

    LinkedList<String> backHistory = new LinkedList<>();
    LinkedList<String> forwardHistory = new LinkedList<>();
    String currentPage = "home";
    Scanner scan = new Scanner(System.in);
    public void takeUserInput(List<String> keylist){
        String keyWord = "home";
        System.out.println("Please insert your command: \n");
        while (!keyWord.equalsIgnoreCase("exit")){
            keyWord = scan.nextLine();
            if(!keyWord.isBlank()){
                if(keylist.contains(keyWord)){
                    switch (keyWord.toLowerCase()){
                        case "visit":
                            visitAction();
                            break;
                        case "back":
                            backAction();
                            break;
                        case "forward":
                            forwardAction();
                            break;
                        case "current":
                            printCurrentPage();
                            break;
                        case "exit":
                            exitAction();
                            break;
                        case "history":
                            historyAction();
                            break;
                    }
                }
                else{
                    System.out.println("Please type valid key!!!");
                }
            }
        }
    }
    public void visitAction(){
        System.out.println("Please insert URL : ");
        String url = scan.nextLine();
        if(!url.isBlank()){
            backHistory.addLast(currentPage);
            forwardHistory.clear();
            currentPage = url;
            System.out.println("✅ Visited: " + currentPage);
            System.out.println("Please insert your command: ");
        }
        else{
            System.out.println("Please provide valid url");
        }

    }
    public void backAction(){
        if(!backHistory.isEmpty()){
            forwardHistory.add(currentPage);
            currentPage = backHistory.removeLast();
            this.printCurrentPage();
        }
        else{
            System.out.println("Sorry No back history available");
        }
    }
    public void forwardAction(){
        if(!forwardHistory.isEmpty()){
            backHistory.add(currentPage);
            currentPage = forwardHistory.removeLast();
            this.printCurrentPage();
        }
        else{
            System.out.println("Sorry No forward history available");
        }

    }
    public void printCurrentPage(){
        System.out.println("You are on: " + currentPage);
    }
    public void exitAction(){
        scan.close();
        System.out.println("✅ Goodbye! Exiting browser...");
    }
    public void historyAction(){
        System.out.println("Back history : " + backHistory);
        System.out.println("Forward history : " + forwardHistory);
    }
}
