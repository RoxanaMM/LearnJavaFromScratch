package testingDesignPatterns.behavioural.observator;

import java.util.List;

import java.util.ArrayList;

public class FacultyPublisher implements Faculty{

    private List<Student>studentList = new ArrayList<Student>();

    @Override
    public void addAsStudent(Student student) {
        System.out.println("Stundet added");
        studentList.add(student);
    }

    @Override
    public void expel(Student student) {
        System.out.println("Stundet expelled");
        studentList.remove(student);
    }

    @Override
    public void notifyStudents(Message message) {
        for(Student student : studentList){
            student.update(message);
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
