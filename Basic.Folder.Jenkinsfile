
stage "checkout"
node {
    checkout scm
}

stage "stage 1"
node {
    println "TRACER hello from stage 1"
}

@Library('folderFoo') _ 

stage "use shared library"
node {
    script {
        folderFoo.emitLog 'pipeline test!'
    }
}
