version_settings(constraint='>=0.22.2')

# DATA MICROSERVICE
local_resource(
  'data-ms-resource',
  'cd data-ms &&' +
  './gradlew clean build',
  deps=['data-ms/src', 'build.gradle'],
  labels=['data-ms']
 )

docker_build(
     'data-ms',
     context='./data-ms',
     dockerfile='./data-ms/src/main/docker/Dockerfile.jvm'
)

k8s_yaml('data-ms/deployment/deployment.yaml')

k8s_resource(
     'data-ms-deployment',
     port_forwards=['8080:8080'],
     labels=['data-ms'],
     resource_deps=['data-ms-resource']
)

# GOODBYE MICROSERVICE
local_resource(
  'goodbye-ms-resource',
  'cd goodbye-ms &&' +
  './gradlew clean build',
  deps=['goodbye-ms/src', 'build.gradle'],
  labels=['goodbye-ms']
 )

docker_build(
     'goodbye-ms',
     context='./goodbye-ms',
     dockerfile='./goodbye-ms/src/main/docker/Dockerfile.jvm'
)

k8s_yaml('goodbye-ms/deployment/deployment.yaml')

k8s_resource(
     'goodbye-ms-deployment',
     labels=['goodbye-ms'],
     resource_deps=['goodbye-ms-resource']
)

# MONGODB MICROSERVICE
docker_build(
     'mongodb-ms',
     context='./mongodb-service',
     dockerfile='./mongodb-service/src/main/docker/Dockerfile.jvm'
)

k8s_yaml('mongodb-service/deployment/deployment.yaml')

k8s_resource(
     'mongodb-ms-deployment',
     labels=['mongodb-ms'],
)

# MONGODB
k8s_yaml('mongodb-service/deployment/db-deployment.yaml')

k8s_resource(
    'mongo-db-deployment',
    port_forwards='27017:27017',
    labels=['mongodb-ms']
)

# ANGULAR FRONTEND