package lambaEx;

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.first way use lambda
		 ArithmeticEx ae=new  ArithmeticEx()
				 {

					@Override
					public void display(int x, int y) {
						// TODO Auto-generated method stub
						System.out.println("addition= "+(x+y));
					}

					
				 };
				 //end 
				 //call the method
				 ae.display(5, 9);
				 //2.second way use lambda
				 ArithmeticEx ae1=( x, y)-> {
						// TODO Auto-generated method stub
						System.out.println("addition= "+(x+y));
				 };
				 //end 
				 //call the method
				 ae1.display(5, 9);
				 //3. another way
				 ArithmeticEx ae3=( x, y)-> System.out.println("addition= "+(x+y));
		
				 //end 
				 //call the method
				 ae3.display(5, 9);
				 
				 
	}

}

