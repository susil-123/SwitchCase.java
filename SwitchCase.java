import java.util.*;
public class SwitchCase{
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the option\n 1.Hii\n 2.Hello\n 3.Welcome\n ");
    int inp=s.nextInt();
    switch(inp)
    {
        case 1: System.out.println("Hii ");
            break;
         case 2: System.out.println("Hello ");
         break;
          case 3: System.out.println("Welcome ");
        break;
        
        
    }
    
    
}
