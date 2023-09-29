## Topics covered under the Performance

Performance of a system is nothing but how fast the system responds to request volume or backend data under any load or given hardware of any kind and capacity (++++)
While measuring the perfromance we keep the request volume fixed and data stored is also fixed usually to high data stored.
Goal is to as we increase the workload it shouldnt degrade. On Hardware side if we increase the hardware it should improvise the performance.

#### problems we should identify to say that falls under performance
How spot a performance problem? how does it look like - Every performance problem is the result of some queue building up somewhere may in network socket queue, DB IO Queue, OS run Queue or more.
Reasons for queue build up

#### Measurement of the problem
- Inefficient slow processing may be coding issue
- Serial Resource access - like synchronous coding or single thread access. (Low Concurrency)
- Limited resource capacity - like limited number of CPU or RAM.

#### Principles related to performance
- 


#### Objectives
- minimize the request-response latency (this calculated as sum of waiting system time and system processing time) it includes request and response sevices like web app, API's and database response
- maximize the throughput (this means sum of latency and capacity where our goal is to maximize the throughput) - it includes batch processing since there is no concept of request response, it generates a report or message to next process.
> metrics to measure to performance of a system
* there are four important metrics
    - Latency - affects the user experience
    - Throughput - number of users can the system can support
    - Errors - Fucntional Correctness
    - Resource Saturation - hardware capacity utilization measurement
* tail latency - we can solve the whole performance issue by figuring out what is tail latency and solving it. it is nothing nbu tthe indication of queuing of requests usually gets or observed during higher workloads.


#### Latency (minimize the Latency to incrase the performance)
- Maximize CPU utilization
- Minimize Memory utilization
- Minimize the Disk usage and minimize Disk latency
- Minimize Network Latency

#### Effciency
- this we are talking in context of serial request processing and we are assuming that capacity of the system or hardware is moderate.
    * efficient resource utilization - this means it have resources like IO (Disk, memory and network) and CPU
    * efficient logic - Algorithms and DB queries which does minimal amount of work.
    * efficient data storage - Data structures and DB schema 
    * caching
        - Static Data Caching
        - Dyanmic Data Caching

#### Concurrency
> we will look only on solving the issues related to serial request processing and concurrent request processing (parallel request processing)
- Locking
    - Pessimistic locking - fetch the shared data and lock it, then we process this data and update the data with latest data and release the lock. this pessimisistic locking can be seem in database updates like we acquire a connection we do all the Updates and later we commit it this is kind of pessimistic locking.
    - Optimistic Locking - in optimistic locking the duration we hold the lock is very small, and how this works is we dont take any lock but query the data and perfrom our calculations that is processing the data and later we willl try to update the data to where before executing the update we acquire lock and do the update and if the update is success we commit and release lock, if failed we retry from starting.



> Pessimistic locking and optimistic locking are two different strategies used in database management systems and concurrent programming to handle situations where multiple users or processes may access and modify shared data concurrently. These strategies help ensure data consistency and prevent conflicts. Here's an overview of both approaches:

- Pessimistic Locking:

    * Pessimistic locking is a strategy where a resource (e.g., a database record) is locked by one user or process to prevent others from accessing or modifying it until the lock is released.
    * When a user or process requests a lock on a resource, it is granted exclusively to that requester, and other requesters must wait until the lock is released.
    * Pessimistic locking is typically used in scenarios where conflicts or data inconsistency must be avoided at all costs, and the likelihood of contention (multiple users trying to access the same resource simultaneously) is high.
    * It can lead to potential performance bottlenecks, especially in systems with high contention, as it can cause delays for other users who are waiting for the locked resource.
- Optimistic Locking:

    * Optimistic locking is a strategy where multiple users or processes are allowed to read and possibly update a resource simultaneously, but conflicts are detected and resolved when attempting to save changes.
    * It assumes that conflicts are rare, and most operations will not result in conflicts. Instead of locking, a version or timestamp is associated with the resource.
    * When a user or process tries to save changes, the system checks if the version or timestamp of the resource matches what was initially read. If it doesn't match, it means another user has modified the resource, and a conflict resolution mechanism (e.g., rolling back changes, merging changes, notifying the user, or prompting for manual resolution) is triggered.
    * Optimistic locking is suitable for scenarios where conflicts are infrequent, and the overhead of locking and blocking concurrent access would be too costly in terms of performance and user experience.
In summary, pessimistic locking prevents concurrent access to a resource by locking it exclusively for one user or process at a time, while optimistic locking allows multiple users or processes to access a resource concurrently but detects and resolves conflicts during the save/update phase. The choice between these two locking strategies depends on the specific requirements of the application, the expected concurrency, and the tolerance for conflicts and performance implications.


- Coherence - It defines the behavior of reads and writes to a single address location, these is caused by systems like databases which does require some lock to maintain the state of the application and consistent to all computers who are accessing it. 
- queuing 

#### Caching
- Static Data Caching
- Dyanmic Data Caching

#### capacity




##### Network Latency
> data transfer latency - this includes internet and Intranet usually is the faster one.

> creation of connections - there are connections like TCP, UDP. But in this we will discuss only on regards of TCP alone. creation of connection usually takes 100 percent of latency and if there connection is SSL or TLS connection then it takes 300 percent of latency since SSL requires two extra round trips like acknowledgements, key exchange, change cipher.

