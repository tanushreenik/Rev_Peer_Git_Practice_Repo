package onlineLearningPlatform;

public class OnlineLearningMain {
    public static void main(String[] args) {

        SeniorInstructor s = new SeniorInstructor(
                101, "Tanu", "Java", 5, 3, "Backend Development"
        );

        s.login();
        s.uploadCourse();
        s.conductSession();
        s.reviewContent();
        s.assignInstructorTasks();

        System.out.println("\nFull Instructor Profile:");
        s.displaySeniorInstructor();
    }
}