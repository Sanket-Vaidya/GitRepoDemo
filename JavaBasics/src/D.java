
public class D {
	
	public String Name(String FirstName) {
		String Fullname=FirstName+" "+"Jackson";
		return Fullname;
	}

	public static void main(String[] args) {
	  D tested=new D();
	 String ID= tested.Name("Micahel");
	 
	 System.out.println(ID);

	}

}
