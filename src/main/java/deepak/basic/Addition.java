package deepak.basic;

public class Addition {

		 public int add (int a, int b)
		{
			return a+b;
		}

	public static void main(String[] args) {
		Addition add = new Addition();
		System.out.println("Addition results "+add.add(1, 2));
	}

}
