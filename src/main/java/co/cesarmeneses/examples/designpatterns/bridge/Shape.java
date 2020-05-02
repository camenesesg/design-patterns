package co.cesarmeneses.examples.designpatterns.bridge;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
    // Standard contructors
    abstract public String draw();
}
