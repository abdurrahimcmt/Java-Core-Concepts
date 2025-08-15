package com.common.collection.list.linkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {
    public void printMenu(){
        System.out.println("Welcome to Bangla browser");
        List<String> keyList = Arrays.asList("visit","back","forward","current","exit","history");
        System.out.println("Please type your action with this kew word listed below");
        System.out.println("\"visit\" to visit a new page.");
        System.out.println("\"back\" to go to the previous page");
        System.out.println("\"forward\" to go to the next page.");
        System.out.println("\"current\" to show the current page.");
        System.out.println("\"exit\" to stop the program.");
        System.out.println("\"history\" to show the browser history.");
        BrowserHistoryManager browser = new BrowserHistoryManager();
        browser.takeUserInput(keyList);
    }
}
