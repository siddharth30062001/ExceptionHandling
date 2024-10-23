package finallyblock;

class PractiseDemo {

    public static void main(String[] args) {
        
        System.out.println("Hello");
        try{
        System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("siddharth");
    }
    
}
