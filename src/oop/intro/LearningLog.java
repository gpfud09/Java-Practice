package oop.intro;

// 객체 생성을 위한 설계도 클래스에는 main 메서드를 작성하지 않음.
public class LearningLog {

    // 객체의 속성 : 필드(field)
    String title;
    int minutes;
    boolean publicLog;

    void printSummary() {
        System.out.println(title + " - " + minutes + "분");
    }

    boolean needsReview() {
        return minutes < 60;
    }
}
