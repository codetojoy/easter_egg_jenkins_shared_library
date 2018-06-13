
package net.codetojoy.shared

class Bar {
    static def G1 = "G1"
    static def G2 = "G2"

    def id

    def emitLog() { 
        println "TRACER hello from Bar. id: ${id}"
    }
}
