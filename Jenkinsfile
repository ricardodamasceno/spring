node {
    stage("update"){
        git 'https://github.com/ricardodamasceno/spring.git'
    }
    stage("build"){
        sh 'mvn clean install'
    }
}