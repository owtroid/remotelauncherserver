package com.owtroid.remotelauncherserver.api.launchers.v1;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import io.dropwizard.auth.Auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 * Created by Torgny Johansson on 2015-07-08.
 */
@Path("/launcher")
@Produces(MediaType.APPLICATION_JSON)
public class LauncherResource {

    @GET
    @Timed
    public Launcher getLauncher(@Auth @QueryParam("name") Optional<String> name) {
        final Launcher launcher = new Launcher(name.or("NoName"), "The description");
        return launcher;
    }
}
