package Java;

public class charCount {

	public static void main(String[] args) {
		
		String s ="this is sparta";
		int charCounter=0;
		char ch;
		
		
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			
			if(ch != ' ')
			charCounter++;
		}
		
		System.out.println("the char count is:"+charCounter);
		// TODO Auto-generated method stub

	}

}
