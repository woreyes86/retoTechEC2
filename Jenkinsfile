env.PATH_PROJECT='back/'
node('slave' ) { 
        
        stage('Descargar Fuentes') {  
                checkout scm 
        }
        stage('Tests') {
            script { 
             /*  dir("back") {  */
                    echo 'Building..' 
                    sh ' ls' 
                    sh ' cd ${PATH_PROJECT} && ./mvnw clean test' 
              /*   }      */         
            }
        } 
         stage('Analisis de codigo') { 
            withSonarQubeEnv('SonarQubeServer') {
                 script {   
                        echo 'Sonar Qube.. ' 
                        sh ' cd ${PATH_PROJECT} && mvn sonar:sonar'       
                                
                }
            }
         }

         stage('Verificar calidad técnica') { 
                script{					
                    timeout(time: 1, unit: 'MINUTES') { // Just in case something goes wrong, pipeline will be killed after a timeout
                        def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
                        if (qg.status != 'OK') {
                            error "Pipeline aborted due to quality gate failure: ${qg.status}"
                        }
                    }
                }
        }
      
         
    } 