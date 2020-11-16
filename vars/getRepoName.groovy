#!/usr/bin/env groovy

def call(){
    repo_name = sh (
        script: 'basename -s .git `git config --get remote.origin.url`',
        returnStdout: true
    ).trim()
    echo "The current repository name is : ${repo_name}"
    return repo_name
}