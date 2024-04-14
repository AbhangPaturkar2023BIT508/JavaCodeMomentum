public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("aaaa");
        s1.display();
    }
}

class Student {
    private String name;

    public Student(String n) {
        name = n;
    }

    // Overloaded constructor with default value
    public Student() {
        this("UNKNOWN");
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
