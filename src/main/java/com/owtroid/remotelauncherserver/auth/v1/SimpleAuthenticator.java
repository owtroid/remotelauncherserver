package com.owtroid.remotelauncherserver.auth.v1;

import com.google.common.base.Optional;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class SimpleAuthenticator implements Authenticator<BasicCredentials, User> {

    public Optional<User> authenticate(BasicCredentials basicCredentials) throws AuthenticationException {
        if ("secret".equals(basicCredentials.getPassword())) {
            return Optional.of(new User(basicCredentials.getUsername()));
        }

        throw new AuthenticationException("Oooh, access denied!");
    }
}
