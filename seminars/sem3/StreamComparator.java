package sem3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {


    @Override
    public int compare(Stream o1, Stream o2) {
        /*
        Size o1 < size o2 => negative value;
        Size o1 = size o2 => 0;
        Size o1 > size o2 => positive value;
         */
        return Integer.compare(o1.getGroupList().size(), o2.getGroupList().size());
    }
}
