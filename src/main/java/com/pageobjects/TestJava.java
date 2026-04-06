package com.pageobjects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.util.SystemOutLogger;

/**
 * @author Test
 *
 */
public class TestJava {
	
	public static void main(String args[]) {
		//reverse the string
		
		/*String s ="Selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
			}
		System.out.println("reverse string is:-"+ rev);
		}*/
	
	
	
	//check palindrome
		/*String s="MOMsd";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals(s)) {
			System.out.println("Palindrome");
			
		}else {
			System.out.println("not a palindrome");
		}*/
		
	//Count of each charater in String
		
/*	String s="Wweeee";
	Map <Character,Integer>m = new HashMap<>();
	for(char c:s.toCharArray()) {
		m.put(c, m.getOrDefault(c, 0)+1);
	}
	System.out.println(m);*/
		
		/*int a =101;
		int b =20;
		
		//System.out.println("value of a is "+a +" "+"value of b is "+b);
		
		System.out.println(a%2+ " "+ a/2);
		
		if(a%2==0) {
			System.out.println("EVEN");}
			else {
				System.out.println("ODD");
			}*/
		
		//largest number in array
		
		/*int [] a= {10,9,20};
		
	int max=a[0];
	int min=a[0];
	for(int num:a) {
		if(num>max)max=num;
		if(num<min)min=num;
	}
		System.out.println(max);
		System.out.println(min);
			
	*/
		//filter
/*
		        List<Integer> list = Arrays.asList(10, 20, 30, 15, 25);

		    list.stream().filter(n->n>15).forEach(System.out::println);*/
		    
		

	
		




}}