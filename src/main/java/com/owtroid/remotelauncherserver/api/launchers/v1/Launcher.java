package com.owtroid.remotelauncherserver.api.launchers.v1;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class Launcher {


    private String name;
    private String description;

    public Launcher() {

    }

    public Launcher(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getDescription() {
        return description;
    }
}
