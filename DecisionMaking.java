import java.util.Scanner;
public class DecisionMaking{
public static void main(String[] args)
{
int input;
System.out.println("Enter Your Age:");
Scanner s = new Scanner(System.in);
input = s.nextInt();
if(input>18)
System.out.println("You are eligible to vote.");
else if(input >20)
System.out.println("You are a major.");
else
System.out.println("You are Not a major.");
}
}
 