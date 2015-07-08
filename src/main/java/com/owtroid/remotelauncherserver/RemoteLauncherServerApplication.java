package com.owtroid.remotelauncherserver;

import com.owtroid.remotelauncherserver.api.launchers.v1.LauncherResource;
import com.owtroid.remotelauncherserver.auth.v1.SimpleAuthenticator;
import com.owtroid.remotelauncherserver.auth.v1.User;
import com.owtroid.remotelauncherserver.auth.v1.UserResource;
import com.owtroid.remotelauncherserver.configuration.RemoteLauncherServerConfiguration;
import io.dropwizard.Application;
import io.dropwizard.auth.AuthFactory;
import io.dropwizard.auth.basic.BasicAuthFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.server.Authentication;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class RemoteLauncherServerApplication extends Application<RemoteLauncherServerConfiguration> {
    @Override
    public String getName() {
        return "remote-launcher-server";
    }

    @Override
    public void initialize(Bootstrap<RemoteLauncherServerConfiguration> bootstrap) {
    }

    @Override
    public void run(RemoteLauncherServerConfiguration configuration,
                    Environment environment) {
        final LauncherResource resource = new LauncherResource();
        environment.jersey().register(resource);

        final UserResource userResource = new UserResource();
        environment.jersey().register(userResource);

        final ApplicationHealthCheck applicationHealthCheck = new ApplicationHealthCheck();
        environment.healthChecks().register("application", applicationHealthCheck);

        final SimpleAuthenticator simpleAuthenticator = new SimpleAuthenticator();
        environment.jersey().register(AuthFactory.binder(new BasicAuthFactory<User>(new SimpleAuthenticator(),
                "SUPER SECRET STUFF",
                User.class)));
    }

    public static void main(String[] args) throws Exception {
        new RemoteLauncherServerApplication().run(args);
    }
}
