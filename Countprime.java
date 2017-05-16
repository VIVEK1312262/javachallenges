import java.util.*;
class Countprime
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int m=0,c;
for(int i=n1;i<=n2;i++)
{
c=1;
for(int j=2;j<=i;j++)
{
if(i%j==0)
{
c++;
}
}
if(c==2)
{
m++;
}
}
System.out.println(m);
}
}