ReverseImpl.java
import ReverseModule. ReversePOA;
import java.lang.String;

class ReverseImpl extends ReversePOA
{
ReverseImpl()

{
super(); System.out.println("Reverse Object Created");
}
public String reverse_string(String name)
{
StringBufferstr=new StringBuffer (name):
str.reverse();
return (("Server Send +str));
}
}

ReverseServer.java
import org.omg.CosNaming.NamingContextPackage.":
import org.omg.CORBA.*;
Import org.omg. PortableServer.*;

class ReverseServer
{

public static void main(String[] args)
{

try
{

// initialize the ORB
org.omg.CORBA.ORBorb  org.omg.CORBA.ORB. Entt(args, null);

// initialize the BOA/POA

POArootPOA = POAHelper.narrow(orb.resolve_inttial_references ("Root POA")); rootPOA.the_POAManager ().activate();

// creating the calculator object.
ReverseImplrvr = new ReverseImpl();

// get the object reference from the servant class
org.omg.CORBA.Object ref rootPDA.servant_to_reference(rvr);

System.out.println("Step1");
Reverse h_refReverseModule. ReverseHelper.narrow(ref);

System.out.println("Step2");
org.omg.CORBA. Object objReforb.resolve_inittal_references("NameService");

System.out.println("Step3");
NamingContextExtncRef Naming ContextExtHelper.narrow(objRef);
System.out.println("step4");
String name = "Reverse";
NameComponent path[] ncRef.to_name(name);
ncRef.rebind (path,h_ref);

System.out.println("Reverse Server reading and waiting....");
orb.run();
}
catch(Exception e) ()
{

e.printStackTrace();
}
} 

ReverseModule.idle
moduleReverseModule
{
interface Reverse
{
stringreverse_string(in string str);
};
};

ReverseClient.java
importReverseModule.*;

importorg.omg.CosNaming.*;
importorg.omg.CosNaming.NamingContextPackage.*;
importorg.omg.CORBA.*; 
import java.io.*;

classReverseClient
{
public static void main(string args[])
{
Reverse ReverseImpl=null;

try
{
// initialize the ORS 
org.omg.CORBA.ORB orb=org.omg.CORBA.ORBinit(args,null);

org.omg.CORBA.ObjectobjRef=orb.resolve_initial_references("NameService"); NamingContextExtncRef= NamingContextExtHelper.narrow(objRef);

stringnane "Reverse";

ReverseImpl= ReverseHelper.narrow(ncRef.resolve_str(name));

System.out.println("Enter String"); 
BufferedReaderbr new Bufferedieader(new InputStreamReader(System.in)); 
stringstr=brreadLine();

stringtenpstr=ReverseImpl.reverse_string(str);

System.out.println(tempstr).
}
catch(Exception e)
{
e.printStackTrace():
}
}
}
