def call() {
  node {

    common.checkout()
    common.codeQuality()
    common.testcases()
    common.release()
  }
}
