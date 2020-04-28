package lesson4;

public class SimpleSticker implements StickerCreator {
    private String name;

    public SimpleSticker(String name) {
        this.name = name;
    }
    @Override
    public void create() {
        System.out.println(name);
    }
}
