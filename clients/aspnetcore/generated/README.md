# com.shinesolutions.cloudmanagerapiclient - ASP.NET Core 2.0 Server

This API allows access to Cloud Manager programs, pipelines, and environments by an authorized technical account created through the Adobe I/O Console. The base url for this API is https://cloudmanager.adobe.io, e.g. to get the list of programs for an organization, you would make a GET request to https://cloudmanager.adobe.io/api/programs (with the correct set of headers as described below). This swagger file can be downloaded from https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml.

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```
## Run in Docker

```
cd src/com.shinesolutions.cloudmanagerapiclient
docker build -t com.shinesolutions.cloudmanagerapiclient .
docker run -p 5000:8080 com.shinesolutions.cloudmanagerapiclient
```
