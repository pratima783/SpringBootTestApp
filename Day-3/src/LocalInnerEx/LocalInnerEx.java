package LocalInnerEx;

public class LocalInnerEx {
public void factory()
{
	class LocalClass{
		public void fact(int n)
		{
			int fact=1;
			for(int i=1;i<=n;i++)
			{
			fact= fact*i;
		
			}
			System.out.println(fact);	
		}
		
	}
	LocalClass c=new LocalClass();
	c.fact(5);
	
}
public static void main(String[] args)
{
	 LocalInnerEx lin =new  LocalInnerEx();
	 lin.factory();
}
}
