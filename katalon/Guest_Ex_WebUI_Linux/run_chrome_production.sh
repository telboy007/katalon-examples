#!/usr/bin/env bash

set -xe

docker run -t --rm -v "$(pwd)":/katalon/katalon/source katalonstudio/katalon:6.3.3 katalon-execute.sh -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Guest EX/Smoke Tests/Production/Production_Guest Application Test Suite"
