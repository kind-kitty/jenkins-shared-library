#!/usr/bin/env groovy
def call(Closure body) {
    node {

        stage("SCM checkout") {
            checkout scm

        }
        stage("Test") {
            echo "no tests to run"
            
        }
        stage("docker build") {
            build()
            
        }
        stage("docker push") {
            
        }
        body()
    }
}