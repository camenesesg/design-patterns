package co.cesarmeneses.dp.structurals.bridge;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public String draw() {
        return "Square drawn. " + color.fill();
    }
}
