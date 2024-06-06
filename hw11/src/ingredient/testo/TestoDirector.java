package ingredient.testo;

public class TestoDirector {
    private static volatile TestoDirector instance;

    private TestoDirector() {
    }

    public static TestoDirector getInstance() {
        TestoDirector result = instance;
        if (result != null) {
            return result;
        }
        synchronized (TestoDirector.class) {
            if (instance == null) {
                instance = new TestoDirector();
            }
            return instance;
        }
    }

    public void constructThickTesto(Builder builder) {
        builder.setThicknessSize(8);
        builder.setRadius(50);
        builder.setFlourType(FlourType.CORN);
        builder.setLabel("Thick testo");
        builder.setPrice(100);
    }

    public void constructThinTesto(Builder builder) {
        builder.setThicknessSize(2);
        builder.setRadius(25);
        builder.setFlourType(FlourType.CORN);
        builder.setLabel("Thin testo");
        builder.setPrice(20);
    }
}
