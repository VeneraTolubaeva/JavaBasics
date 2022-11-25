package ru.ibs.day10.sockets;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(1234)) {
            Socket socket = server.accept();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Request request = (Request) ois.readObject();
            System.out.println("Request: " + request);

            Response response = new Response("Server says: " + request.payload);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
