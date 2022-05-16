importmpi.*;
public class Asign2{ 
public static void main(String args[])throws Exception{
mpi.Init(args);
int me = mpi.COMM_WORLD.Rank();
int size =  mpi.COMM_WORLD.Size();
System.out.println("Hi from <"+me+">");
mpi.Finalize();
     }

}
Output:
F:\Ass>javac -cp "C:\Program Files\Java\jdk1.8.0_201\lib\mpj-v0_44\bin\lib\mpj.jar" Ass2.java
F:\Ass>"C:\Program Files\Java\jdk1.8.0_201\lib\mpj-v0_44\bin\mpjrun.bat" -np 4 Ass2
MPJ Express (0.44) is started in the multicore configuration
