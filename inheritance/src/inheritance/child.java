package inheritance;

class parent {
	void add(int x, int y)
	{
		System.out.println("Add from parent is"+(x+y));
	}
	}


public class child extends parent
	{
		void add(int x,int y)
		{
			super.add(5, 5);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj =new child();
		obj.add(5, 5);

	}
	}