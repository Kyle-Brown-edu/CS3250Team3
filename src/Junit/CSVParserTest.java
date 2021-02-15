package Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import main.CSVParser;

class CSVParserTest {
	CSVParser parse = new CSVParser();
	HashMap testMap;
	String file = "/inventory_team3.csv";
	
	@Test
	public void ReadCSVWorks() {
		testMap = parse.readCSV(file);
		assertEquals(42585, testMap.size());
	}

}
