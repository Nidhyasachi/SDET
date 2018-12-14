package com.training.sdet.day3.IO;

import java.io.File;

public class FileOperation02 {
public static void main(String[] args) {
	File file = new File("C:\\Users\\Huser\\Desktop\\My Folders");
	
	String [] list = file.list();
		
	for(String temp : list) {
		File f = new File(file, temp);
		if(f.isFile() && !f.canWrite()){
		//System.out.println(temp);
		System.out.println(f.getName());
	}
}
}
}

