package Java;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void assignmentOperator() {
		int num ;
		num = 30;
	    System.out.println(num);
	}
    public static void arithmaticOperator() {
    	int numb1 = 1;
    	int numb2 = 2;
    	int result;
    	result = numb1 + numb2;
    	System.out.println(result);
    }
    public static void relOperator() {
    	int number1 = 10;
    	int number2 = 20;
    	if(number1>number2) {
    	System.out.println("number1 is greater than number2");
    	}
    	else {
    	System.out.println("number2 is greater than number1");
    	}
    }
    public static void logical() {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean result1;
        boolean result2;
        
        result1 = (a > b) || (a<c);
        System.out.println(result1);
        result2 = (a>c) && (c>b);
        System.out.println(result2);
    	
    }
    		
    }
  
		
		
		
		
		
	
