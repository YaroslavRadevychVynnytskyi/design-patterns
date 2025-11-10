package patterns.behavioral.memento.example1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class HistoryManager {
    private static final int MAX_HISTORY_SIZE = 10;
    private Stack<CanvasMemento> undoStack;
    private Stack<CanvasMemento> redoStack;
    private Map<String, CanvasMemento> snapshots;

    public HistoryManager() {
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
        this.snapshots = new HashMap<>();
    }

    public void save(CanvasMemento memento) {
        if (snapshots.size() == MAX_HISTORY_SIZE) {
            undoStack.remove(0);
        }
        undoStack.push(memento);
        redoStack.clear();
    }

    public CanvasMemento undo() {
        if (undoStack.size() <= 1) {
            return null;
        }
        CanvasMemento undo = undoStack.pop();
        redoStack.push(undo);

        return undoStack.peek();
    }

    public CanvasMemento redo() {
        if (redoStack.isEmpty()) {
            return null;
        }

        CanvasMemento toRestore = redoStack.pop();
        undoStack.push(toRestore);

        return toRestore;
    }

    public void saveSnapshot(String name, CanvasMemento memento) {
        snapshots.put(name, memento);
    }

    public void listSnapshots() {
        snapshots.forEach((memento, canvas) -> System.out.println(canvas));
    }

    public CanvasMemento loadSnapshot(String name) {
        return snapshots.getOrDefault(name, null);
    }
}
