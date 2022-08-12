package verags;

public class ClassA {

	void add(int... a) {
		
		  
		  int sum = 0;
		  
		  for(int x:a) {
		  
		  sum = sum + x ;
		  
		  }
		  
		  System.out.println(sum);
	}
	
	public static void main(String[] args) {

		ClassA obj = new ClassA();
		obj.add();
		obj.add(20, 30, 40);
		obj.add(50, 20, 40);
		obj.add(10, 5, 20);
		obj.add(30, 70, 40, 80, 45);

	}

}
