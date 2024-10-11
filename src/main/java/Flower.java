import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private FlowerType flowerType;
    private double price;
    private double sepalLenght;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLenght = flower.sepalLenght;

    }

    public String getColor() {
        return color.getCode();
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
