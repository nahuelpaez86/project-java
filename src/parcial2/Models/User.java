package parcial2.Models;

import java.io.Serializable;
public class User implements Serializable {

    private String id;
    private String user;
    private String name;
    private String password;

    public User(String id, String user, String name, String password) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}