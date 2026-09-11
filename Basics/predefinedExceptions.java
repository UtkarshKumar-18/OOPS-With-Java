import java.util.Scanner;

public class predefinedExceptions {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        int i,b;
        Scanner sc= new Scanner(System.in);
        try{
        i=sc.nextInt();
        b=sc.nextInt();
        System.out.println(arr[i]);
        System.out.println(arr[i]/b);
        }
    catch(ArithmeticException e)
    {System.out.println("Exception caught is"+e.getMessage());}
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception caught is"+e.getMessage());
    }
    finally{
        
        System.out.println("finally executed");
    }

}
}