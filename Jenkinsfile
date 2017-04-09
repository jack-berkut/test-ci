#!/bin/env groovy

node ("master") {
	build job: 'test-app', parameters: [string(name: 'BRANCH_NAME', value: "${env.BRANCH_NAME}")]
}
