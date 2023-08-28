## what is kubernetes
kubernetes is an container orchestration tool, developed by google and helps you manage containers in various deployment environments. due to microservice thirst have gave given birth to the kubernetes. [Video Link](https://www.youtube.com/watch?v=X48VuDVv0do)
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
#### All CRUD operations (Create, Read, Update and Delete of pods and more)
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
* $ kubectl describe service SERVICENAME
* $ kubectl get pod -o wide -> this gives more information about the pod
* $ kubectl get deployment DEPLOYMENTNAME -o yaml -> gets the deployment yaml what kubernetes have created
* $ kubectl get all -> to get all pods and services at once
* $ kubectl get secret -> to get all secrets
* $ kubectl get namespace -> gets all namespaces
* $ kubectl cluster-info -> to get all information about the cluster this falls undernamespace called kube-public
* $ kubectl create namespace -> to create namespace
* $ kubectl get namespace
* $ kubectl api-resources --namespaced=false -> to get all resources which cannot be isolated by namespace
* $ kubectl api-resources --namespaced=true -> to get all resources which are namespace bound
* $ kubectl get configmap
* $ 

#### Other commands learned
* $ kubectl scale deploy/PODNAME replicas NUMBEROFSCLAES -> to scale up the number of pods
* $ kubectl api-versions -> to see all api supports
* $ kubectl autoscale deploy/PODNAME --cpu-percent=95 --min=1 --max=10 -> to set autoscaling for the deployed pods (horizontal auto scaler)
* $ kubectl get hpa/PODNAME -o wide -> to see the number of replicas presently running (HPA mean horizontal pod autoscaler)
* $ kubectl describe hpa/PODNAME -> to get the description of the running pod
* NOTE: There is a Vertical Pod Autoscaler (VPA) try checking that as well.

#### Syntax of the deployment YAML file
* there are three parts
    1. Metadata
    2. specification
    3. status - this will be automatically generated by the kubernates (there are two status desired and actual if they are different then kubernetes have mechanism to fix this.)


- Note: There is diffeent API version and kind for each particular deployment or service and respective to this there are different spec tags and metadata tags for deplyment and service.
- These Cofigurations are YAML files. and these configuration files are stored along with the application code.
- Template from Specification which have its own spec this where the blueprints are defined.
- Connections are etablished using labels and selectors which are defined in metadata labels. and specification tags contain selectors which have somethign called matchLabels which matches the labels name defined in metadata app tag.
- we can create namespaces using name space configuration file.

#### Namespaces in kubernetes
1. kube-system : it contains information about system processes, master and managing process, kubectl etc
2. kube-public : this is kubernetes public accessible infor without authentication
3. kube-node-lease : heartneat of nodes, availability of each node and more
4. default : if you dont specify the namespace everythign creates in default namespace


#### Reasons for using the namespaces
1. Namespaces can be restricted to teams and we can manage access to particular team for namespaces and alogn with this we can easily control the resources of the cluster per namespace basis such that no application cannot use more resources and can stay in there limit.
2. if there is an existsing deployment of other team with same name so then if other team comes up with other deployment with same name so the first deployment will be overrided thats why we will create namespaces.
3. we can share the common resources of a pod in same namespace for staging and development servers such that we can save some resources.
4. In production we will have blue and green deployments which are like blue mean existing deployment and green mean upcoming version of production these should obviously save the same resources so we use the same namespaces here as well.

#### characteristics of Namespaces
1. configMaps should be created for each namespace and cant be shared among namespaces so each namespace should have there own configMap though they contain same credentials and same applies to secret as well.
2. services can be shared among namespaces.
3. some namespaces live globally in cluster they are node, volume, persistent volume.


##  helm package manager
## handling volumes 
## stateful apps



## Miscellenous Linux commands
* $ echo -n 'value-to-encode-in-base-64' | base64
    - The above command will convert the text value-to-encode-in-base-64 into base64 format the result is dmFsdWUtdG8tZW5jb2RlLWluLWJhc2UtNjQ=
* $ echo -n 'dmFsdWUtdG8tZW5jb2RlLWluLWJhc2UtNjQ=' | base64 --decode
    - The above command is used to convert the base64 to the normal text format
