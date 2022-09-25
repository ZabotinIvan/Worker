public class Worker implements OnTaskErrorListener, OnTaskDoneListener{

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public Worker (OnTaskDoneListener callback,OnTaskErrorListener errorCallback){
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33){
                errorCallback.onError("Task " + i + " error");
                continue;
            }
            callback.onDone("Task " + i + " is done");

        }
    }

    @Override
    public void onDone(String result) {


    }

    @Override
    public void onError(String result) {


    }
}
