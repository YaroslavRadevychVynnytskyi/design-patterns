package patterns.behavioral.memento.example1;

import lombok.ToString;

@ToString
public class Shape {
    private String type;
    private String color;
    private int size;
    private int x;
    private int y;

    public Shape(String type, String color, int size, int x, int y) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.x = x;
        this.y = y;
    }

    public Shape copy() {
        return new Shape(type, color, size, x, y);
    }
}
