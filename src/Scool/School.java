package Scool;

public class School {
    final String name = "Средняя школа";
    Student[] students = new Student[100];
    Teacher[] teachers = new Teacher[100];
    Director director;



    public School(Director director) {
        this.director = director;
    }



    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void addStudent(Student newStudent) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;


            }

        }
    }

    public void addStudent(Student... newStudents) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                for (int j = 0; j < newStudents.length; j++) {

                    students[i + j] = newStudents[j];
                    System.out.println(students[i+j].name);


                }
                break;
            }
        }
    }

    public void addTeacher(Teacher newStudent) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = newStudent;


            }

        }
    }

    public void addTeacher(Teacher... newTeachers) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null){

            for (int j = 0; j < newTeachers.length; j++) {

                    teachers[i + j] = newTeachers[j];
                System.out.println(teachers[i+j].name);



            }
break;
            }
        }
    }

    void schoolDay(){
        director.beginClass();
        for (int i = 0; i < teachers.length; i++) {

            if (teachers[i] != null) {
                for (int j = 0; j < students.length; j++) {
                    if (students[j] != null) {
                        if (teachers[i].discipline.equalsIgnoreCase(students[j].discipline)) {
                            teachers[i].teach(students[j]);
                            students[j].enhanceKnowledge();
                        }

                    }
                }

            }

        }
        director.endClass();

    };
}
