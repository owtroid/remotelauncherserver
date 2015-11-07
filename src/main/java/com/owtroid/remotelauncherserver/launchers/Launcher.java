package com.owtroid.remotelauncherserver.launchers;

import java.util.List;
import java.util.UUID;

public class Launcher {
    private String id;
    private String description;
    private String cmd;
    private List<String> args;
    
    public Launcher(String cmd, List<String> args, String description) {
        this.cmd = cmd;
        this.args = args;
        this.description = description;
        this.id = UUID.randomUUID().toString();
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the cmd
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * @param cmd the cmd to set
     */
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    /**
     * @return the args
     */
    public List<String> getArgs() {
        return args;
    }

    /**
     * @param args the args to set
     */
    public void setArgs(List<String> args) {
        this.args = args;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
