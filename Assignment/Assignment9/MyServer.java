import java.net.*;
import java.io.*;
class MyServer{
    public static void main(String[] args) throws IOException{

        ServerSocket ss = new ServerSocket(1111);
        Socket socket = ss.accept();
        DataInputStream input = new DataInputStream(socket.getInputStream());
        String msg = (String)input.readUTF();

        System.out.println("So the message from client is " + msg);
        ss.close();


    }
}