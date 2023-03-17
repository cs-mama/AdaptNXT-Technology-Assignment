package com.nxt.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class AppTest {
	
	public static void main(String[] args) {
		File file = new File("data.csv");
		try {
			FileWriter outputfile = new FileWriter(file);
			CSVWriter writer = new CSVWriter(outputfile);
			String[] header = { "Product", "Price", "Rating"};
	        writer.writeNext(header);
	        String[] data1 = { "Wallet", "1000", "4.5" };
	        writer.writeNext(data1);
	        String[] data2 = { "Samsung Galaxy", "10000", "4" };
	        writer.writeNext(data2);
	        String[] data3 = { "Led Tv", "16500", "3" };
	        writer.writeNext(data3);
	        String[] data4 = { "Boat smart watch", "3000", "5" };
	        writer.writeNext(data4);
	        writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
