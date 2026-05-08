package oop.inheritance.domain;

import oop.static_final.LearningLog;

public class PracticeLog extends LearningActivity {

    private int completionRate; // PracticeLog만 가지는 고유한 필드

    public PracticeLog(String title, int minutes, boolean publilcActivity, int completionRate) {
        super(title, minutes, publilcActivity);
        this.completionRate = normalizeCompletionRate(completionRate);
    }

    @Override
    public void printSummary() {
        System.out.println("[실습] #" + getId() + " " + getTitle() + " - " + getMinutes()
                + "분 - 완료율: " + completionRate + "%");
    }

    @Override
    public boolean needsReview() {
        return getMinutes() < 60 || completionRate < 70;
    }

    public int getCompletionRate() {
        return completionRate;
    }

    private int normalizeCompletionRate(int completionRate) {
        if(completionRate < 0) {
            return 0;
        }

        if(completionRate > 100) {
            return 100;
        }

        return completionRate;
    }

}
