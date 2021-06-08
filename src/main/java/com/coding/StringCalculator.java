package com.coding;

public class StringCalculator {
	
	static int count = 0;
	NumberParser numberParser = new NumberParser();
	
	public int getCalledCount() {
		 ++count;
		 return count;
	}
	
	public int add(String numbers) {
		
		getCalledCount();
		
		if(numbers.equals(""))
		{
			return 0;
		}
		else
		{
//			String delimiter = ",";
//			if(numbers.matches("//(.*)\n(.*)")) {
//				delimiter = Character.toString(numbers.charAt(2));
//				numbers = numbers.substring(4);
//			}
			String[] number = numberParser.splitOnDelimiter(numbers); 

			return utilSum(number);
		}
	}

	private int utilSum(String[] number) {

		String resultNegative="";
		int result=0;
		for(String num: number) {
			if(Integer.parseInt(num)<0)
				if(resultNegative=="")
					resultNegative = num;
				else
					resultNegative +=(","+num);
			if(Integer.parseInt(num)>1000)
				continue;
			result+=Integer.parseInt(num);
		}
		if(!resultNegative.equals(""))
			throw new IllegalArgumentException("negatives not allowed : "+ resultNegative);
		return result;
	}
}
