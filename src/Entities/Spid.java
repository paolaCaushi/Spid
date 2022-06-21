package Entities;

import Utilities.Status;

import java.util.Date;

public class Spid extends MainClass {
    private User user;
    private Status status;

    public Spid() {

    }

    public Spid(long id, Date createdAt, User user) {
        super(id, createdAt);
        this.user = user;
        this.status = Status.PENDING;
    }

    @Override
    public String toString() {
        return ("Spid" + "id=" + getId() + ", user=" + getUser() + ", status='" + getStatus() );
    }

    public User getUser() {

        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status)  {
        this.status = status;
    }
}