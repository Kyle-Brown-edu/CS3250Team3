package Junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.CSVData;
import main.DataInterface;

public class CSVDataTest {  
    DataInterface testCSV = new CSVData();

    @Test
    public void initDBTest() {
        // creates test db
        testCSV.initializeDatabase("testData.csv");
        // deletes one of the 10 entries
        testCSV.deleteEntry("HH80NVAEHJ3L");
        // gets the size of the db after removing an item
        int size = testCSV.retSize();
        // test if the size is 9 (10-1)
        assertEquals(9, size);

        // !!! Must include file in main for test to work properly !!!
    }
}
