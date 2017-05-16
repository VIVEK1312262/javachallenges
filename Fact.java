import java.util.Scanner;
class Fact
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int s=s1.nextInt();
int fact=1;
for(int i=1;i<=s;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}