package echoserver;
import java.net.*;
import java.io.*;

public class EchoClient {
  public static void main(String[] args){
      InputStream keyboard = System.in;

      Socket socket = new Socket("127.0.0.1", 6013);

      InputStream input = socket.getInputStream();
      OutputStream output = socket.getOutputStream();

  }
}
