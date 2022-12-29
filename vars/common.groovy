def checkout() {
  stage('Checkout Code') {
      cleanWs()
      git branch: 'main', url: "${env.REPO_URL}"
  }
}

def compile(appType) {

  stage('Compile Code') {
    if(appType == "java") {
      sh 'mvn clean compile'
    }

    if(appType == "golang") {
      sh 'go mod init'
    }
  }
}

def codeQuality() {
  stage('Code Quality') {
    sh 'sonar-scanner -Dsonar.login=nawaz990 -Dsonar.password=nawaz123 -Dsonar.host.url=http://172.31.13.183:9000'
  }
}

def release() {
  stage('Publish A Release') {
    echo 'Publish A Release'
  }
}