version_settings(constraint='>=0.22.2')

local_resource(
  'data-ms-resource',
  'cd hello-ms &&' +
  './gradlew clean build',
  deps=['data-ms/src', 'build.gradle'],
  labels=['hello-ms-resource']
 )

docker_build(
     'data-ms',
     context='./hello-ms',
     dockerfile='./data-ms/src/main/docker/Dockerfile.jvm'
)

k8s_yaml('data-ms/deployment/deployment.yaml')

k8s_resource(
     'data-ms-deployment',
     port_forwards=['8080:8080'],
     labels=['data-ms'],
     resource_deps=['data-ms-resource']
)