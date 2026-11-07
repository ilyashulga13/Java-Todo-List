public class Task {
    private int id;
    private String title;
    private boolean isCompleted; 

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    
}