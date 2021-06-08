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
			String resultNegative="";
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")) {
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			String[] number = numbers.split(delimiter +"|\n");
			for(String num: number) {
				if(Integer.parseInt(num)<0)
					if(resultNegative=="")
						resultNegative = num;
					else
						resultNegative +=","+num;
				if(!resultNegative.equals(""))
					throw new IllegalArgumentException("negatives not allowed : "+ resultNegative);
				result+=Integer.parseInt(num);
			}
			return result;
		}
	}
}
