package trycatchblock;

class Demo {

    public static void main(String[] args) {
        
        int a=10;
        int b=0;
        int data;

        try{
            data =a/b;
            System.out.println(a+b+2);
        }
        catch(Exception e){
            System.out.println("Not divide by Zero"); //custom message
            System.out.println(a+b+2);
            
        }

        data=a;
        System.out.println(data);
    }
    
}
