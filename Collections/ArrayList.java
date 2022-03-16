import java.util.*;

public class Main{
    public static void main(String[] args)
    {
         ArrayList<Integer> hs = new ArrayList<Integer>();
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
        Collections.sort(hs); 
        for (Integer number : hs) {
            System.out.print(number+" ");
        }
    }
}
