package patterns.behavioral.memento.example1;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class CanvasMemento {
    private final List<Shape> shapes;
    private final String currentColor;
    private final int brushSize;

    public CanvasMemento(List<Shape> shapes, String currentColor, int brushSize) {
        this.shapes = new ArrayList<>();
        for (Shape shape : shapes) {
            this.shapes.add(shape.copy());
        }

        this.currentColor = currentColor;
        this.brushSize = brushSize;
    }

    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }

    public String getCurrentColor() {
        return currentColor;
    }

    public int getBrushSize() {
        return brushSize;
    }
}
