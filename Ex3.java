import java.util.Scanner;
public class Ex3 
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter three arms: ");
        int arm1=input.nextInt();
        int arm2=input.nextInt();
        int arm3=input.nextInt();
        System.out.println("Three arms are "+arm1+","+arm2+","+arm3);
        {
            if(arm1==arm2)
            {
                System.out.print("Triangle");
            }
            else if(arm2==arm3)
            {
                System.out.print("Triangle");
            }
            else if(arm1==arm3)
            {
                System.out.print("Triangle");
            }
            else
            {
                System.out.print("Not a triangle");
            }
        }
    }
}
