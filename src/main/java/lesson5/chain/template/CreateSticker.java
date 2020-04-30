package lesson5.chain.template;

public abstract class CreateSticker {
    abstract void print();
    abstract void lamination();
    abstract void cut();

    public final void create(){
        print();
        lamination();
        cut();
    }
}
