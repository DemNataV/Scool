package Scool;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Петя",10, "химия");
        Student student2 = new Student("Коля",11, "физика");
        Student student3 = new Student("Варя",12, "химия");
        Student student4 = new Student("Лена",10, "литература");
        Student student5 = new Student("Оля",12, "алгебра");

        Teacher teacher1 = new Teacher("Олга Генадьевна",30, "алгебра");
        Teacher teacher2 = new Teacher("Петр Гаврилович",22, "химия");
        Teacher teacher3 = new Teacher("Галина Федоровна",47, "физика");

        Director director1 = new Director("Олег Федорович", 57);
        Director director2 = new Director("Евгений Владимирович", 48);

        School school = new School(director1);
        school.addStudent(student1, student2, student3, student4, student5);
        school.addTeacher(teacher1, teacher2, teacher3);

        school.schoolDay();



    }
}
