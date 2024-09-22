package sem3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<List<StudentGroup>> {
    private List<StudentGroup> groupList;

    public StreamIterator(Stream stream) {
        this.groupList = stream.getGroupList();
    }


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public List<StudentGroup> next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
