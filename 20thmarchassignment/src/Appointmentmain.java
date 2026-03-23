import java.util.*;

class AppointmentMain {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ravi");
        list.add("Anita");
        list.add("Ravi");
        list.add("Kiran");

        System.out.println("Appointments: " + list);

        list.add(1, "Emergency Patient");
        System.out.println("After emergency: " + list);

        list.set(2, "Updated Name");
        System.out.println("After update: " + list);

        list.remove("Kiran");
        System.out.println("After remove: " + list);

        System.out.println("Exists Ravi: " + list.contains("Ravi"));

        System.out.println("Total: " + list.size());

        System.out.println("First Ravi: " + list.indexOf("Ravi"));
        System.out.println("Last Ravi: " + list.lastIndexOf("Ravi"));

        for(String name : list){
            System.out.println(name);
        }

        list.clear();
        System.out.println("After clear: " + list);
    }
}