import java.util.*;

public class SkillManagementMain {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("SQL");
        hashSet.add("Spring Boot");
        hashSet.add("Java");
        hashSet.add("React");
        hashSet.add("Docker");
        hashSet.add("SQL");
        hashSet.add("AWS");

        System.out.println("HashSet: " + hashSet);

        System.out.println("React exists: " + hashSet.contains("React"));

        hashSet.remove("Docker");

        System.out.println("Size: " + hashSet.size());

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>(hashSet);
        System.out.println("LinkedHashSet: " + linkedSet);

        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);

        HashSet<String> extra = new HashSet<>();
        extra.add("Python");
        extra.add("Java");

        hashSet.addAll(extra);
        System.out.println("After addAll: " + hashSet);

        hashSet.retainAll(extra);
        System.out.println("After retainAll: " + hashSet);

        hashSet.clear();
        System.out.println("After clear: " + hashSet);
    }
}