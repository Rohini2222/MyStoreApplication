package com.mystore.testcases;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestPet {
	public static final String DOC = "div[class^='documents__container box-shadow size']";
	public static final String THRDTS = "[class=icon-rc-dots-red]";
	public static final String XDNTXTFLD = "//div[contains(text(),'Documents')]";
	public static final String EDNT = "[id^='mat-mdc-dialog-title']";
	public static final String TXTNAME = "input[class$='rc-field__input--active ng-pristine ng-valid ng-touched']";
	public static final String TXFLD = "mat-icon[role='img']";
	public static final String XALCHAR = " //*[contains(text(),'alphanumérique, @, -, _, (,)' )]";
	public static final String CNLBTND = "[class='popin__footer_cancel ng-star-inserted']";
	public static final String CNFMBTND = "[class='popin__footer_confirm ng-star-inserted']";
	public static final String VFTXTD1 = "[class='documents__item__name overflow']";

	
	public static void main(String args[]) {
		/*String s = "Welcome";
        String rev ="";
		for (int i = s.length()- 1; i>= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		  System.out.println(rev);
*/	
		/*Set<Integer> set = new HashSet<>();
		
		int[] a= {1,2,3,33,44,33};
		
		for(int num:a) 
		{
			set.add(num);
		}
		
		System.out.println(set);
		
	}*/
	/*String str = "Welcome";

    // Use LinkedHashSet to preserve the original order
    Set<Character> set = new HashSet<>();
    Set<Character> dup = new HashSet<>();

    for (char c : str.toCharArray()) {
      if  (!(set.add(c))) {
    	  dup.add(c);
      };
    }
    System.out.println(dup);*/
		
		
		/*String s = "WWRRVVr";
		Map<Character,Integer> m = new HashMap<>();
		
	for(char c:s.toCharArray()) {
		
		m.put(c, m.getOrDefault(c, 0)+1);
	}
	System.out.println(m);*/
		

 int a[]= {1,2,3,4,5,7};
 int arraySum=0;
 int n=a[a.length-1];
 System.out.println(n);
 
 int sum =n*(n+1)/2;
 for(int arr:a) {
	 arraySum=arraySum+arr;
 }
 int miss= sum-arraySum;
 System.out.println(miss);
}}
