package com.coding;

public class NumberParser {
	
	private String delimiter;

	public NumberParser() {
		delimiter = "[,\n]";
	}
	
	public String[] splitOnDelimiter(String numbers) {
		
		if(numbers.startsWith("/")) {
			return numbers
					.substring(numbers.indexOf("\n")+1)
					.split(extractDelimiter(numbers));
		}
		
		return numbers.split(delimiter);
	}

	private String extractDelimiter(String numbers) {
		String removeDelimiter;
		int index_start = numbers.indexOf("\n");
		
		removeDelimiter = numbers.substring(0,index_start)
								 .replace("//","")
								 .replace("[","")
								 .replace("]","");
		return "\\Q"+removeDelimiter+"\\E";
	}
	
}
