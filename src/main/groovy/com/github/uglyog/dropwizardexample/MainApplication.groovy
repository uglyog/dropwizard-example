package com.github.uglyog.dropwizardexample

import io.dropwizard.Application
import io.dropwizard.setup.Environment

class MainApplication extends Application<ServiceConfig> {
  @Override
  void run(ServiceConfig configuration, Environment environment) {

  }

  static void main(String[] args) {
    new MainApplication().run(args);
  }
}
