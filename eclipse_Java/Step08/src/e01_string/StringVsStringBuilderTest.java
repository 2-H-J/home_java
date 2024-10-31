package e01_string;

public class StringVsStringBuilderTest {
	
    public static void main(String[] args) {
        // 반복 횟수 설정
        int iterations = 100_000; 

        // String 테스트
        long stringStartTime = System.currentTimeMillis(); // 시작 시간 측정
        String str = "";
        for (int i = 0; i < iterations; i++) {
            str += "a"; // 문자열을 반복적으로 더하기
        }
        long stringEndTime = System.currentTimeMillis(); // 종료 시간 측정
        long stringDuration = stringEndTime - stringStartTime;
        System.out.println("String 시간: " + stringDuration + " ms");

        // StringBuilder 테스트
        long stringBuilderStartTime = System.currentTimeMillis(); // 시작 시간 측정
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("a"); // 문자열을 반복적으로 더하기
        }
        long stringBuilderEndTime = System.currentTimeMillis(); // 종료 시간 측정
        long stringBuilderDuration = stringBuilderEndTime - stringBuilderStartTime;
        System.out.println("StringBuilder 시간: " + stringBuilderDuration + " ms");

        // 결과 비교
        System.out.println("StringBuilder가 String보다 약 " + (stringDuration / (double) stringBuilderDuration) + "배 빠릅니다.");
    }
}
