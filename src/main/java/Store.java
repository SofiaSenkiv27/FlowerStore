import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Store {
    private List<Flower> flowers;

    public Store() {
        this.flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(String color, FlowerType flowerType, Double maxPrice) {
        return flowers.stream()
                .filter(flower -> (color == null || flower.getColor().equals(color)) &&
                                  (flowerType == null || flower.getFlowerType() == flowerType) &&
                                  (maxPrice == null || flower.getPrice() <= maxPrice))
                .collect(Collectors.toList());
    }

    public List<Flower> getAllFlowers() {
        return new ArrayList<>(flowers);
    }
}
