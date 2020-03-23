package Scool;

public class Teacher
        extends People
        implements CanTeach{
    String discipline;

    public Teacher(String name, int age, String discipline) {
        super(name, age);
        setDiscipline(discipline);
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public void teach(Student student) {
        System.out.println(name + " учит ученика " + student.name);
    }
}
