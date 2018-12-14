package com.training.sdet.day3.IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
public static void main(String[] args) {
	File file = new File("Sample.txt");
	
	if(file.exists()){
		System.out.println("File Exist");
		System.out.println("Created Time "+ new Date(file.lastModified()));
		System.out.println("Can Read " + file.canRead());
		System.out.println("Can Write " + file.canWrite());
		System.out.println("Absolute Path : " + file.getAbsolutePath());
		System.out.println("Absolute Path : " + file.separator);
		file.delete();
	}else {
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Created");
	}
	
	System.out.println("Job Done");
}
}
