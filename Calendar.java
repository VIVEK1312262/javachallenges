import java.util.*;
class Calendar
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String c=sc.nextLine();
String d=c.toLowerCase();
if(d.equals("monday")||d.equals("tuesday")||d.equals("wednesday")||d.equals("thursday")||d.equals("friday")||d.equals("saturday"))
{
System.out.println("True");
}
else if(d.equals("sunday"))
{
System.out.println("False");
}
else
{
System.out.println("Invalid Input");
}
}
}