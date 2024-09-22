package sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public class StreamService {

        // Поле для хранения списка потоков
        private List<Stream> streams;

        // Конструктор для инициализации списка потоков
        public StreamService() {
            this.streams = new ArrayList<>();
        }

        // Метод для получения списка потоков
        public List<Stream> getStreams() {
            return streams;
        }

        // Метод для добавления потока в список
        public void addStream(Stream stream) {
            this.streams.add(stream);
        }

        // Метод для сортировки потоков
        public void sortStreams() {
            Collections.sort(streams, new StreamComparator());
        }
    }
}
