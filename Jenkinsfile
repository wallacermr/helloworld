pipeline {
    agent any
    stages {
        stage ('Tests') {
            steps {
                sh './mvnw test'
            }
        }
        stage ('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
    }
}