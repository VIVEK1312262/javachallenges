import java.util.*;
class Camelcase
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String result="";
char firstChar=input.charAt(0);
result=result+Character.toUpperCase(firstChar);
for(int i=1;i<input.length();i++)
{
char current=input.charAt(i);
char previous=input.charAt(i-1);
if(previous==' ')
{
result=result+Character.toUpperCase(current);
}
else
{
result=result+Character.toLowerCase(current);
}
}
System.out.println(result);
}
}