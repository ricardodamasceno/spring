node {

    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }
    stage("build"){
        withMaven(maven: "maven"){

            echo "Print variables values"

            sh "mvn clean install"
        }
    }

}