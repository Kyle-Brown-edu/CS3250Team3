package main;

public class Main extends Application {
    public static void main(String[] args) {
        CSVData init = new CSVData();
        init.initializeDatabase("testData.csv");
        System.out.println("hi");
        
    }
}
