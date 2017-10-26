package echoserver;
import java.net.*;
import java.io.*;

public class EchoClient {
  public static void main(String[] args){
    try{
      //Read bytes
      InputStream keyboard = System.in;

      Socket socket = new Socket("127.0.0.1", 6013);

      InputStream input = socket.getInputStream();
      OutputStream output = socket.getOutputStream();

      int a;
      while ((a = keyboard.read()) != - 1){
        output.write(a);
        System.out.write(input.read());
      }

      keyboard.close();
      socket.close();

      // Handles binary files
      System.out.flush();

    }catch (IOException ioe){
      System.out.println("Exception caught");
      System.err.println(ioe);
  }
 }
}
