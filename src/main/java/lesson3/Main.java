package lesson3;

public class Main {
    public static void main(String[] args) {
        Sticker sticker = new Sticker.Builder("KPMF").glueBrand("3M").build();
        sticker.info();
    }
}
