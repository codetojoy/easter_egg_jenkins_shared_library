
def emitLog(message) {
    println "TRACER folderFoo. message: ${message}"
    def bar = new net.codetojoy.shared.Bar(id: 5150)
    bar.emitLog()

    println "TRACER test : " + net.codetojoy.shared.Bar.G1
}
