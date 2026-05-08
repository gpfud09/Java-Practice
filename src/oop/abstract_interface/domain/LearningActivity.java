package oop.abstract_interface.domain;

public abstract class LearningActivity {

    private static int totalCreateCount = 0;

    private final long id;
    private String title;
    private int minutes;
    private boolean publicActivity;

    LearningActivity(String title, int minutes) {
        this(title, minutes, true);
    }

    LearningActivity(String title, int minutes, boolean publicActivity) {
        totalCreateCount++;
        this.id = totalCreateCount;
        this.title = normalizeTitle(title);
        this.minutes = minutes;
        this.publicActivity = publicActivity;
    }

    public void extendStudy(int additionalMinutes) {
        if(additionalMinutes <= 0) {
            System.out.println("잘못된 공부 시간입니다.");
            return;
        }
        this.minutes += additionalMinutes;
    }
    
    public void changeTitle(String newTitle) {
        this.title = normalizeTitle(newTitle);
    }

    private static String normalizeTitle(String newTitle) {
        if(newTitle == null || newTitle.isBlank()) {
            return "제목 없음";
        }
        return newTitle;
    }

    public void openToPublic() {
        this.publicActivity = true;
    }

    public void hideFromPublic() {
        this.publicActivity = false;
    }

    // 추상메서드는 메서드 바디가 없는 메서드의 틀 역할을 한다.
    // 특정 메서드는 부모가 대충 정해버리는 것보다, 자식이 반드시 자기 방식대로 구현하게 하는 편이 명확할 때가 있다.
    // 추상메서드는 자식에게 물려질 때 오버라이딩을 강제한다. 반드시 구현해야 한다.
    public abstract void printSummary();

    public static int getTotalCreateCount() {
        return totalCreateCount;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getMinutes() {
        return minutes;
    }

    public boolean isPublicActivity() {
        return publicActivity;
    }
}
