node {

    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }
    stage("build"){
        withMaven(maven: "M3"){
            sh "mvn clean install"
        }
    }
}