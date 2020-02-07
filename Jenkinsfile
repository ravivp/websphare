
de{
  
    def app
      stage('SCM Checkout'){
           git branch: 'was', url: 'https://github.com/ravivp/dockerimgae.git'
	     }
	       stage('build project'){
	           def MAVEN_HOME= tool name: 'mvn', type: 'maven'
		       sh "${MAVEN_HOME}/bin/mvn clean package"
		         }
			   
			      stage('Build image') {
			              /* This builds the actual image */

				              app = docker.build("valunaik/websphare")
					          }

						      stage('Test image') {
						              
							              app.inside {
								                  echo "Tests passed"
										          }
											      }

											          stage('Push image') {
												          /* 
													  			You would need to first register with DockerHub before you can push images to your account
																		*/
																		        docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
																			            app.push("${env.BUILD_NUMBER}")
																				                app.push("latest")
																						            } 
																							                    echo "Trying to Push Docker Build to DockerHub"
																									        }
																										  
																										  }
