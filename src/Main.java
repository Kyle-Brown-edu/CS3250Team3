public class Main{
    public static void main(String[] args) {
        DataInterface init = new CSVData();
        init.initializeDatabase("/inventory_team3.csv");
    }
}
