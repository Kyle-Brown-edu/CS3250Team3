package main;

public interface DataInterface {
    void initializeDatabase(String filename); // filename allows us to add different files
    void createEntry(String ID, Entry e);
    void readEntry(String ID);
    void updateEntry();
    void deleteEntry(String id);
    void saveEntry();
    int retSize();
}
