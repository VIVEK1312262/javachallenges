import java.util.*;
class Prime
{
public static void main(String s[])
{
int n,count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=2;i<n;i++)
{
if(n%i==0)
{
count++;
break;
}
}
if(count==0)
System.out.println("the number is prime");
else
System.out.println("the number is not prime");
}
}