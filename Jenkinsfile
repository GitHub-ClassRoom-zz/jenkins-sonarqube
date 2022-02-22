pipeline {
    agent any
    options {
        timestamps()
    }
    stages {
        stage('Clone sources') {
            steps {
                git url: 'https://github.com/tkgregory/sonarqube-jacoco-code-coverage.git'
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "chmod +x gradlew && ./gradlew sonarqube"
                }
            }
        }
        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}
