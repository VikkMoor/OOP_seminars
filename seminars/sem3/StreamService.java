package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private List<Stream> streams;

    public StreamService() {
        this.streams = new ArrayList<>();
    }

    public List<Stream> getStreams() {
        return streams;
    }

    public void addStream(Stream stream) {
        this.streams.add(stream);
    }

    // Sort stream method:
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
}