package PUSH_P;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 1; i < 101; i++) {
            if (i==33) errorCallback.onError("Ups, task " + i + " is undone");
            else
            callback.onDone("Task " + i + " is done");
        }
    }
}
