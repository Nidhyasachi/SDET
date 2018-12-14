package com.training.sdet.day3.IO;

import java.io.*;

public class ReadWriteOperation {
	public static void main(String[] args) {
		readWrite();
		try {
			BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));
			
			String line="";
			
			try {
				while((line = br.readLine()) !=null){
					System.out.println(line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Read the lines from the file");
	}

	private static void readWrite() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter  fileWriter  = null;
		try {
			System.out.println("Enter Emp Id: ");
			int empId = Integer.parseInt(br.readLine());
			System.out.println("Enter Emp Name: ");
			String empName = br.readLine();

			System.out.print("Emp Id is  " + empId +" && ");
			System.out.println("Emp Name is " + empName);

			File file = new File("Sample.txt");
			fileWriter = new FileWriter(file,true);
			
			fileWriter.write("Emp Id is  " + empId +"\n");
			fileWriter.write("Emp Name is " + empName +"\n");
			
			System.out.println("Contents written to file");
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
