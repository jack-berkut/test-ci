#!/bin/env groovy

env.SCRIPT_VERSION = "@master"
echo env.SCRIPT_VERSION

@Library("shared${env.SCRIPT_VERSION}")
import testing;

node ("master") {

	testing {
    	APP_NAME = "ainai"
	}
}
