package Scool;

public class Student
        extends People
        implements CanEnhanceKnowledge{
    String discipline;
    int level = 0;

    public Student(String name, int age, String discipline) {
        super(name, age);
        setDiscipline(discipline);
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "discipline='" + discipline + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void enhanceKnowledge() {
        level = level + (int) (Math.random()*10);
        System.out.println(toString());

    }
}
