package com.tech.string;

public class MergeTwoStringArray {

	public static void main(String[] args) {
		String[] s1= {"sameer","gokul","manish"};
		String[] s2= {"prakesh","sai","ram"};
		
		String[] s3=new String[s1.length+s2.length];
		
		int count=0;
		
		for(int i=0;i<s1.length;i++) {
			s3[count]=s1[i];
			count++;
		}
		
		for(int i=0;i<s2.length;i++) {
			s3[count]=s2[i];
			count++;
		}
		
		
		for(String s:s3) {
			System.out.println(s);
		}
	}
}
