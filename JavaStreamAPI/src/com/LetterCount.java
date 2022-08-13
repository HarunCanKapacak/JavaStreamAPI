package com;
import java.util.Arrays;

public class LetterCount {

	public static void main(String[] args) {
	  System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("mehmet","harun","yusuf"));	

	}
	//filtreleme yapar =>filter
	
	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
     		return Arrays.stream(names).filter(name -> name.length() > 5).mapToInt(String::length).sum();
		//mapToInt isim uzunlugu 5 ten buyuk olanlarýn uzunlugunu  al ve ýnteger bir deðere çevir
        // sum ile bu degerleri topla		
		
	}
}
