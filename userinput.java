import java.util.Scanner;
public class userinput{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers: ");
int num1=sc.nextInt();
System.out.println("enter the second number: ");
int num2 = sc.nextInt();
int sum=num1+num2;
System.out.println("the sum of the two numbers is: " +sum);
}
}
