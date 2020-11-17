#!/usr/bin/env groovy
def call(Closure body) {
    node {

        stage("SCM checkout") {
            checkout scm
            // repo_name = getRepoName()
            // commit_id = getCommitId()
            // ecr_registry = constants.ECR_REGISTRY
        }
        stage("Test") {
            echo "no tests to run"
            
        }
        stage("docker build") {
            build()
            // docker.build("${ecr_registry}/${repo_name}:${commit_id}", '.')
            // echo "docker build is successful"
        }
        stage("docker push") {
            
        }
        body()
    }
}