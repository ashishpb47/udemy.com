package myPackage;

public class exceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int b = 0;
		
		try  {
			
			int k = a/b;
			System.out.println(k);
			
		}
		catch(Exception e) {
			System.out.println("I catch the exception/error");
			
		}
		
			
	}

}
