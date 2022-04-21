public class JavaDemo {
    public static void main(String args[])  //static method
    {
        System.out.println("Hello Test");
         game(7,2,9);
         int x =1, y=2;
         System.out.println(x>y);
    }

    public static void game(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("The bigger number is" + a);
            }
            else
            {
                System.out.println("the biggest number is " + c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("The biggest number is"+ b);
            }
            else
            {
                System.out.println("The biggest number is"+ c);
            }
        }
    }

}
