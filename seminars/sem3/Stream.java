package sem3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable <List<StudentGroup>> {
    private List<StudentGroup> groupList;

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }


    @Override
    public Iterator<List<StudentGroup>> iterator() {
        return new StreamIterator(this);

    }
}
