package main;

public interface DataInterface {
    void initializeDatabase(String filename); // filename allows us to add different files
    void createEntry();
    void readEntry();
    void updateEntry();
    void deleteEntry(String id);
    void saveEntry();
}
