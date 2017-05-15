import java.util.*;
class Palindrome
{
public static void main(String s[])
{
int n,m,sum=0,temp;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n!=0)
{
m=n%10;
sum=(sum*10)+m;
n=n/10;
}
if(temp==sum)
System.out.println("the number is palindrome");
else
System.out.println("the number is not palindrome");
}
}