
static def MY_GLOBAL_VAR2 = "bach"

class Constants {
    static def MY_GLOBAL_VAR1 = "mozart"
}

def emitLog(message) {
    println "TRACER folderFoo. message: ${message}"
    def bar = new net.codetojoy.shared.Bar(id: 5150)
    bar.emitLog()

    println "TRACER test : " + net.codetojoy.shared.Bar.G1
    println "TRACER t1 : " + Constants.MY_GLOBAL_VAR1
    println "TRACER t2 : " + MY_GLOBAL_VAR2
    println "TRACER t3 : " + Keys.MY_GLOBAL_VAR3
}
