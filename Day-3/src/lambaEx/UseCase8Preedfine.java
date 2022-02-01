package lambaEx;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class UseCase8Preedfine {

	public static void main(String[] args) {
	int a[]= {23,45,70};
	Consumer c=(t)->{
		if((Integer)t%2==0)
		{
			System.out.println(t+"It is even no");
		}
		else
		{
			System.out.println(t+" is od no");
		}
	};
	for(int m:a)
	{
		c.accept(m);
	}
	
	
//2
	BiConsumer bi=(x,y)->{
		
		if((Integer)x> (Integer)y)
		{
			System.out.println(x+ " is greater then "+y);
		}
	};
	bi.accept(23, 7);
	//another way 
BiFunction bf=(x,y)->(Integer)x+(Integer)y;
Integer addition=(Integer)bf.apply(45, 67);
System.out.println("sum = "+addition);

	//3
	Scanner sc=new Scanner(System.in);
	System.out.println("How many time print number.");
	int n=sc.nextInt();
	Consumer c2=(t)->{
	
		 
		if((Integer)t%2==0)
		{
			System.out.println(t+"It is even no");
		}
		else
		{
			System.out.println(t+" is od no");
		}
	};
	for(int i=0;i<n;i++)
	{
		c2.accept(i);
	}
	}

}
