package basic.loop;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            // for문에서 continue는 증감식이 실행됨.
            if (i == 5) continue;
            System.out.print(i + " "); // 줄 바꿈 없이 가로로 출력
        }

        System.out.println("\n=================================");

        int n = 1;
        while(n <= 10) {
            // while문에서 continue는 조건식으로 흐름이 이동함.
            // 해당 while문은 증감하지 못해 무한 루프.
            if (n == 5) continue;
            System.out.print(n + " ");
            n++;
        }
        System.out.print("\n반복문 종료");

    }

}
