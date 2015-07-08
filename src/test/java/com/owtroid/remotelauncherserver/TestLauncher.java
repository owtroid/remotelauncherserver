package com.owtroid.remotelauncherserver;

import com.owtroid.remotelauncherserver.api.launchers.v1.Launcher;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class TestLauncher {
    @Test
    public void testGetName() {
        Launcher launcher = new Launcher("Name", "Description");
        Assert.assertTrue(launcher.getName().equals("Name"));
    }

    @Test
    public void testGetDescription() {
        Launcher launcher = new Launcher("Name", "Description");
        Assert.assertTrue(launcher.getName().equals("Description"));
    }
}
