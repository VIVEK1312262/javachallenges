import java.util.*;
class Digits
{
public static void main(String s[])
{
int x,sum=0,i=1;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
while(x!=0)
{
sum=sum+i;
x=x/10;
}
System.out.println(sum);
}
}