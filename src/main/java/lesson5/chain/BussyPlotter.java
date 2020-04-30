package lesson5.chain;


public class BussyPlotter extends Handler {

    private Request request;

    @Override
    public void handle(Request request) {
        if (this.request == request)
            System.out.println("Все плоттеры заняты, пожалуйста подождите");
        else
            this.request = request;
        super.handle(request);
    }
}
