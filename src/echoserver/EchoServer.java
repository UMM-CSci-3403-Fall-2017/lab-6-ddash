package echoserver;

import java.net.*;
import java.io.*;

public class EchoServer {
  public static void main(String[] args) {
    try {
      ServerSocket sock = new ServerSocket(6013);

      while (true) {
        Socket client = sock.accept();

        FileInputStream reader = (FileInputStream) client.getInputStream();
        FileOutputStream writer = (FileOutputStream) client.getOutputStream();
        
	int a;

        while ((a = reader.read()) != - 1) {
          writer.write(a);
        }
        client.close();
      }
    } catch (IOException e) {
        System.err.println(e);
    }
  }
}
