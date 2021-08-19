pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                sh 'git fetch https://github.com/St00par/NatWestProject_Furniture'
            }
        }
        stage('Build Pipeline') {
            steps {
                sh 'ls'
                sh 'cd NatWestProject_Furniture && ls'
            }
        }
        stage('Run Jar') {
            steps {
                sh 'ls'
            }
        }
    }
}