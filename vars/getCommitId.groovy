#!/usr/bin/env groovy

def call(){
    commit_id = sh (
        script: 'git rev-parse --short HEAD',
        returnStdout: true
    ).trim()
    echo "Checked out commit id : ${commit_id}"
    return commit_id
}