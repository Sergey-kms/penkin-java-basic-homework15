package ru.penkin.java.basic.homework15.server;

public class ServerApplication {    // vetka1 dz15
    public static void main(String[] args) {
        Server server = new Server(8189);
        server.start();
    }
}