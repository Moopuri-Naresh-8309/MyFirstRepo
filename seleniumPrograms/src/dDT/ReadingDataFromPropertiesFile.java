package dDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fiStream=new FileInputStream("./testdata/Data.properties");
		Properties property=new Properties();
		property.load(fiStream);
		String value = property.getProperty("url");
		System.out.println(value);
		}
}
