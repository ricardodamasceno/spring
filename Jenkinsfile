
def pom = ""

node {

    stage("Get pom"){
        // For this to work, the Pipeline Utility Steps must be installed on Jenkins
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