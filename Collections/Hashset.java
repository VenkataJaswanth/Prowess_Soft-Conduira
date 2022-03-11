//Using HashSet
import java.util.HashSet;
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Set<Integer> hs = new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of values to be enter");
        int c=sc.nextInt();
        System.out.println("Enter the Values");
		while(c>0)
		{       
		      c--;
		      Integer a = sc.nextInt();
		      hs.add(a);
		}
        System.out.println("The Values are");
        for (Integer number : hs) {
            System.out.print(number+" ");
        }
    }
}
