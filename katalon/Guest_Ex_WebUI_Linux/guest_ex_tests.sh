#!/usr/bin/env bash

set -xe

docker run -it -v "$(pwd)":/katalon/katalon/source katalonstudio/katalon katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Guest EX/Smoke Tests/Staging/Staging_Guest Application Test Suite" -apiKey=71f74bc1-0c7c-4ea6-abc4-336824e04c8b