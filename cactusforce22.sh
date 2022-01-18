#!/bin/bash

## Cactusforce 2022 Demo Script ##

## 1. Automated Deploy for Ecars
$ sfdx auth:web:login -d -a DevHub  # Authenticate using your Dev Hub org credentials
$ heroku login  # Login with your Heroku account (or create one)
$ git clone https://github.com/trailheadapps/ecars.git
$ cd ecars/scripts
$ npm install
$ cd ..
$ node scripts/ecarsDeploy.js