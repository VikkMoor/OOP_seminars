package sem3;

import java.util.List;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public void removeStudentByFLM(String firstName, String lastName, String middName) {
        studentGroupService.removeStudentByFLM(firstName, lastName, middName);
    }

    public List<Student> getSortedStudentList() {
        studentGroupService.getSortedStudentList();
    }
}
