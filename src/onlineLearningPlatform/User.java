package onlineLearningPlatform;

class User {

    protected int userId;
    protected String name;

    User() {
    }

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    void login() {
        System.out.println("User logged in");
    }

    void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
}