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
    public boolean isCompleted() { return isCompleted; }
    public void MarkCompleted() { this.isCompleted = true; }
    
    @Override
    public String ToString() {
        String status = isCompleted ? "[✔] Done" : "[ ] Pending";
        return id + ". " + title + " " + status;
    }
}