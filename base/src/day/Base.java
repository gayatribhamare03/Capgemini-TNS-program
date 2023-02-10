package day;

public class Base {
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default Variable"+varDefault);
		
	}
	public void methodPublic()
	{
	System.out.println("public access Base class");
	System.out.println("public Variable"+varPublic);
	
}
	private void methodPrivate()
	{
		System.out.println("private access Base class");
	
	    System.out.println("private Variable"+varPrivate);
	
	}
	
	protected void methodProtected()
	{
		System.out.println("protected access Base class");
	
	    System.out.println("protected Variable"+varProtected);
	
	}
	
	public static void main(String[] args) {
		
				

	}

}
