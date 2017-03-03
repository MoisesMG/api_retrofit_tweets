package uca.app.models;

/**
 * Created by isi3 on 02/03/2017.
 */

public class AccesTokenModel {
    private String id;
    private int ttl;
    private int userId;

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
