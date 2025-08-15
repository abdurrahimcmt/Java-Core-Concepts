package com.common.solid.dip;

interface ConnectDatabase{
    void connect();
}
class mysqlConnection implements ConnectDatabase{
    @Override
    public void connect() {
        System.out.println("Mysql Database Connection Successfully");
    }
}
class PostgresSQLDatabase implements ConnectDatabase{
    @Override
    public void connect() {
        System.out.println("Postgres Database Connection Successfully");
    }
}
class DatabaseManager{
    ConnectDatabase connectDatabase;

    public DatabaseManager(ConnectDatabase connectDatabase) {
        this.connectDatabase = connectDatabase;
    }
    public void loadData(){
        connectDatabase.connect();
        System.out.println("Data loading.......");
    }
}

public class App {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager(new mysqlConnection());
        db.loadData();
        db = new DatabaseManager(new PostgresSQLDatabase());
        db.loadData();
    }
}