Approaches to solve the network latency - We cannot reduce the connection creation latency but we can resuse the connection if once created.
- Data Base connection - we can use something called as DB connection pooling which will done to keep the connection from server active. To understand what is DB connection pooling read this [Blog](https://www.cockroachlabs.com/blog/what-is-connection-pooling/)
- Web server connection - Persistenc connections (by default created by browser as per protocol HTTP 1.1), In case of reverse proxy call or REST service call we need to use or design the client library which uses the persistent connection.
- data transfer latency can be solved by compressing the data size, and also by not transfering data every time instead we can cache the data like in case of the web app design we can store the data in caching in web browser.
- we can RPC protocol, Thrift protocols instead of HTTP protocols. 
- SSL session caching

##### Memory latency
> Finite heap memory

- Finite heap memory is due to program or programming language uses certain amount of heap memory we can alter this if we want to avoid the problem out of memory issues

> Large heap memory

- process occupying the large heap memory in this case OS allocates the harddisk to accomodate the extra heap memory which swaps the memory between main memory and physical memory which is slow since we loose the random access facility and even slows down the garbage collection process since physical memory is slow to access.

> Garbage connection logic or algorithm 

- applying proper grabage collectin algorithm is always best.

> Finite buffer memory on database systems

- throughput of data base is purely defined on performance of finite buffer memory, where while doing the read and write operations it will usually load the data from physical memory to RAM and later operations are performed later written back to physical memory. so watching this buffer memory is crucial.
- Avoid memory bloat (this can be done with specific imports, and having smaller code base is better)
- weak or soft references (this is a concept in java refer to that once)
- multiple smaller processes are always better than one bigger processes.
- normalization of database tables leads to finite buffer memory.

> Disk Latency (this is most important since disk IO is most slower process)

- Logging it requires we go and write on a file - to avoid the latency logging all things at once helps to improve performance. and do asynchronous logging it will definetly help to improve the performance.
- Web content Disk latency will be handled by brining in load balancer or reverse proxy services like Nginx and provide the static files serving from there.

> CPU Latency

- Inefficient Algorithms - developers should handle the best efficient algorithms
- Context switching - Context switching is the process of switching from one process to another. It is a relatively expensive operation because the operating system has to save the state of the current process and restore the state of the new process. Context switching between threads is much cheaper than context switching between processes. 
- Steps to reduce the Context Switching - Batch/Async IO (batching all the IO operations to one single process and calling it will minimize the context switching, we can also write lofs in Async calls for Write IO operations which can be done in spearte process or thread.)
- find the optimal thread pool size.

------------------------------- 
#### Parallel Request Concurrecny
- What is concrrent processing? - its nothing by parallel request procesing kind of asynchronous processing.
- Amdhal's Law (this deals with only queuing) - the maximum potential improvement to the performance of a system is limited by the serial portion of the system that cannot be improved. It provides a way to predict the potential speedup of a computation when parallel processing is applied to it. Amdahl's Law is often used to assess the theoretical limits of performance improvement in a system due to parallelization. The basic idea behind Amdahl's Law is to consider a computation that consists of both parallelizable and non-parallelizable parts. The law is expressed as a formula: Speedup(S) = 1 / [(1 - P) + (P / N)]
- Where: Speedup (S) represents the potential improvement in execution time when using parallel processing compared to a sequential (single-processor) execution. P is the proportion of the computation that can be parallelized (i.e., the fraction of the computation that can be split into parallel tasks). N is the number of processors or processing elements used for parallel execution.
- Gunther's Universal Scalability law (it deals both with queuing and coherence) -  if we start using the volatile variables then in that case the coherence cost is very high. 

> Contention

- A contention is a conflict when two or more programs try to use the same resource or setting at the same time. With a network, a contention is when two or more computers try to access the same file at the same time. to avoid contention we use the volatile varaibles in multiprocessing systems.
- Disk is biggest source of contention for example databases uses or perform alot of Disk IO operations whcih are main reason for contention.
- We can use RAID disks which allows parallel access to disks in multiple disks for same data which is kind of parallel way of accessing.
- Thread pool size is usually we have to decide based on the number of threads we require to handle a backend server and we will have to assume on linear way in best case possible that each thread will be able to support a connection so out connection pool size will also be equal to thread pool size, that means if we have 100 threads then we can process like 100 connections per second, but this is not suffieicnt its a general assumption but in real world scenario it will be like we will have a database connection pool from backend server will eventaully keep certain threads busy to maintain the connection with database. thus we can conclude that connection pool of users is always less than or equal to thread pool size of system.

- Minimize Lock Contention:
    1. to reduce the lock duration we usually move out the code out of synchronorization block, that doesnt require a lock (especially an IO)
    2. Lock splitting: split lockl code into lower granularity such that it will processed on two locks and duration on which these locks will be held is also reduceed.
    3. Lock Stripping: Split locks for each partition of data like in concurrent hashmap.
    4. Compare and Swap mechanism - it is basically the optimisitic locking mechanism which is used by operating system, java implements it by using atomic classes from java.util.concurrent.atomic.* . this basically does the same thing what is done optimistic locking basically we compare and set the values if the compare is false it need to recheck the values and does this till gets compare value to true.

- Dead locks - 
- coherence delays - 

-------------------------------

Misccellenous Terms and its explanation 
--------------------

1. TLS - Transport Layer Security
2. SSL - secure socket layer
3. Volatile variable - this is used in java where its makes sures that copy of the variable across threads should be same, and this volatile varible make sures thats same. its not available in python since python always reads the data from memory location, where In other programming languages, a volatile variable is a variable that can be modified by an external source, such as the operating system or another thread. The volatile keyword tells the compiler that the value of the variable can change at any time, and that the compiler should not cache the value of the variable. This is important for ensuring that multiple threads can access the variable safely.
