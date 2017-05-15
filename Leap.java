import java.util.*;

class Leap
{

public static void main(String s[])

{
int n;
Scanner sc=new Scanner(System.in);

n=sc.nextInt();
if((n%4==0)&&(n%100!=0))
System.out.println("this is leap year");

else


if(n%400==0)
System.out.println("this is leap year");

else
if(n%100==0)
System.out.println("this is not leap year");

else
System.out.println("this is not leap year");

}

}