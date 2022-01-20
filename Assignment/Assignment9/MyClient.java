import java.io.*;
import java.net.*;
class MyClient{
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("127.3.4.5", 1111);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());

        output.writeUTF("Yahoo i finally practice Client server program");
        output.flush();
        output.close();

        socket.close();

    }  
}