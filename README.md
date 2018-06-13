
## Global Shared Library

* TODO

## Folder Shared Libary

### Layout

* `vars/folderFoo.groovy`
* `src/net/codetojoy/shared/Bar.groovy`
* `Basic.Folder.Jenkinsfile`

### Jenkins

* in Jenkins, create a folder with New Item -> Folder
* add a Pipeline Library
    * Name is `folderFoo`
    * Default version is `master`
    * Retrieval Method is `Modern SCM`
    * SCM is this repo
* add a new job to this folder
    * though a bit confusing, I create a pipeline job that uses this same repo
    * specify the Jenkinsfile `Basic.Folder.Jenkinsfile`
* the job should run

