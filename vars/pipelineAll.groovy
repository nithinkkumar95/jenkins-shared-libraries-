def call() {
  return this
}

def checkoutCode() {
    echo 'Checking out code...'
    checkout scm
}

def setupJava() {
    echo 'Setting up Java 17...'
    // Add any specific Java setup commands here if needed
}

def setupMaven() {
    echo 'Setting up Maven...'
    // Add any specific Maven setup commands here if needed
}

def buildProject() {
    echo 'Building project with Maven...'
    sh 'mvn clean package'
}

def uploadArtifact(String artifactPath) {
    echo "Uploading artifact: ${artifactPath}..."
    // Add your artifact upload logic here
}

def runApplication() {
    echo 'Running application...'
    sh 'nohup mvn spring-boot:run &'
    sleep(time: 15, unit: 'SECONDS')
   // sh 'java -jar target/petclinic-0.0.1-SNAPSHOT.jar' 
}

def validateApp() {
    echo 'Validating application is running...'
    // Add logic to validate the app (e.g., checking logs, HTTP responses)
}

def stopApplication() {
    echo 'Stopping application gracefully...'
    // Add logic to stop the app gracefully
}

def cleanup() {
    echo 'Performing cleanup...'
    // Add cleanup logic here
}

