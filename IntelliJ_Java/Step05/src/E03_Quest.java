public class E03_Quest {
    public static void main(String[] args) {
        // 구구단 2 ~ 9단

        for (int i = 2; i <= 9; i++){
            System.out.println(i+" 단");
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
            System.out.println();
        }

        System.out.println("---------");
        // 짝수로만 출력

        for(int i = 2; i <= 9; i++){
            System.out.println(i+" 단");
            if(i % 2 == 0){
                for(int j = 1; j <= 9; j++){
                    if(j % 2 == 0){
                        System.out.printf("%d x %d = %d \n",i,j,i*j);
                    }

                }
            }
            System.out.println();
        }

        System.out.println("---------");
        // 홀수로만 출력
        for(int i = 2; i <= 9; i++){
            System.out.println(i+" 단");
            if(i % 2 == 1){
                for(int j = 1; j <= 9; j++){
                    if(j % 2 == 1){
                        System.out.printf("%d x %d = %d \n",i,j,i*j);
                    }

                }
            }
            System.out.println();
        }
        System.out.println("-----------");
        // while

        int i = 2;
        int j = 1;
        while (i <= 9){
            System.out.println(i+" 단");
            while (j <= 9) {
                System.out.printf("%d x %d = %d \n", i, j, i * j);
                j++;

            }
            j = 1;
            System.out.println();
            i++;
        }

    }
}
