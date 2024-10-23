package throwkeyword;

public class Demo {

    public static void validate(int age){
        if(age<18){
            //throw Arithmetic exception if not eligible to vote  
            throw new ArithmeticException("Not Eligible");
        }
        else{
            System.out.println("Eligible!!");
        }
    }
    public static void main(String[] args) {
        validate(16);
    }
    
}

