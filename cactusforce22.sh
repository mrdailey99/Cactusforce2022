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

## START HERE

## 2. List Orgs
sfdx force:org:list --all --skipconnectionstatus
sfdx force:org:open -u ecars

## 3. Show current branch and source status
git status
git checkout main
git status
sfdx force:source:status
## Run Apex/LWC Tests ctrl+shift+p SFDX: Run Apex Tests (Run All Tests) RUn ALl Lightning Web Component Tests

## 4. Switch to deployment branch
git checkout undeployed
git status
sfdx force:source:status
git diff main..undeployed
## 5. Run Apex/LWC Tests

## 5. Push source to scratch org
sfdx force:source:push -u ecars
sfdx force:source:status
 
## 6. ctrl+shift+p ProvarDX: Create Properties File
## 7. ctrl+shift+p ProvarDX: Validate Properties File
## 8. Compile Provar project
sfdx provar:compile -p provar-properties.json
## 9. ctrl+shitf+p ProvarDX: Run Provar Tests
