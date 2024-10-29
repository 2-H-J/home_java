import java.util.Scanner;

public class Quest1 {
/*
	문제 1
	다음 코드는 숫자를 하나 입력 받아서 입력 받은 숫자의 약수 목록과 완전수 인지 아닌지 출력하는 프로그램이다.
	해당 프로그램이 문제가 있어서 동작되지 않으므로 어떤 문제가 발생하였는지 원인을 쓰고, 해당 문제를 수정한 부분을 제출하세요.
	
	※완전수란 자기 자신을 제외한 약수들을 더한 결과가 자기 자신 숫자인 경우다, 
	대표적으로 숫자 6이 완전수 인데, 숫자 6의 약수가 1, 2, 3, 6 인데 자기 자신 숫자를 제외한 약수 합이 6이 되므로 이런 숫자를 완전수라고 한다.
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수하나를 입력하세요: ");

//        int num = scanner.nextDouble(); scanner 타입이 num의 변수 타입과 다름
        int num = scanner.nextInt();

//        int sum; sum의 초기값이 존재 하지 않아서 몇부터 숫자가 들어가는지 파악하지 못함
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {

//            	if (num % 1 == 0) { 완전수 약수를 구할때 나머지 1이 아닌 i를 넣으면 된다
            if (num % i == 0) {

                sum += i;

            }

        }
//        	if (sum == num) { 조건식이 완전수를 따진다면 !=이 아니라 ==으로 비교해야 한다
        if (sum == num) {
        	
        	System.out.println(num + "은(는) 완전수입니다.");
        } else {
        	
        	System.out.println(num + "은(는) 완전수가 아닙니다.");
        }


    }

}

