package trycatchblock;

public class Demo2 {

    public static void main(String[] args) {
        
        try{
            int a[]=new int[5];
            a[6]=50/0;
        }
        // catch(ArithmeticException e){
        //     System.out.println("Arithmetic Exception ");
        // }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Array out of Bound");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception ");
        }
        System.out.println("code run sucessfully");

    }
    
}
