import java.io.*;
import java.net.*;
class Server{
public static void main(String[] args) throws IOException{
    ServerSocket ss = new ServerSocket(6969);
    Socket socket = ss.accept();
    DataInputStream msg = new DataInputStream(socket.getInputStream());
    String message = (String)msg.readUTF();

    System.out.println("Fan's are trying to say" +message);
    ss.close();

}
}