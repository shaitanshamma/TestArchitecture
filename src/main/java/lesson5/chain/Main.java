package lesson5.chain;


public class Main {
    public static void main(String[] args) {
        Handler handler = new BussyPlotter();
        handler.link(new Plotter("1")).link(new Plotter("2")).link(handler);

        for (int i = 0; i < 5; i++) {
            final int temp = i;
            handler.handle(new Request(" " + i));
        }
        System.out.println("Все стикеры распечатаны");
    }
}
