package com.training.sdet.day3.IO;

import java.io.*;

public class ObjectStoreAnGet {
	public static void store(Laptop laptop) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("laptop.ser"));

			oos.writeObject(laptop);
			oos.writeInt(100);
			oos.writeChars("Hello");
			
			System.out.println("Data Saved");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static Laptop getObject() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("laptop.ser"));
			Laptop laptop = null;
			try {
				laptop = (Laptop) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ois.readInt());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			System.out.print(ois.readChar());
			
			
			return laptop;
						
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		Laptop laptop = new Laptop (1234,"Surface Pro", "Microsoft");
		//store(laptop);
		System.out.println(getObject());
		
		
	}
}
