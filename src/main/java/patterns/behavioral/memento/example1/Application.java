package patterns.behavioral.memento.example1;

public class Application {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        HistoryManager history = new HistoryManager();

        // Початковий стан
        System.out.println("=== ПОЧАТКОВИЙ СТАН ===");
        canvas.showCanvas();
        history.save(canvas.save());

        // Малюємо фігури
        canvas.setCurrentColor("червоний");
        canvas.setBrushSize(5);
        canvas.addShape(new Shape("circle", "червоний", 5, 10, 10));
        history.save(canvas.save());

        canvas.addShape(new Shape("rectangle", "червоний", 5, 20, 20));
        history.save(canvas.save());

        System.out.println("\n=== ПІСЛЯ МАЛЮВАННЯ ===");
        canvas.showCanvas();

        // Зберігаємо снепшот
        history.saveSnapshot("two_shapes", canvas.save());
        System.out.println("💾 Збережено снепшот 'two_shapes'");

        // Додаємо ще фігури
        canvas.setCurrentColor("синій");
        canvas.addShape(new Shape("triangle", "синій", 7, 30, 30));
        history.save(canvas.save());

        canvas.addShape(new Shape("line", "синій", 7, 40, 40));
        history.save(canvas.save());

        System.out.println("\n=== ПІСЛЯ ДОДАВАННЯ ===");
        canvas.showCanvas();

        // Undo
        System.out.println("\n=== UNDO x2 ===");
        CanvasMemento previousState = history.undo();
        if (previousState != null) {
            canvas.restore(previousState);
        }
        previousState = history.undo();
        if (previousState != null) {
            canvas.restore(previousState);
        }
        canvas.showCanvas();

        // Redo
        System.out.println("\n=== REDO x1 ===");
        CanvasMemento nextState = history.redo();
        if (nextState != null) {
            canvas.restore(nextState);
        }
        canvas.showCanvas();

        // Завантажуємо снепшот
        System.out.println("\n=== ЗАВАНТАЖЕННЯ СНЕПШОТА 'two_shapes' ===");
        CanvasMemento snapshot = history.loadSnapshot("two_shapes");
        if (snapshot != null) {
            canvas.restore(snapshot);
        }
        canvas.showCanvas();

        // Очищення
        System.out.println("\n=== ОЧИЩЕННЯ ПОЛОТНА ===");
        canvas.clear();
        history.save(canvas.save());
        canvas.showCanvas();

        // Список снепшотів
        System.out.println("\n=== СПИСОК СНЕПШОТІВ ===");
        history.listSnapshots();

    }
}
