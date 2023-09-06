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


#### Latency (minimize the Latency to incrase the performance)
- Maximize CPU utilization
- Minimize Memory utilization
- Minimize the Disk usage and minimize Disk latency
- Minimize Network Latency

#### Concurrency
- Locking
    - Pessimistic locking
    - Optimistic Locking
- Coherence

#### Caching
- Static Data Caching
- Dyanmic Data Caching
