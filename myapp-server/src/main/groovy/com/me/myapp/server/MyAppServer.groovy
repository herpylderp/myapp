package com.me.myapp.server

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

class MyAppServer extends Application<MyAppConfig> {
	static void main(String[] args) {
		new MyAppServer().run(args)
	}
	
	@Override
	public void initialize(Bootstrap<MyAppConfig> booty) {
	}

	@Override
	public void run(MyAppConfig config, Environment env) throws Exception {
		env.jersey().register(new MyAppResource())
	}
}