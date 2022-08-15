package myPackage;

public class StaticVra {

	String name;
	String address;
	String city = "Amritsar";
	 static int i = 0;
	
	
	
	public StaticVra(String name, String address)  {
	
		this.name = name;
		this.address = address;
		i++;
		
		System.out.println(i);
		
		
		
	}
	
	
	public void  getAddresss() {
		System.out.println(name+ " "+city);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVra sc = new StaticVra("Ashish","Sultanwind");
		StaticVra sc1 = new StaticVra("Rakesh","Sec");
		sc.getAddresss();
		sc1.getAddresss();
		
		
		
	}

}
