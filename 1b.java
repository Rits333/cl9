AddClient.java
importjava.rmi.*;
public class AddClient {
	public static void main(String args[])
	{
		try
		{
			String AddServerUrl="rmi://"+args[0]+"/addserver";
			AddServerIntfobj=(AddServerIntf)Naming.lookup(AddServerUrl);
			System.out.println("The first number is: " +args[1]);
			double d1 = Double.valueOf(args[1]).doubleValue();
			System.out.println("The second number is: " +args[2]);
			double d2 = Double.valueOf(args[2]).doubleValue();
			System.out.println("The sum is: " +obj.add(d1, d2));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
AddServer.java
import java.net.*;
importjava.rmi.*;
public class AddServerr {
	public static void main(String args[])
	{
		try
		{
		AddServerImpladdServerImpl=new AddServerImpl();
		//binds it to RMI Registry by lookup name as "addserver".
		Naming.rebind("addserver", addServerImpl);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
AddServerImpl.java
importjava.rmi.*;
importjava.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	publicAddServerImpl() throws RemoteException
	{
	}
	public double add(double d1, double d2) throws RemoteException
	{
		return d1+d2;
	}
}                   
AddServerIntf.java
importjava.rmi.*;
importjava.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf
{
	publicAddServerImpl() throws RemoteException
	{
	}
	public double add(double d1, double d2) throws RemoteException
	{
		return d1+d2;
	}
}
