package com.owtroid.remotelauncherserver.auth.v1;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
