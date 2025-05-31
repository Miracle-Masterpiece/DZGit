import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> {
    private String name;
    private final LocalDateTime time;
    private boolean isDone;
    private static int equalsCount;

    public Task(String name) {
        this.name = name;
        this.time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        ++equalsCount;
        if (!(o instanceof Task task)) return false;
        return isDone == task.isDone && Objects.equals(name, task.name);
    }

    public static int getEqualsCount() {
        return equalsCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, time);
    }

    @Override
    public int compareTo(Task o) {
        return getName().compareTo(o.getName());
    }
}
