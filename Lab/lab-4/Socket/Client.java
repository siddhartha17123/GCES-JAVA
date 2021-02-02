import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.0.0.41" ,6969);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        output.writeUTF("London is Blue");
        output.flush();
        output.close();

        socket.close();
    }
    
}
