pipeline {
    agent any
    stages {
        stage ('Buid') {
            steps {
                sh './mvnw clean install -DskipTests'
            }
        }
    }
}