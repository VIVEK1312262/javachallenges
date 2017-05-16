import java.util.*;
class Reverseint
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int sum=0,r;
while(s1!=0)
{
r=s1%10;
sum=(sum*10)+r;
s1=s1/10;
}
System.out.println(sum);
}
}
