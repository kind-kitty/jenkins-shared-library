#!/usr/bin/env groovy
def call(Closure body) {
    node {
        def repo_name
        def commit_id
        def x
        stage("SCM checkout") {
            checkout scm
            repo_name = getRepoName()
            commit_id = getCommitId()
            x = echo constants.ECR_REGISTRY
            echo "x value is: ${x}"
        }
        stage("Test") {
            echo "no tests to run"
            
        }
        stage("docker build") {
            docker.build("constants.ECR_REGISTRY/${repo_name}:${commit_id}", '.')
            echo "docker build is successful"
        }
        stage("docker push") {
            
        }
        body()
    }
}