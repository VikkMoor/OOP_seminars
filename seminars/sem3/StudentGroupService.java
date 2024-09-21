package sem3;

import java.util.*;

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
    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public  List<Student> getSortedStudentByFLM() {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new StudentComparator());
        return studentList;
    }
}
