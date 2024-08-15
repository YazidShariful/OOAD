public class ArgProg
{
public static void main (String[] a) {
    System.out.println("Number of arguments passed : " +a.length);
    if(a.length==0)
    System.out.println("Welcome to Java") ;
    else
    System.out.println("This is the first Java program of "
                        +a[0]);
    for (int i=0 ; i <= a.length ; i++)
    {
        System.out.println("Argument passed : "+a[i]);
    }
    }
}