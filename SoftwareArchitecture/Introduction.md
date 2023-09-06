## Software Desings and Its Best Practices along with the Tech Stack Information.
#### This information is pureluy wide and covers all the topics related to the architecture and all theory aspects are covered in this material.
----------------------
* Performance - perfromance talks about satisfying the most request by increasing the throughput and decrease the latency of user requests.
----------------------
* Scalability - how to make our system scalable and handle any user traffic at any point of time.
----------------------
* Reliability - how to make system resilient to failures and make sure our system is highly available in case of any failure as well.
----------------------
* Security - what security principles we should follow, authentication and much more security principles we should follow.
----------------------
* Deployment - Deplyment stack like CI-CD pipelines and its automation.
    - Tools I came across till now and adding them here for reference for proof reading.
        * Jenkins - This is used to build the Pipelines known as continous Integration Pipelines, currently market is trended towards the Github Actions, Gitlab runner and Circle CI.
        * Sonar cube -  for code lint checking which analyses the quality of code.
        * Code Build tools - maven, PIP, NPM and if we are containerizing the application we do it here.
        * Testing Suites - we can use the Selenium for Web testing or achieving any automated test cases or else we can wirte our own testing Suite using language based test suites like for python its the unittest module or pytest and more.
        * Code Artifacts - these are places where we store the compiled build applications and these artifcats expose the API through which we can integrate the deployment examples are jfrog artifactory, AWS code artifcats, Nexus and more.
        But now a days we are taking a different directions in the code build due to microservice enforcement where we will also use the Docker hub, AWS ECR and more.
        * Infrastrucre as a Service - these store the infrastructre settings such that if something happens these have the information to reprovision the infrastructure tools under these are Terraform, AWS Cloud Formation, Azure ARM(Azure Resource Manager).
        * Kubernetes - for the scaling and deployments,services and much more to achieve the auto scaling.
        * Promethius - This is the tool related to the monitoring the kubernetes cluster.
        * Data Dog - for logging the application status and monitoring the application level to set alerts and more.
----------------------
* Technology Stack Information - this will focus on technology selection which are like for each requirements of system is given what Tech Stack should be choosen for satifying above all four aspects like Performance, Scalability, Reliability and Security.
----------------------