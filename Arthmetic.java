import java.util.Scanner;
class Arthmetic
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     int a,b,add,sub,div,mod,mul;
     System.out.println("a=");
     a=sc.nextInt();
     System.out.println("b=");
     b=sc.nextInt();
     add=a+b;
     System.out.println("add="+add);
     sub=a-b;
     System.out.println("sub="+sub);
     div=a/b;
     System.out.println("div="+div);
     mod=a%b;
     System.out.println("mod="+mod);
     mul=a*b;
     System.out.println("mul="+mul);
   }
}     
