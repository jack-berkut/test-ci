#!/bin/env groovy

@Library('shared@master')
import testing;

node ("master") {
	env.HOGE = "hoge"
	testing {
    	APP_NAME = "ainai"
	}
}
