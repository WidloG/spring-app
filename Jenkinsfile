pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                sh "mvn clean package"

            }
        }
        stage('Test'){
            steps {
                 sh "mvn test"
            }
        }
        stage('Deploy') {
            steps {
                 docker.withRegistry('https://registry.hub.docker.com', 'dockerhub-credentials') {
                                         def appImage = docker.build('widlog/spring-app')
                                         appImage.push()
                                     }
            }
        }
    }

}