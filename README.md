
## Global Shared Library

### Layout

* `vars/foo.groovy`
* `src/net/codetojoy/shared/Bar.groovy`
* `Basic.Jenkinsfile`

### Jenkins

* in Jenkins, _Manage Jenkins_ -> _Configure System_
* under **Global Pipeline Libaries* add:
    * Name is `foo`
    * Default version is `master`
    * Retrieval Method is `Modern SCM`
    * SCM is this repo
* add a new job 
    * though a bit confusing, I create a pipeline job that uses this same repo
    * specify the Jenkinsfile `Basic.Jenkinsfile`
* the job should run .. note the code below:

```
@Library('foo') _ 

stage "use shared library"
node {
    script {
        foo.emitLog 'pipeline test!'
    }
}
```

## Folder Shared Libary

### Layout

* `vars/folderFoo.groovy`
* `src/net/codetojoy/shared/Bar.groovy`
* `Basic.Folder.Jenkinsfile`

### Jenkins

* in Jenkins, create a folder with _New Item_ -> Folder
* add a Pipeline Library
    * Name is `folderFoo`
    * Default version is `master`
    * Retrieval Method is `Modern SCM`
    * SCM is this repo
* add a new job to this folder
    * though a bit confusing, I create a pipeline job that uses this same repo
    * specify the Jenkinsfile `Basic.Folder.Jenkinsfile`
* the job should run .. note the code below:

```
@Library('folderFoo') _ 

stage "use shared library"
node {
    script {
        folderFoo.emitLog 'pipeline test!'
    }
}
```
