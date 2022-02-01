package lambaEx;

public class EvenAndOddLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenAndOdd  eo= (int num1)-> {
						if(num1%2==0)
							System.out.println(num1+ "is even no.");
						else
							System.out.println(num1);
						
		};
		eo.display(20);
	}

}
