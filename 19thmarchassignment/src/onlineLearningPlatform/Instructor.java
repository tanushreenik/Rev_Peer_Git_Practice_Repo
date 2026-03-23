package onlineLearningPlatform;

class Instructor extends User {

    protected String subject;
    protected int yearsOfExperience;

    Instructor(int userId, String name, String subject, int yearsOfExperience) {
        super(userId, name);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    void uploadCourse() {
        System.out.println("Course uploaded for subject: " + subject);
    }

    void conductSession() {
        System.out.println("Session conducted for subject: " + subject);
    }
}