/*
* 接受发送的收据， 并且存放到 本地
* */

package Basic8_Internet.test3_TCp.test5_exercise5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test5_reciever {
    public static void main(String[] args) throws IOException {
        // create the server socket
        ServerSocket ss = new ServerSocket(12345);
        // listen and return a socket
        Socket s = ss.accept();

        // get the data , 一次接受一个string
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // 写入文件， 也是用buffer stream 写入
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("01Module\\files\\tcps.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            bufferWriter.write(line);
            bufferWriter.newLine();
            bufferWriter.flush();
        }

        bufferWriter.close();
        ss.close();
    }
}
