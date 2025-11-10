package patterns.behavioral.memento.example1;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
public class Canvas {
    private List<Shape> shapes;
    private String currentColor;
    private int brushSize;

    public Canvas() {
        this.shapes = new ArrayList<>();
    }

    public Canvas(List<Shape> shapes, String currentColor, int brushSize) {
        this.shapes = shapes;
        this.currentColor = currentColor;
        this.brushSize = brushSize;
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeLastShape() {
        shapes.removeLast();
    }

    public CanvasMemento save() {
        return new CanvasMemento(shapes, currentColor, brushSize);
    }

    public void restore(CanvasMemento memento) {
        this.shapes = memento.getShapes();
        this.currentColor = memento.getCurrentColor();
        this.brushSize = memento.getBrushSize();
    }

    public void showCanvas() {
        System.out.println("Canvas{" +
                "shapes=" + shapes +
                ", currentColor='" + currentColor + '\'' +
                ", brushSize=" + brushSize +
                '}');
    }

    public void clear() {
        shapes = new ArrayList<>();
        currentColor = null;
        brushSize = 0;
    }
}
