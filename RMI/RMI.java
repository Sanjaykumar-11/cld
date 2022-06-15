import java.rmi.*;
public interface RMI extends Remote
{
    public int Grade(int a) throws RemoteException;
    public int CalGPA(int[] marks, int[] credits, int num_of_subject) throws RemoteException;
}
