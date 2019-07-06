import java.util.Scanner;
class large{
public static void main(String[]args){
Scanner tt= new Scanner(System.in);
int a,b,c;
System.out.println("enter the value of A");
a=tt.nextInt();
System.out.println("enter the value of B");
b=tt.nextInt();
System.out.println("enter the value of C");
c=tt.nextInt();
if(a>b&&a>c)
{
System.out.println("larger value is="+a);
}
else if(b>a&&b>c)
{
System.out.println("larger value is="+b);
}
else
{
System.out.println("larger value is="+c);
}
}
}
