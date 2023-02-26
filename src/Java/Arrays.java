package Java;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[];
    a = new int[3];
    a[0]=20;
    a[1]=30;
    a[2]=40;
    System.out.println(a[2]);
    
    //Method 2 for creating arrays
    int b[] = {10,15,20,25};
    System.out.println(b[3]);
    
    //String type array
    String s[] = {"Athaan","Atul","Neha"};
    System.out.println(s[0]);
    
    //Copy values from one array to other
    int a1[] = {100,200,300};
    int a2[] = a1;
    System.out.println(a2[2]);
    
    for(int i=0; i<a2.length;i++) {
    	System.out.println(a2[i]);
    }
    	//Multi dimensional arrays
    	int[] [] m = {{1,2},{3,4}};
    	System.out.println(m[1][0]);
    
   }

}
