package FirstTask;

public class Main {
    public static void main(String[] args) throws MyRuntimeException {
        try {
            Task task = new Task(() -> null);
            task.get();
        } catch (Exception e) {
            throw new MyRuntimeException();
        }
    }
}
