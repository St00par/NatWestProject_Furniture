pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                sh git fetch https://github.com/St00par/NatWestProject_Furniture
                }
        }
        stage('Build Jar') {
            steps {
                sh 'ls'
                sh 'cd Home_Decor && ls'
            	}
        }
        stage('Run Jar') {
            steps {
                sh 'ls'
            }
        }
    }
}