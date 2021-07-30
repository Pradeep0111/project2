import java.util.Scanner;
public class switchcase{
public static void main(String[] args)
{int choice;
System.out.println("Pick one : 1.Hi\t2. Hey\t3.hello\t");
Scanner sc = new Scanner(System.in);
choice = sc.nextInt();
switch(choice)
{
case 1 :System.out.println("You said Hi");
break;
case 2 :System.out.println("You said Hey");
break;
case 3 :System.out.println("You said Hello");
break; 
default : System.out.println("Invalid choice.");
}
}
}
