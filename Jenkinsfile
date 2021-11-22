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
        stage ('Deploy') {
            steps {
                sh './mvnw spring-boot:run &'
            }
        }
    }
}