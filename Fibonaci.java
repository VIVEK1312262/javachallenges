import java.util.Scanner;
class Fibonaci
{
public static void main(String args[])
{
Scanner s1=new Scanner(System.in);
int s=s1.nextInt();
int a=0;
int b=1;
int fib=0;
for(int i=0;i<s;i++)
{
fib=fib+a;
a=b;
b=fib;
System.out.print(fib+" ");
}
}
}