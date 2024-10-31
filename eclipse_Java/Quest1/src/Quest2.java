public class Quest2 {

    public static void main(String[] args) {

//정수형 배열 길이가 10인 배열을 생성하고 숫자 1~50중 랜덤하게 채움

//        int[] arr = new int[9]; 길이가 10인 배열 길이를 생성하려면 9가 아니라 10
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 20) + 1; // 1부터 50의 랜덤수는 *20이 아니라 50
            arr[i] = (int)(Math.random()*50)+1;
            System.out.print(arr[i]+" : ");
        }

//홀수의 개수 출력

        int oddCount = 0;

//        	for (int i = 0; i < arr.length; i++) { 인덱스는 개수는 -1 이기 때문에 조건식 <= 에서 =은 빼야 한다 
        for (int i = 0; i < arr.length; i++) {

//            	if (arr[i] % 2 != 1) { 홀수 개수 조건은 나누기 2 == 1
            if (arr[i] % 2 == 1) {

                oddCount++;

            }

        }

        System.out.println("홀수의 개수: " + oddCount);
        

    }

}