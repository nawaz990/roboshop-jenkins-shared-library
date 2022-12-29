def call() {
  node {

    common.checkout()
    common.java()
    common.codeQuality()
    common.release()
  }
}