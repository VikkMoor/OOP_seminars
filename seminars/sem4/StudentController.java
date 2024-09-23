package sem4;


import java.util.List;

public class StudentController implements UserController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    public List<Student> getSortedStudentByFLM() {
        List<Student> studentList = studentGroupService.getSortedStudentByFLM();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
