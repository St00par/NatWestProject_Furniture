pipeline {
    agent any
    stages {
        stage('Clone Repo') {
            steps {
                sh 'git clone https://github.com/St00par/NatWestProject_Furniture'
            }
        }
        stage('Build My Jar') {
            steps {
                sh 'mvn clean package -e'
            }
        }
        stage('Run Jar') {
            steps {
                sh 'java -jar target/HomeDecor-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}