package sem3;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<List<StudentGroup>> {
    private int count;
    private final List<List<StudentGroup>> groupList;

    public StreamIterator(Stream stream) {
        this.count = 0;
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
