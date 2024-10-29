package quest1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestServer1 {

    public static void main(String[] args) {
        final int PORT = 9999;

        try (ServerSocket server = new ServerSocket(PORT);) {

            System.out.println("서버가 시작되었습니다. 클라이언트의 접속을 대기합니다...");

            Socket clientSocket = server.accept();
            System.out.println("클라이언트가 접속했습니다.");

            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);

            int number = Integer.parseInt(br.readLine());

            long factorialResult = factorial(number);

            pw.println(factorialResult);

            br.close();
            pw.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static long factorial(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }
}
