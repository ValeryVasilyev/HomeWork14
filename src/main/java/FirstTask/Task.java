package FirstTask;

import java.util.concurrent.Callable;

public class Task<T> {
    private volatile Callable<? extends T> callable;

    public Task(Callable<? extends T> callable) {
        if (this.callable != null) {
            synchronized (this) {
                if (this.callable != null) {
                    this.callable = callable;
                }
            }
        }
    }

    public T get() throws Exception {
        return this.callable.call();
    }
}
