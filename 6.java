Publisher.java
importjavax. jms.*;
public class Publisher 
{
private static String url= ActiveMQConnection.DEFAULT_BROKER_URL;
public static void main(String[] args) throws JMSException {
ConnectionFactoryconnectionFactory new ActiveMQConnectionFactory(url);
Connection connection =connectionFactory.createConnection();
connection.start();
Session session= connection.createSession( false, Session.AUTO_ACKNOWLEDGE);
Topic topic= session.createTopic("testt");
MessageProducer producer =session.createProducer(topic);
TextMessage message= session.createTextMessage();
message.setText(" ….WORLD");
producer.send(nessage);
System.out.println("Sent message “+message.getText()+” ” );
connection.close();
}
}
Subscriber.java
importjava.io.IOException:
public class Subscriber (
private static String url=ActiveMQConnection.DEFAULT_BROKER_URL;
public static void main(String] args) throws Exception (
ConnectionFactoryconnectionFactory =new ActiveMQConnectionFactoryt(url);
 Connection connection = connectionFactory.createConnection();
Connection.start();
Session session=connection.createSession(false,Session.AUTO_ACNOWLEDGE);
Topic topic =session.createTopic(“test”);
MessageConsumer consumer=session.createConsumer(topic);
MessageListener listener =new MessageListener()
{
Public void onMessage(Message message)
{
try (
if (message instanceofTextMessage) {
TextMessageteachMessage=(TexMessage) message;
System.out.println(“ Received message”+ textMessage.getText()+””);
}
}catch (Exception e)
{
System.out.println(“caught:”+e);
e.printStackTrace();
}
}
};
consumer.setMessageListener(listener);
try
{
System.in.read();
}
Catch(IOException e)
{
e.printStackTrace();
}
Connection.close();
}
}
