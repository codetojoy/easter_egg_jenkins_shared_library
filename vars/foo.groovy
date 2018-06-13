
def emitLog(message) {
    println "TRACER fooLog. message: ${message}"
    def bar = new net.codetojoy.shared.Bar(id: 5150)
    bar.emitLog(
}
