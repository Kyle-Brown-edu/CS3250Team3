import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CSVParser {
	
	public HashMap<String, Entry> readCSV(String filename){
		String line;
		String[] fields;
		HashMap<String, Entry> results = new HashMap<String, Entry>();
		try (InputStream inputStream = getClass().getResourceAsStream(filename);
			    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
				reader.readLine();
				int i = 1;
			    while((line = reader.readLine()) != null) {
			    	Entry newEntry = new Entry();
			    	fields = line.split(",");
			    	
			    	newEntry.setProductID(fields[0]);
			    	newEntry.setStockQuantity(Integer.parseInt(fields[1]));
			    	newEntry.setWholesaleCost(Double.parseDouble(fields[2]));
			    	newEntry.setSalePrice(Double.parseDouble(fields[3]));
			    	newEntry.setSupplierID(fields[4]);
			    	
			    	results.put(fields[0], newEntry);
			    	
			    	System.out.print("Line " + i + ": ");
			    	System.out.print(results.get(fields[0]).getProductID() + "\n");
			    	i++;
			    }
		} catch (IOException e) {
				e.printStackTrace();
		}
		return results;
	}
}
