pipeline {

    agent any


    tools {

        jdk 'JDK21'

        maven 'Maven3'

    }


    stages {


        stage('Checkout') {

            steps {

                echo 'Checking out source code'

                checkout scm

            }
        }


        stage('Build') {

            steps {

                echo 'Building Employee Application'

                bat 'mvn clean package -DskipTests'

            }
        }


        stage('Test') {

            steps {

                echo 'Running Unit Tests'

                bat 'mvn test'

            }
        }


        stage('Archive') {

            steps {

                echo 'Archiving JAR file'

                archiveArtifacts artifacts: 'target/*.jar',
                                 fingerprint: true

            }
        }


        stage('Deploy') {

            steps {

                echo 'Starting Employee Application'


                bat '''
                start "Employee-App" java -jar target/*.jar
                '''

            }
        }
        stage('Docker Test') {

            steps {

                bat 'docker --version'

            }

        }


    }


    post {


        success {

            echo 'Employee Application deployed successfully'

        }


        failure {

            echo 'Deployment failed'

        }

    }

}