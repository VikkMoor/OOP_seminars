package sem3;

import java.util.Iterator;

public class StudentGroupService {
    private StudentGroup studentGroup;
    public void removeStudentByFLM(String firstName, String lastName, String middName) {
        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)
               && student.getMiddName().equals(middName)) {
                iterator.remove();
            }
        }
    }
}
