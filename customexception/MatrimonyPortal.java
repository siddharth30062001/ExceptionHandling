package customexception;

import java.util.Scanner;

class MatrimonyPortal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();

        if(age>21){
            System.out.println("Get Married , Stay Happy!!");
        }
        else{

            try{
            throw new AgeInvalidException("Patience");
            }
            catch(AgeInvalidException e){
                System.out.println(e.getMessage());
            }

            }
        }

    }
    

