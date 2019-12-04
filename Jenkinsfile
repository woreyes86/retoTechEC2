pipeline {
  agent any
  stages {

  stage('Iniciandoooo') {
            steps {
              sh '''
			    docker run \
			    --env AWS_ACCESS_KEY_ID=AKIAURM4Z6Q3CNCME2XR \
			    --env AWS_SECRET_ACCESS_KEY=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 \
			    garland/aws-cli-docker \
				aws ec2 run-instances --image-id ami-0dacb0c129b49f529 --count 1 --instance-type t2.micro --key-name worp --subnet-id subnet-33431d49 --security-group-ids sg-0351d2980a6c8a812 --region us-east-2              '''
            }
      } 
    
    
    
  }
}
