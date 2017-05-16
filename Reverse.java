import java.util.*;
class Reverse
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2="";
for(int i=s1.length()-1;i>=0;i--)
{
s2+=s1.charAt(i);
}
System.out.println(s2);
}
}