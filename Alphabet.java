import java.util.*;

class Alphabet
{

public static void main(String s[])

{

char c;
Scanner sc=new Scanner(System.in);

c=sc.next().charAt(0);

if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))

System.out.println("alphabet");

else


System.out.println("not alphabet");


}

}