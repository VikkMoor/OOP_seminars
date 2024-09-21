package sem3;

public class Controller {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public void removeStudentByFLM(String firstName, String lastName, String middName {
        studentGroupService.removeStudentByFLM(firstName, lastName, middName);
    }
}
