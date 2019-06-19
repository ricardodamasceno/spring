node {

    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }
    stage("build"){
        withMaven(maven: "mvn"){
            sh "mvn clean install"
        }
    }
}