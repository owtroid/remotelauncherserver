package com.owtroid.remotelauncherserver;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by Torgny Johansson on 2015-07-08.
 */
public class ApplicationHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
