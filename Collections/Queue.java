import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
      System.out.println("enter number of values");
      int n=sc.nextInt();
      System.out.println("enter the values");
        Queue<Integer> que = new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            que.add(sc.nextInt());
        }
        System.out.println("Elements are :"+que);
        System.out.println("Removing one element from queue : "+que.poll());
        System.out.println("Removing one element from queue : "+que.poll());
        System.out.println("Remaining Queue elements are   :"+que);
    }
}
