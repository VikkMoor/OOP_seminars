package sem4;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list) {
            System.out.println(student.getStudentId());
        }
    }
}
