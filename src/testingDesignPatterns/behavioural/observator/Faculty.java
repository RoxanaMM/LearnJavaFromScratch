package testingDesignPatterns.behavioural.observator;

public interface Faculty {
    void addAsStudent(Student student);
    void expel(Student student);
    void notifyStudents(Message message);
}
