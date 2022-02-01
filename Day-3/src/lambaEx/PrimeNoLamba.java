package lambaEx;

public class PrimeNoLamba {

	public static void main(String[] args) {
		
		EvenAndOdd  eo= (int num1)-> {
			int flag=0;
			for(int i=2;i<num1-1;i++)
			{
				
				if(num1%i==0)
				{
					flag=1;
				}
			}
			if(flag!=1)
			System.out.println(num1);
			else
				System.out.println("not prime");
			
};
eo.display(101);
}

}
