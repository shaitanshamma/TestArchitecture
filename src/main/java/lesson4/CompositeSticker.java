package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeSticker implements StickerCreator {

    private List<StickerCreator> operations = new ArrayList<StickerCreator>();

    @Override
    public void create() {
        System.out.printf("creating %s \n{\n", this.getClass().getSimpleName());
        for (StickerCreator operation : operations) {
            operation.create();
        }
        System.out.printf("}");
    }

    public StickerCreator add(StickerCreator... operations) {
        this.operations.addAll(Arrays.asList(operations));
        return this;
    }
}
