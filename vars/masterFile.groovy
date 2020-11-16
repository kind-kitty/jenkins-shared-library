#!/usr/bin/env groovy
def call(Closure body) {
    node {
        stage("SCM checkout") {
            checkout scm
        }
        stage("Test") {
            
        }
        stage("docker build") {
            
        }
        stage("docker push") {
            
        }
        body()
    }
}