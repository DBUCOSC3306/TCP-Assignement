import java.io.*;
import java.net.*;


public class TCPClient 
{
//------------------------------------------------------------------
    public static void main(String[] args) throws Exception
    {
        TCPClient CLIENT = new TCPClient();
        CLIENT.run();
    }
//------------------------------------------------------------------
    public void run() throws Exception
    {
        Socket SOCK = new Socket("localhost",1025);
        PrintStream PS = new PrintStream(SOCK.getOutputStream());
        PS.println("Hello to SERVER from CLIENT.");
        
        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        
        String MESSAGE = BR.readLine();
        System.out.println(MESSAGE);
    }
}
