package day8;

import java.util.Arrays;

public class E23_Quest {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){ // arr배열 길이 만큼 반복문 0 ~ 19 까지
            
            int idx = (int)(Math.random() * arr.length); // idx에 랜덤 * 20의 랜덤값을 넣음

            if(i == idx){
                i--;
                continue;
            }
            int temp = arr[i]; // temp에 arr[i] 0 ~ 19 까지의 숫자를 넣음
            arr[i] = arr[idx]; // arr[i] 번째에 arr[idx](랜덤값)을 넣음
            arr[idx] = temp; // arr[idx]에 temp 값을 넣음
            // 반복
        }
        System.out.println(Arrays.toString(arr));
    }
}
