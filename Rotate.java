import java.util.*;
class Rotate
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int k=sc.nextInt();
ArrayList<Integer>b=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
b.add(a[i]);
}
Collections.rotate(b,k);
System.out.println(b);
}
}