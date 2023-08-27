## what is kubernetes
kubernetes is an container orchestration tool, developed by google and helps you manage containers in various deployment environments. due to microservice thirst have gave given birth to the kubernetes.
#### features of Kubernetes
* High Availability
* Scalability
* Disaster Recovery

#### Kubernetes Componenets
* node - simple server or physical virtual machine.
* pod - smallest unit of kubernetes is Pod, its the abstraction over container, it contains the running enviornment over the container technology this way kubernetes can run any container technologys images and Minimum there will be one container per pod or we can have multiple containers per pod and each pod have there unique IP address (Note container will not have the IP address the pod will have the IP address)
* Virtual IP Address - each pod gets its own internal IP address this IP address is to the local to kubernetes only.
* service - this will be providing the static or permanent IP address this IP address will be again local to kubernetes. it also acts as load balancer as well.
* external_service - this will open the internal service to external world through expose.
* ingress - is the port forwarding which handles the DNS resolution where if we recieve the request from external world it first goes to the ingress later redireceted to the external_service later it reolves the request.
* volumnes - it attaches the physical storage in local to kuberntes or we can external storage to it.

#### config maps and secrets
* configMap - contains of the configuration of external to application. dont put the password or confidential information here instead use the secret
* Secret - it stores the data in base64 encoded format.
use the above things using environmental variables since kubernets ingests this as environmental variables while creation of pod.

#### Misccellenous notes
* Deployments - we will use the blueprints which will help us to create the deployment and blueprints is for pod creation. in practice we will work with deployments than pods directly using the bleuprints.
* StateFul Sets - To avoid data inconsistency for database kind of pods should be created using the stateFul sets not the deplyments. these will have services like databases, queues and pub sub systems. though stateFul applications are kind of the extra effortful deployement.
* due to multiple pods spread over the nodes which sets kubernetes with no down time. in mean while some are deplying or ephimeral (dead pods) pods are recreating.
* replicaset - which manages the replicas with this we will never interact we only check.

## k8's architecture

* slave node / worker nodes - there are three processes that must be installed on every node they are 
    * Container runtime, 
    * kubelet (its the interface with both container runtime and node itself) it simply interacts with the container and node and also starts the pod with container inside. 
    * last one is every node should have kube proxy is responsible for forwarding the request from services to pods.

* master node - it have different processes running in the master node
    * API Server - if you want to deploy you interact with API server, its the cluster gateway and also acts as gatekeeper making sure authorized users can only access the server. query status of deployment and more.
    * Scheduler - it schedules the deployments (where to put the pod in which worked node and more).
    * Controller manager - controller manager detect state changes like crashing pods, new state of deployment and submits the request the scheduler for restart the pods.
    * etcd - its the key value store of cluster state (think it as cluster brain).

## main K8's Components
## Minikube and kubectl - local setup 
* Minikube is the local setup of kubernetes which installs the neccessary worker and master nodes.
* Kubectl is the Command Line Interface (CLI) to talk to the API server of master node.


## main Kubectl commnds
* $ kubectl get nodes
* $ kubectl get pod
* $ kubectl get services
* $ kubectl create -h (gets the help documentation of the command)
* $ kubectl create deployment NAME --image=image_from_docker_hub
* $ kubectl get deployment
* $ kubectl get replicaset
* $ kubectl edit deployment NAME
* $ kubectl logs PODNAME
* $ kubectl describe pod PODNAME
* $ kubectl logs PODNAME
* $ kubectl exec -it PODNAME -- bin/bash 
    * it means interactive terminal
* $ kubectl delete deployment NAME
* $ kubectl apply -f FILENAME
    * FILENAME - configuration yaml file
* 


##  helm package manager
## handling volumes
## stateful apps

