package e02_random;

import java.util.Random;

public class Quest_Step06_E10 {
    // 소수인지 아닌지 확인하는 메서드
    public static boolean isPrimeNumber(int n) {
    	
        if(n < 2) {
            return false; // 2보다 작은 수는 소수가 아님
        }
        
        for(int i = 2; i <= n / 2; i++) {
        	
            if(n % i == 0) {
                return false; // 나누어 떨어지면 소수가 아님
            }
            
        }
        
        return true; // 위 조건에 걸리지 않으면 소수
    }

    public static void main(String[] args) {
        // 랜덤수 생성
        Random r = new Random();
        int num = r.nextInt(500); // 0부터 499까지의 숫자 중 하나 생성
        
        if (isPrimeNumber(num)) {
            System.out.println(num + " 숫자는 소수입니다.");
        } else {
            System.out.println(num + " 숫자는 소수가 아닙니다.");
        }
    }
}
