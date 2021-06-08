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
			String[] number = numbers.split(",|\n");
			for(String num: number) {
				result+=Integer.parseInt(num);
			}
			return result;
		}
	}
}
