package lesson5.chain;


public class Plotter extends Handler {
    private String name;

    public Plotter(String name) {
        this.name = name;
    }

    @Override
    public void handle(Request request) {
        if (isBusy()) {
            System.out.printf("Плоттер %s занят\n", name);
            super.handle(request);
        } else {
            System.out.printf("Плоттер %s обрабатывает запрос на печать %s\n",
                    name, request.getReguest());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }

    private final double probability = 0.7;
}
