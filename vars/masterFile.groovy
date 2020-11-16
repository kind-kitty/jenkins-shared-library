#!/usr/bin/env groovy
def call(Closure body) {
    node {
        def repo_name
        stage("SCM checkout") {
            checkout scm
            repo_name = getRepoName()
        }
        stage("Test") {
            echo "no tests to run"
            
        }
        stage("docker build") {
            
        }
        stage("docker push") {
            
        }
        body()
    }
}