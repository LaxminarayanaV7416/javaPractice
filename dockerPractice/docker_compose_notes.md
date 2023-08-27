## Main header tags to use to start the docker compose [Reference Link](https://docs.docker.com/compose/compose-file/compose-file-v3/)
* version (String) - we can mention the version we want to use the docker compose of usually its the 3.9 so we can mention soemthing like ```version : "3.9"```
* services (Dictinoary/HashMap) - this is where we write all the services we can write this with the services name of our choice as key and value gonna be the rest tags like image, restart, environment and more
* services -> image (String) : this is the image name which can the name of docker pull with version specified after the  ":" where we can easily mention the image type we want from docker hub, eg., ```image : postgres:15.4-alpine3.17```
* services -> restart (String) : this will have only four options they are { "no", always, on-failure, unless-stopped } we can use this four options and achieve the things easily.
* services -> environment (Dictionary/HashMap) : this will have all the key value pairs which will have the environmental variables used in the setup of the image.
* services -> ports (List/LinkedList) : this will be followed by the Port of the local system which will be mapped to the docker container exposed port so the syntax is 
            ```ports :
                    - <local system port> : <docker container exposed port>```
* services -> expose (List/LinkedList) - this will have the list of all ports which we want to expose to the pods or the docker swarm or the kubetl
* services -> container_name (String) - specify the container name which you want to use instead of default container name.
* services -> volumes (List/LinkedList) - specify the local path where you want to save the volume information atfer the colon specify the volume of the container link for example :  ```volumes : - <localpath>:<containerpath>``` we can mention n number of paths here since its the list.

### Providing the custom docker files for the services
* services -> build (Dictionary/HashMap) : this is where we have to pass the key value pairs of the image we are going to build with the reference or context of the path we are going to call with reference to docker compose yaml location. The keys can be context, dockerfile, args, cache_from, labels, network, shm_size and target