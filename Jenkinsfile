pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                sh 'git fetch https://github.com/St00par/NatWestProject_Furniture'
            }
        }
        stage('Build Jar') {
            steps {
                sh 'mvn clean package -X'
            }
        }
        stage('Run Jar') {
            steps {
                sh 'java -jar target/HomeDecor-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}