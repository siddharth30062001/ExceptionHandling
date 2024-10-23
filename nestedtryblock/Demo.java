package nestedtryblock;

public class Demo {

    public static void main(String[] args) {
        
        try{

            try{
                System.out.println(13/0);
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }

            try{
                int []a={1,2,3};
                System.out.println(a[5]);
            }
            catch(ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
