Client.java
import java.io.*;
import java.net.*;
public class Client {
private static Socket socket;
public static void main(String args[])
    {
	try {
		String host="localhost";
		int port=25000;
		InetAddress address=InetAddress.getByName(host);
		socket=new Socket(address,port);
		//send the message to the server
		OutputStreamos=socket.getOutputStream();
		OutputStreamWriterosw=new OutputStreamWriter(os);
		BufferedWriterbw=new BufferedWriter(osw);
		String num="2";
		String msgToBeSend=num+"\n";
		bw.write(msgToBeSend);
		bw.flush();
		System.out.println("Message sent to the server is "+msgToBeSend);
		//Reading response which is get from server.
		
		InputStream is=socket.getInputStream();
		InputStreamReaderisw=new InputStreamReader(is);
		BufferedReaderbr=new BufferedReader(isw);
		String msg=br.readLine();
		System.out.println("Message received from server is "+msg);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
		socket.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    }
}
Server.java
import java.io.*;
import java.net.*;
public class Server {
	private static Socket socket;
public static void main(String args[])
    {
	try
	{
		int port=25000;
		ServerSocketscobj=new ServerSocket(port);
		System.out.println("Server started and listening to the port"+port);
		while(true)
		{
			socket=scobj.accept();
			//Reading the message from socket which is sent by client .
			InputStream is=socket.getInputStream();
			InputStreamReaderisr=new InputStreamReader(is);
			BufferedReaderbr=new BufferedReader(isr);
			String numberToBeRec=br.readLine();
			System.out.println("Message to be received is "+numberToBeRec);
			String msgToBeReturn;
			try
			{
				intnumInInt=Integer.parseInt(numberToBeRec);
				intreturnMsg=numInInt*2;
				msgToBeReturn=String.valueOf(returnMsg)+"\n";
			}catch(NumberFormatException e)
			{
msgToBeReturn="Please enter the number in proper formate\n";
			}
			//Sending response back to the client.
			OutputStreamos =socket.getOutputStream();
			OutputStreamWriterosw=new OutputStreamWriter(os);
			BufferedWriterbw=new BufferedWriter(osw);
			bw.write(msgToBeReturn);
System.out.println("Message is sent to the client is "+msgToBeReturn);
			bw.close();	
	}
	}catch(Exception e) {
		
		e.printStackTrace();
	}
	finally
	{
		try
		{
			socket.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
    }
}
