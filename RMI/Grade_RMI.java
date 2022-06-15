import java.rmi.*;
import java.rmi.server.*;

public class Grade_RMI extends UnicastRemoteObject implements RMI {
    Grade_RMI() throws RemoteException
    {
        super();
    }
    public int Grade(int a) {
        if (a > 89) {
            return 10;
        }
        else if (a > 79) {
            return 9;
        }
        else if (a > 69) {
            return 8;
        }
        else if (a > 59) {
            return 7;
        }
        else if (a > 49){
            return 6;
        }
        else {
            return 0;
        }
    }
    public int CalGPA(int[] marks, int[] credits, int num_of_subject)
    {
        int gpa = 0;
        int total_credits = 0;
        for(int i=0; i<num_of_subject; i++)
        {
            System.out.println(Grade(marks[i]));
            gpa += Grade(marks[i])*credits[i];
            total_credits+=credits[i];
        }
        return gpa/total_credits;
    }

}
