package test2;

public class variables {
	int r=23; //instant v
	
	static int g=25; //static v
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=28;
		System.out.println(f); //local v
		
		System.out.println(g); //static v
		
		variables test=new variables();
		System.out.println(test.r); //instant v

	}

}
