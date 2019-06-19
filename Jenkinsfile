node {

    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }
    stage("build"){
        withMaven(maven: "maven"){
            sh "mvn clean install"
        }
    }
}