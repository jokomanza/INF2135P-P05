package training;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("19001", "John Doe");
        System.out.println("NIM: " + student.getNim());
        System.out.println("Name: " + student.getName());

        student.setNim("19002");
        student.setName("Jane Doe");
        System.out.println("NIM: " + student.getNim());
        System.out.println("Name: " + student.getName());
    }
}


