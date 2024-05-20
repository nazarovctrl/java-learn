public class Engine {
    private Integer size;

    public Engine(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "size=" + size +
                '}';
    }
}
