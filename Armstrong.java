import java.util.Scanner;
class Armstrong
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int s=s1.nextInt();
int s2=s;
int rem;
int sum=0;
while(s>0)
{
rem=s%10;
sum=sum+(rem*rem*rem);
s=s/10;
}
if(s2==sum)
System.out.println("Amstrong number");
else
System.out.println("Not amstrong number");
}
}