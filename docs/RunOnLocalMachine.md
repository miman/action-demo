# Install the docker image on local machine

## Install your GitHub PAT (Personal Access Token).
First you must install your GitHub PAT (Personal Access Token).

Follow this tutorial:
https://docs.github.com/en/free-pro-team@latest/github/authenticating-to-github/creating-a-personal-access-token

### install into github

***docker login -u username***

then you will be asked for the password, here you should write the PAT (NOT github password)


## Fetch your docker image from GitHub
You can finc the command to pull the docker image on by clicking on the action-demo package under the packages block to the right in the Github repo page.
https://github.com/miman/action-demo/packages/432533
The first command is the link 
ex:
***docker pull docker.pkg.github.com/miman/action-demo/action-demo:latest***

## Run the docker image as a container
***docker run -it -p 8080:8080 docker.pkg.github.com/miman/action-demo/action-demo:latest***

