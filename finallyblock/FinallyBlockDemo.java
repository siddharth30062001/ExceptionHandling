package finallyblock;

public class FinallyBlockDemo {

    public static void main(String[] args) {
        
     
       // System.exit(0);   In these case finally block will not execute
        
        try{
            System.out.println(10/0);
        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        finally{
            System.out.println("Finally Block Run");
        }
    
    }
    
}
