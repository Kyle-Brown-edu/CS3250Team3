import java.util.Vector;

public class CSVData implements DataInterface {
    /*  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        this is where we need to create our methods
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        One note is that we already have a list of Entry type objects, so when dealing with the list 
        we will be getting or setting entry objects which holds all our individual datas.
    */

    private Vector<Entry>  Data = new Vector<Entry>();
    private int NumEntries = 0;
    

    @Override
    public void initializeDatabase() {
        // TODO Auto-generated method stub

    }

    @Override
    public void createEntry() {
        // TODO Auto-generated method stub

    }

    @Override
    public void readEntry() {
        // TODO Auto-generated method stub

    }

    @Override
    public void updateEntry() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteEntry() {
        // TODO Auto-generated method stub

    }

    @Override
    public void saveEntry() {
        // TODO Auto-generated method stub

    }
    
}
