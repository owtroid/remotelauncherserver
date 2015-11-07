package com.owtroid.remotelauncherserver.launchers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zeroturnaround.exec.ProcessExecutor;

@RestController
public class LaunchersController {
    
    @RequestMapping(value="/launchers", method=RequestMethod.GET)
    public List<Launcher> getLaunchers(@RequestParam(value="id", defaultValue="") String id) throws IOException, InterruptedException, TimeoutException {
        List<Launcher> launchers = new ArrayList<>();
        List<String> args = Arrays.asList("");
        Launcher launcher = new Launcher("kate", args, "getLaunchers " + id);
        launchers.add(launcher);
        launcher = new Launcher("xbmc", args, "getLaunchers " + id);
        launchers.add(launcher);
        new ProcessExecutor().command("kate").start();
        return launchers;
    }
    
    @RequestMapping("/launchers/{id}")
    public Launcher getLauncher(@PathVariable("id") String id) throws IOException, InterruptedException, TimeoutException {
        List<String> args = Arrays.asList("");
        Launcher launcher = new Launcher("kate", args, "getLauncher " + id);
        return launcher;
    }
}
