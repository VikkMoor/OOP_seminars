package sem3;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Stream implements Iterable <List<StudentGroup>> {
    private List<List<StudentGroup>> groupList;

    public List<List<StudentGroup>> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<List<StudentGroup>> groupList) {
        this.groupList = groupList;
    }


    @Override
    public Iterator<List<StudentGroup>> iterator() {
        return new StreamIterator(this);

    }
}
