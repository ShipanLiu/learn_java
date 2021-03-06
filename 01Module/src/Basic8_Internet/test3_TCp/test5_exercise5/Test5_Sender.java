/*
* 发送本地的文件
* */

package Basic8_Internet.test3_TCp.test5_exercise5;

import java.io.*;
import java.net.Socket;

public class Test5_Sender {
    public static void main(String[] args) throws IOException {
        // create socket
        Socket s = new Socket("shipan", 12345);
        // create reader and writer
        BufferedReader reader = new BufferedReader(new FileReader("01Module\\files\\tcp.txt"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //send
        String line;
        while((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
            writer.flush();
        }

        reader.close();
        s.close();
    }
}
