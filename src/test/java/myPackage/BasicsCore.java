package myPackage;

import java.util.ArrayList;

public class BasicsCore {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BasicsCore md = new BasicsCore();
		md.getData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//int 	num = 23;
	//String	name = "Ashish Sharma";
	//char		bg = 'o';
		//double	marks = 0.48;
	//boolean 	kbc = true;
	
	
		
	//System.out.println(num  +"Is the my Birthday");
	//System.out.println(kbc);
	
	//int arr[] = {1,2,3,4,5};
	//int arr1[] = new int[5];
	 //arr1[0] = 1;
	 //arr1[1] = 2;
	 //arr1[2] = 3;
	 //arr1[3] = 4;
	// arr1[4] = 5;
	 
	 //System.out.println(arr1[3]);
	 
	// for(int i =0; i<arr1.length;i++) {
		// System.out.print(arr1[i]);
		 
	 //}
	 
	//String [] name1 = {"Ashish","Sharma","QA"};
	//for(int i=0; i<name1.length;i++) {
		//System.out.println(name1[i]);
		
	//}
	
	//for(String a:name1) {
		//System.out.println(a);
	//}
		
		
		
		
		
	int arr3[] = {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<arr3.length;i++) {
		
		if( arr3[i] % 2==0) {
			System.out.println(arr3[i]);
			break;
			
		}
		
		else {
			System.out.println(arr3[i]+"is not the multiple of 2");
			
		}
		
	}
	
	
	ArrayList<String> a = new ArrayList<String>();
	a.add("ashish");
	a.add("sharma");
	a.add("QA");
	System.out.println(a.get(2));
	
	
	
	
	String s = "Ashish Sharma QA";
	String s1 = "Ashish Sharma QA";
	
	String b = new String("Welcome");
	String c = new String("respect");
	
	String[] splitedString = s.split(" ");
	int k=1;
	 for(int i=1;i<5;i++) {
		 
		 
		 for(int j=1;j<=i;j++) {
			System.out.print(k);
			System.out.print("\t");
			k++;
			 
		 }
	System.out.println("");
	
	/* int k=1; 
	for(int i=0;i<=4;i++) {
		
		//System.out.println("outer loop started");
		for(int j=0;j<=4-i;j++) {
			System.out.print(k);
			System.out.print("\t");
			k++;
			
		}
		System.out.println(" ");
		
		
		
	 */ } 
	
	//for(int i=0;i<s.length();i++) {
	//System.out.println(s.charAt(i));
	
	//}
		
		//for(int i=s.length()-1; i>=0;i--) {
			//System.out.println(s.charAt(i));
			
		//}
		
		//int i=0;
		//while(i<10) {
			//System.out.println(i);
			//i++;
			
		//}
			
		//int j=10;
		//while(j>0) {
			//System.out.println(j);
			//j--;
			
		//}
		
	}

	public void getData() {
		System.out.println("Hello MOtto");
	}
	
	
	
	
	
	
	
	
	
}
