package Entities;
import java.util.Date;

public class MainClass {
    private long id;
    private Date createdAt;

    public MainClass() {

    }

    public MainClass(long id, Date createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

