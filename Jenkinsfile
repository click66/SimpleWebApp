node {
   stage('Preparation') {
      git 'https://github.com/click66/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}