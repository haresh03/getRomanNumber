package test;

import java.util.ArrayList;
import java.util.Scanner;
// Java program that converts a positive integer into the Roman number system till M = 1000.
public class Test {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int digit, num = in.nextInt();
		int temp = num;
		
		ArrayList<String> ma = new ArrayList<String>();
		// till 1000 (M) only
		if (num > 1000) {
			System.out.println("ERROR");
			System.exit(0);
		}
		
		// UNIT'S PLACE
			digit = num%10;
			switch (digit) {
			case 0: ma.add("");
					break;
			case 1: ma.add("I");
					break;
			case 2: ma.add("II");
					break;
			case 3: ma.add("III");
					break;
			case 4: ma.add("IV");
					break;
			case 5: ma.add("V");
					break;
			case 6: ma.add("VI");
					break;
			case 7: ma.add("VII");
					break;
			case 8: ma.add("VIII");
					break;
			case 9: ma.add("IX");
					break;
			}
		// TEN'S PLACE
			num = num/10;
			digit = num%10;
			switch (digit) {	
			case 0: ma.add("");
				break;
			case 1: ma.add("X");
					break;
			case 2: ma.add("XX");
					break;
			case 3: ma.add("XXX");
					break;
			case 4: ma.add("XL");
					break;
			case 5: ma.add("L");
					break;
			case 6: ma.add("LX");
					break;
			case 7: ma.add("LXX");
					break;
			case 8: ma.add("LXXX");
					break;
			case 9: ma.add("XC");
					break;
			}
		// HUNDRED'S PLACE
			num = num/10;
			digit = num%10;
			switch (digit) {
			case 0: ma.add("");
				break;
			case 1: ma.add("C");
					break;
			case 2: ma.add("CC");
					break;
			case 3: ma.add("CCC");
					break;
			case 4: ma.add("CD");
					break;
			case 5: ma.add("D");
					break;
			case 6: ma.add("DC");
					break;
			case 7: ma.add("DCC");
					break;
			case 8: ma.add("DCCC");
					break;
			case 9: ma.add("CM");
					break;
			}
			
		// THOUSAND'S PLACE
			num = num/10;
			digit = num%10;
		
			if ( digit == 1 ) ma.add("M");
			
			StringBuffer sb = new StringBuffer();
			
			for ( int i = String.valueOf(temp).length()-1 ; i >= 0  ; i-- )
				sb.append(ma.get(i));
		       
			String str = sb.toString();
		    System.out.println(str);
	}	
}