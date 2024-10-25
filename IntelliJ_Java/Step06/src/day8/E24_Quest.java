package day8;

import java.util.Arrays;
import java.util.Scanner;

public class E24_Quest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        int start = 0, end = arr.length-1;
        while (start <= end){
            // 숫자 입력
            System.out.print("숫자 입력 > ");
            int n = sc.nextInt();
            // 홀짝 판단해서 저장
            if(n % 2 == 1){
                arr[start++] = n;
            }else {
                arr[end--] = n;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
