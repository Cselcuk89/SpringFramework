package org.Selcuk.loosely_coupled;

public class CydeoApp {
    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        MentorAccount mentorAccount = new MentorAccount(fullTimeMentor);
        mentorAccount.manageAccount();
    }
}
