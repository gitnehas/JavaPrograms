package Java;

public class FirstJavaClass {
	
	int number =9;
	String string1="Mau";
	public void getdata()
	{
	System.out.println("I am a method");
	}

	public static void main(String[] args) {
		
		//FirstJavaClass n = new FirstJavaClass();
		//n.getdata();
		//System.out.println("value of number variable in n object : "+ n.number);
		//n.number=30;
		//System.out.println("Updated value of number variable in n object : "+n.number);
		//System.out.println("value of string1 variable in n object: "+n.string1);
		//n.string1="Athu";
		//System.out.println("new value of string1 variable in n object: "+n.string1);
		//String s1 = new String("Neha");
		//String s2 = new String("Neha");
		//s1.concat("Sawai");
		//System.out.println(s1);
		/*
		 * StringBuffer sb = new StringBuffer("hi"); StringBuffer sb1 = new
		 * StringBuffer("hi"); sb.append("Neha"); System.out.println(sb); sb.replace(0,
		 * 1, "by"); System.out.println(sb); sb.deleteCharAt(1); System.out.println(sb);
		 * sb.reverse(); System.out.println(sb);
		 */
		/*if(5>-1)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("failed");
		}
		}
		*/
		
		/*
		 * for(int i=0;i<10;i=i+2) { if(i==8) System.out.println("displayed"); else
		 * System.out.println("not displayed"); }
		 */
		/*
		 * int i= 0; while(i<=10) {System.out.println(i); i++; }
		 */
		/*
		 * int j=20; do {System.out.println(j); j++; } while(j<=30);
		 */
		//nested loops
		int n=1;
		
		for(int i=0;i<=4;i++)  //outer loop
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=4-i;j++) //innerloop
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	// pyramid 1
	
/*	
	for(int i=0;i<=4;i++)  //outer loop
	{
		for(int j=1;j<=4-i;j++) //innerloop
		{
			System.out.print("*");
			n++;
		}
		System.out.print("\n");
	}
	*/
}
	
		// TODO Auto-generated method stub

	}


