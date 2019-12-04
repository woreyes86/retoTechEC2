
node('slave' ) { 
        
        
        stage('Creacion de Instancia EC2') {
            script { 
            
                    echo 'Building..' 
                    sh ' docker run \
 --env AWS_ACCESS_KEY_ID=AKIAURM4Z6Q3CNCME2XR \
 --env AWS_SECRET_ACCESS_KEY=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 \
 garland/aws-cli-docker \
 aws ec2 run-instances --image-id ami-173d747e --count 1 --instance-type t1.micro --key-name worp --security-groups RetoTech_SG' 
                 
            
            }
        } 
        
      
         
    } 
