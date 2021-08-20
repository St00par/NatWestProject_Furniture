pipeline {
    agent any
    stages {
        stage('Clone or Fetch Repo') {
            steps {
                sh 'git fetch https://github.com/St00par/NatWestProject_Furniture'
            }
        }
        stage('Build My Jar') {
            steps {
                sh 'mvn clean package -e'
                sh '--illegal-access=permit'
            }
        }
        stage('Run My Jar Jar Binks') {
            steps {
                sh 'java -jar target/HomeDecor-0.0.1-SNAPSHOT.jar &'
            }
        }
    }
}