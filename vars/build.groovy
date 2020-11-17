#!/usr/bin/env groovy

def call(){
    repo_name = getRepoName()
    commit_id = getCommitId()
    ecr_registry = constants.ECR_REGISTRY
    docker.build("${ecr_registry}/${repo_name}:${commit_id}", '.')
    echo "docker build is successful"
    // return commit_id
}


// docker.build("${ecr_registry}/${repo_name}:${commit_id}", '.')
//             echo "docker build is successful"


// repo_name = getRepoName()
// commit_id = getCommitId()
// ecr_registry = constants.ECR_REGISTRY
        