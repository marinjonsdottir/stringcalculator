package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else if(text.contains(",") || text.contains("\n") || text.contains("//")){
			//negatives(text);
			return sum(splitNumbers(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    if(numbers.startsWith("//")){
	    	String delimeter = numbers.substring(2,3);
	    	numbers = numbers.substring(4);

	    	return numbers.split(delimeter);
	    }

	    return numbers.split(",|\n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    
		    if(toInt(number) < 1000){
		    	total += toInt(number);
		    }
		    
		}

		return total;
    }

    /*private static void negatives(String[] numbers){
    	String neg = "";
    	for(String number : numbers){
    		if(number.contains("-")){
    			neg += "," + number;
    		}
    	}
    	if(neg.equals("")){ return; }
    	else{
    		throw new RuntimeException("Negatives not allowed: " + neg.substring(1));
    	}
    }*/

}