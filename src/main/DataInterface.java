package main;

public interface DataInterface {
    void initializeDatabase(String filename); // filename allows us to add different files
    void createEntry(String ID, Entry e);
    Entry readEntry(String ID);
    void updateEntry(String ID, Entry e);
    void deleteEntry(String id);
    void saveEntry();
    int retSize();
}

