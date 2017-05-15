import java.util.*;

class Vowels
{

public static void main(String s[])

{

char c;
Scanner sc=new Scanner(System.in);

c=sc.next().charAt(0);

if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')

System.out.println("VOWEL");

else


System.out.println("CONSONANT");


}

}