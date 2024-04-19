package training;

public class Student {

    private String nim;
    private String name;

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
