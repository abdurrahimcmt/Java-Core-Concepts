package com.common.solid.dip;

class MySQLDatabase {
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}

class DataManager {
    private MySQLDatabase database;

    public DataManager() {
        this.database = new MySQLDatabase(); // 💥 tightly coupled
    }

    public void loadData() {
        database.connect();
        System.out.println("Loading data...");
    }
}
public class ViolateDip {
    public static void main(String[] args) {
        DataManager manager = new DataManager();
        manager.loadData();

    }
}
