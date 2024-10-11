import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int count;


    public FlowerPack(Flower flower, int count) {
        this.flower = flower;
        this.count = count;
    }

    public double getPrice() {
        return flower.getPrice() * count;
    }

}
