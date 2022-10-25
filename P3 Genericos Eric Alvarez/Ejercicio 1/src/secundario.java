import java.util.LinkedList;

    public class secundario<T> {
        private T data;
        private LinkedList<T> list;

        public secundario() {
            this.list = new LinkedList<>();
        }
        public boolean isEmpty() {
            return this.list.isEmpty();
        }
        public void removeFirst() {
            this.list.removeFirst();
        }
        public T getFirst() {
            return this.list.getFirst();
        }
        public void addFirst(T item) {
            this.list.addFirst(item);
        }
        public String toString() {
            return this.list.toString();
        }
    }

