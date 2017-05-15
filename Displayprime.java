import java.util.*;
class Displayprime
{
public static void main(String s[])
{
int count=0;
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
for(int i=n1;i<=n2;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
{
System.out.println(i);
}
}
}
}