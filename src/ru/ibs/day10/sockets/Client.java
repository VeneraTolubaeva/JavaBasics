package ru.ibs.day10.sockets;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 1234)) {
            Request request = new Request("Hello, net World!");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(request);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Response response = (Response) ois.readObject();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
