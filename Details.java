import java.util.Scanner;  /*** you hve to give this line to import code to scan******/

public class Details{
public static void main(String[] args){
Scanner Na = new Scanner(System.in);
System.out.println("         ");
System.out.println("         ");
System.out.println("         Fill the below details         ");
System.out.println("   ");
System.out.println("What is your name?");
String Name = Na.nextLine();
System.out.println("What is your company name?");
String Company = Na.nextLine();
System.out.println("Howmany employees are in your company?");
int Employee = Na.nextInt();
Scanner Des = new Scanner(System.in);
System.out.println("What is your designation?");
String Designation = Des.nextLine();
System.out.println("Howmany people are in your team?");
short Team = Na.nextShort();
Scanner Ag = new Scanner(System.in);
System.out.println("What is your age?");
int Age = Ag.nextInt();
Scanner Em = new Scanner(System.in);
System.out.println("Could you please provide your Email ID?");
String Email = Em.nextLine();
System.out.println("Your contact number please?");
long Contact = Na.nextLong();
System.out.println("      ");
System.out.println(" ");
System.out.println("       Please check the below details       ");
System.out.println("  ");
System.out.println("Name: " + Name);
System.out.println("Company Name: " + Company);
System.out.println("Total Employee: " + Employee);
System.out.println("Designation: " + Designation);
System.out.println("Total team members: " + Team);
System.out.println("Age: " + Age);
System.out.println("Email ID: " + Email);
System.out.println("Mobile No.: " + Contact);
}
}





