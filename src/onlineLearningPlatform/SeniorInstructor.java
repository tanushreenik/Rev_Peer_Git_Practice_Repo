package onlineLearningPlatform;

class SeniorInstructor extends Instructor {

    private int mentorBatchCount;
    private String specialization;

    SeniorInstructor(int userId, String name, String subject, int yearsOfExperience,
                     int mentorBatchCount, String specialization) {

        super(userId, name, subject, yearsOfExperience);
        this.mentorBatchCount = mentorBatchCount;
        this.specialization = specialization;
    }

    void reviewContent() {
        System.out.println("Content reviewed by senior instructor");
    }

    void assignInstructorTasks() {
        System.out.println("Tasks assigned to instructors");
    }

    void displaySeniorInstructor() {
        displayUser();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + yearsOfExperience);
        System.out.println("Mentor Batch Count: " + mentorBatchCount);
        System.out.println("Specialization: " + specialization);
    }
}