import java.util.*;

class Largestnumber
{

public static void main(String s[])

{
int a,b,c;
Scanner sc=new Scanner(System.in);

a=sc.nextInt();


b=sc.nextInt();

c=sc.nextInt();
if(a>b&&a>c)
System.out.println("the number"+a+"is largest");

else

if(b>a&&b>c)
System.out.println("the number"+b+"is largest");

else
System.out.println("the number"+c+"is largest");


}

}