def call() {
  nodejs {

    stage("Code Quality") {
      steps {
        echo "Code Quality"
      }
    }

    stage("Test Cases") {
      steps {
        echo "Test Cases"
      }
    }

    stage("Publish A Release") {
      steps {
        echo "Publish A Release"
      }
    }
  }
}
