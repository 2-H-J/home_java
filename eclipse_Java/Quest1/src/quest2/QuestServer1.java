package quest2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class QuestServer1 {

    public static void main(String[] args) {
    	final int PORT = 9999;

        try (ServerSocket server = new ServerSocket(PORT);
        		Socket clientSocket = server.accept();) {//server.accept();

            System.out.println("서버가 시작되었습니다. 클라이언트의 접속을 대기합니다...");

            System.out.println("클라이언트가 접속했습니다.");

            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            int number = Integer.parseInt(br.readLine());
            System.out.println("클라이언트로 부터 입력받은 값 :"+number);

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
