package testingDesignPatterns.behavioural.observator;

public class MainTestingObserver {
    public static void main(String...args){
        FacultyPublisher facultyPublisher = new FacultyPublisher();
        Student student = new SpecificStudent1();
        facultyPublisher.addAsStudent(student);

        Student student1 = new SpecificStudent2();
        facultyPublisher.addAsStudent(student1);

        facultyPublisher.notifyStudents(new Message("There is going to be a change in the programma"));
    }
}
