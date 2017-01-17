package com.java.properties;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class App1 {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("E:/JAVA/workspaceEE/CollectionExamples1/src/main/java/mysql_db.properties");
		Properties props = new Properties();
		props.load(reader);

		Set<Object> keySet = props.keySet();

		for (Object obj : keySet) {
			System.out.println(obj + "--" + props.get(obj));

		}
	
		System.out.println("\n\noracle config");
		new App1().readOraDBConfigFile();
	}

	public void readOraDBConfigFile() throws IOException {

		InputStream is = this.getClass().getClassLoader().getResourceAsStream("oracle_db.properties");

		Properties props = new Properties();
		props.load(is);
		Set<Object> keySet = props.keySet();

		for (Object obj : keySet) {
			System.out.println(obj + "--" + props.get(obj));
		}
	}
}
