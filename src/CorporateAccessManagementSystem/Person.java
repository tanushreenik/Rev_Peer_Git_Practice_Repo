package CorporateAccessManagementSystem;

class Person {

    int personId;
    String name;

    Person(int personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    void displayPersonInfo() {
        System.out.println(personId + " " + name);
    }
}