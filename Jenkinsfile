pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                sh './mvnw clean package -U -DskipTests'
            }
        }
        stage ('Unit Tests') {
            steps {
                sh './mvnw test'
            }
        }
        stage ('Version') {
            steps {
                sh './mvnw -B -Darguments=-DskipTests=true -Dmaven.javadoc.skip=true -Dmaven.javadoc.skip=true -Dmaven.test.skipTests=true -Dmaven.test.skip=true release:clean release:prepare'
            }
        }
        stage ('Upload Repo') {
            steps {
                sh './mvnw -B -Darguments=-DskipTests=true -Dmaven.javadoc.skip=true -Dmaven.test.skipTests=true -Dmaven.test.skip=true release:perform'
            }
        }
    }
}
