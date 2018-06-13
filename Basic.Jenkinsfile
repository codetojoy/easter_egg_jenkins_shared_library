
stage "checkout"
node {
    checkout scm
}

stage "stage 1"
node {
    println "TRACER hello from stage 1"
}

@Library('foo') _ 

stage "use shared library"
node {
    script {
        foo 'pipeline test!'
    }
}
