pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                sh 'git clone https://github.com/St00par/NatWestProject_Furniture'
            }
        }
        stage('Build Pipeline') {
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