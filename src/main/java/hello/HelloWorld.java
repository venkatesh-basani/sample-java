package hello;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        // Create HTTP server on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        
        // Create context for root path
        server.createContext("/", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                String response = "<h1>Hello World from Java Web Server! Welcome softility</h1>";
                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        
        // Start the server
        server.start();
        System.out.println("Server started on port 8080. welcome");
        
        // Keep server running
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
