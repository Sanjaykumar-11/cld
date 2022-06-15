import java.rmi.*;
public class Server{
    public static void main(String args[]){
        try
        {
            RMI stub=new Grade_RMI();
            Naming.rebind("rmi://localhost:5000/19it082",stub);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}