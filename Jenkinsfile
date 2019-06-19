
def pom = ""

node {

    stage("Get pom){

        pom = readMavenPom file: 'pom.xml'
        echo "Artifact ID: " + pom.artifactId

    }

    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }

    stage("build"){
        withMaven(maven: "maven"){
            sh "mvn clean install"
        }
    }

}