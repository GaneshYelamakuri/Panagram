package com.jsp.Stringpack;

public class Panagram {

	public static void main(String[] args) {
		
		String w="abcdefghijklmnopqrstuvwxyz";
		System.out.println(checkPanagram(w.toLowerCase()));
	
	}
	public static String checkPanagram(String w) {
		
		if(w.length()<26) return "NOt a panagram";
		else {
			for(char c='a';c<='z';c++) {
				if(w.indexOf(c)<0) return "not a panagram";
				
			}
			return "is a panagram";
		}
		
	}
	
	

}
