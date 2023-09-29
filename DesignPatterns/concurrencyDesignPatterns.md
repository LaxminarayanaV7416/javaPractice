# Concurrency Design Patterns
* Design Patterns which deal with concurrent, asynchronous:

## Read write lock
----------------
> Synchronization primitive for solving read-write problem in concurrent computing.


## Thread Object 
----------------
> C++ thread can call only call static functions, thread object is a wrapper around the run function.


## Callback
----------------
>

## Event / Task queue 
----------------
> Events/Tasks waiting to be processed by a worker in a FIFO data structure.


## Thread Pool
----------------
> Multiple threads waiting for tasks to be allocated for concurrent execution.


## Scheduler 
----------------
> Schedules task based on some priority event / task queue


## Active Object -
----------------
>

## Balking 
----------------
> Executes an action on an object when the object is in a particular state.



## Barrier 
----------------
>


## Double-checked locking
----------------
>


## Guarded suspension 
----------------
>

## Leaders/followers 
----------------
>

## Monitor Object
----------------
>


## Nuclear reaction
----------------
>

## Reactor
----------------
>




### miscellenous patterns
----------------
* Active Object: A pattern that encapsulates a thread and provides a way to interact with it safely.
* Actor: A pattern that uses message passing to achieve concurrency.
* Barrier: A pattern that allows a group of threads to wait for all of them to reach a certain point before proceeding.
* Double-Checked Locking: A pattern for ensuring that an object is only initialized once.
* Lock: A pattern for protecting shared data from concurrent access.
* Producer-Consumer: A pattern for coordinating the production and consumption of data between two threads.
* Read-Write Lock: A pattern for allowing concurrent readers to access shared data while preventing concurrent writers.
* Semaphore: A pattern for controlling the number of threads that can access a shared resource at the same time.
* Thread Pool: A pattern for managing a pool of threads to improve performance and reduce resource usage.

### Other type of architecture patterns to check
* Architectural Pattern
* Enterprise Integration Pattern
* Message Queue Pattern
* Security Architecture Pattern
* Web Security Pattern