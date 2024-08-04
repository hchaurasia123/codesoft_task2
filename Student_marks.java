import java.util.Scanner;

/**
 * Student_marks
 */
public class Student_marks {

   

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many input your subject");
        int amountsubject=sc.nextInt();
        int totalmarks=0;
        for(int i=0; i<amountsubject; i++){
            System.out.println("Enter the Marks Only 100 out of marks    Subject  " + (i+ 1) );
            int  marks=sc.nextInt();
            totalmarks+=marks;

        }

     float avg=totalmarks/amountsubject;

     
    
     if(avg>90){
        System.out.println("Grade A");
     }else if(avg<90 && avg>75){
        System.out.println("Grade B");
     }else if(avg<75 && avg>60){
        System.out.println("Grade C");
     }else if(avg<60 && avg>40){
        System.out.println("fail");
         
     }else{
        System.out.println("Invalid Number");
     }

    }
}