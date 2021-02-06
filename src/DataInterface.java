public interface DataInterface {
    void initializeDatabase(String filename); // filename allows us to add different files
    void createEntry();
    void readEntry();
    void updateEntry();
    void deleteEntry();
    void saveEntry();
}
