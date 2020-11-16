#!/usr/bin/env groovy
def call(Closure body) {
    node {
        def repo_name
        def commit_id
        stage("SCM checkout") {
            checkout scm
            repo_name = getRepoName()
            commit_id = getCommitId()
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