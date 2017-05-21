import java.util.*;
class Reversevowel
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String rev;
StringBuilder input=new StringBuilder();
input.append(s1);
input=input.reverse();
rev=input.toString();
System.out.println(rev);
System.out.println(rev.replaceAll("[aeiouAEIOU]",""));
}
}