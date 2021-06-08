package com.coding;

public class StringCalculator {
	
	public int add(String numbers) {
		
		if(numbers.equals(""))
		{
			return 0;
		}
		else
		{
			int result=0;
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			String[] number = numbers.split(delimiter +"|\n");
			for(String num: number) {
				result+=Integer.parseInt(num);
			}
			return result;
		}
	}
}
