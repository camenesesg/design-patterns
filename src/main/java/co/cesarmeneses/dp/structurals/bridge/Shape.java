package co.cesarmeneses.dp.structurals.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    // Standard contructors
    abstract public String draw();
}
