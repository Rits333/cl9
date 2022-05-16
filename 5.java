CalculatorWS.java
packageorg.me.calculator;
importjavax.JwsWebService;
importjavax.jws. WebMethod;
importjavax.jws.WebParan;  
importjavax.ejb.Stateless;

@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS
{
@WebMethod(operationName = "add") 
publicint add(@WebParam(name="i") int i,@WebParam(name ="j") int j)
{
int k = i+j;
return k;
}
}

CalculatorWS_Client_Application.java
packagecalculators_client_application;
public class CalculatorWS_Client_Application {

public static void main(String[] args) 
{

try
{
int i = 3:
int j=4;
int result =add(I,j);
system.out.println(“ Result =”+result);
}catch(Exception e)
{
system.out.println(“Exception=”+e);

}
}
private static int add(int i ,int j)
 {
org.me.calculator.CalculatorWS_Service service =new org.me.calculator.CalculatorWS.Service();
org.me.calculator. CalculatorWSport=service.getCalculatorWSPort();
returnport.add(i,j);
}
}

