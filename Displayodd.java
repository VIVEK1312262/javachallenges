import java.util.*;
class Displayodd
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
for(int i=n1;i<=n2;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}