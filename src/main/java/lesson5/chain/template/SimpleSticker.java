package lesson5.chain.template;

public class SimpleSticker extends CreateSticker {
    @Override
    void print() {

    }

    @Override
    void lamination() {

    }

    @Override
    void cut() {
        System.out.println("Резка по контуру");
    }
}
