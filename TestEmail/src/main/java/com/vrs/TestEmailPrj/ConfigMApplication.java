package com.vrs.TestEmailPrj;

import com.vrs.TestEmailPrj.resources.Email;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ConfigMApplication extends Application<ConfigMConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ConfigMApplication().run(args);
    }

    @Override
    public String getName() {
        return "ConfigM";
    }

    @Override
    public void initialize(final Bootstrap<ConfigMConfiguration> bootstrap) {

    }

    @Override
    public void run(final ConfigMConfiguration configuration,
                    final Environment environment) {
    	Email email = new Email(configuration);
    	environment.jersey().register(email);
    }

}
