import java.rmi.*;
import java.util.*;
import java.rmi.registry.*;  
public class Client{
    public static void main(String args[]){
        try{

            RMI stub=(RMI)Naming.lookup("rmi://localhost:5000/19it082");
            Scanner input = new Scanner(System.in);

            int[] marks = new int[50];
            int[] credits = new int[50];

            System.out.println("Enter the number of subjects: ");
            int num_of_subject = input.nextInt();

            for(int i=0; i<num_of_subject; i++)
            {
                System.out.print("Mark: ");
                marks[i] = input.nextInt();
                System.out.println("Credit");
                credits[i] = input.nextInt();
            }
            long start = System.currentTimeMillis();
            System.out.println("Your GPA is: "+stub.CalGPA(marks, credits, num_of_subject));
            long end = System.currentTimeMillis();
            System.out.println("Time taken:"+(end-start));
            input.close();
        }
        catch(Exception e){}{
    }
}
}
