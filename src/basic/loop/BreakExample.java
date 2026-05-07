package basic.loop;

public class BreakExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            if (i == 5) break;
            System.out.print(i + " "); // 줄 바꿈 없이 가로로 출력
        }

        System.out.println("\n=================================");

        outer:for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) break outer;
                System.out.println(i + "-" + j);
            }
        }


    }

}
