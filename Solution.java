import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int index = 0;
		for(int i=1;i<=n;i++)
		{
		    int temp = Add(i);
		    if(temp>=sum)
		    {
		        sum=temp;
		        index=i;
		    }
		}
		System.out.println(index);
	}
	
	public static int Add(int n)
	{
	    int sum=0;
	    while(n>0)
	    {
	        int temp = n%10;
	        sum+=temp;
	        n=n/10;
	    }
	    return sum;
	}
}
