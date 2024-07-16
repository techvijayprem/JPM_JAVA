package Generic_examples;

public class demo_generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generic_examples<Integer> gc = new Generic_examples<Integer>();
		
		gc.setData(123);
		System.out.println(gc);
		
		Generic_examples<String> gc1 = new Generic_examples<String>();
		gc1.setData("vijuu");
		System.out.println(gc1);

	}

}
