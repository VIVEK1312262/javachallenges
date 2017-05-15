import java.util.Scanner;
class Displayarmstrong
{
public static void main(String args[])
{
int temp;
Scanner s1=new Scanner(System.in);
int s=s1.nextInt();
int s2=s1.nextInt();
int rem;
int sum,count=0;
for(int i=s+1;i<s2;i++)
{
temp=i;
sum=0;
while(temp!=0)
{
rem=temp%10;
sum=sum+(rem*rem*rem);
temp=temp/10;
}
if(i==sum)
{
if(count==0)
{
System.out.println("Amstrong number");
}
System.out.println(i);
count++;
}
}
if(count==0)
{
System.out.println("Amstrong number not found");
}
}
}