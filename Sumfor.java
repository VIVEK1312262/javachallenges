import java.util.*;
class Sumfor
{
public static void main(String s[])
{
int x,sum=0;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
for(int i=1;i<=x;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}