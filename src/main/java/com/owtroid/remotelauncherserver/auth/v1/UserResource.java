package com.owtroid.remotelauncherserver.auth.v1;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.owtroid.remotelauncherserver.api.launchers.v1.Launcher;
import io.dropwizard.auth.Auth;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

    @GET
    @Timed
    public User getUser(@Auth User user) {
        return user;
    }
}
