# Linux Administration
-------------------------
Available Linux Distributions - There are three major distribution families they are
1. Redhat Family System - Fedora, CentOS, Oracle Linux - YUM is the package manager
2. SUSE Family System - openSUSE - RPM-based Zypper package manager, YaST for sysrem admin purposes
3. Debain Family System - ubuntu, Linux Mint - DPKG-based APT package manager (most widely used for cloud deployments)

```NOTE: if you want to explore more we can use the man command which represents the manual pages```

# Basic terms in Linux operating system:
------------------------------------------
1. Kernal - brain of linux operating system it controls hardware from the application and interacts hardware with application
2. Distribution - also known as distro is collection of various softwares or applications
3. Boot Loader - programs thats boots the operating system eg; GRUB and ISOLINUX
4. Service - program that runs as background process (httpd, ftpd, named)
5. file systems - formats of storing in harddisk - ExFAT, NTFS, ext3, ext4, XFS and Btrdfs
6. X Windows Systems - protocol to build the GUI - GNOME, Fluxbox
7. Command line - shell (bash, tcsh, zsh)
8. Daemons - services running in background.

# Boot Process:
----------------
1. BIOS - basic input/output system intializes hardware including screena nd keyboard. (its stored on ROM chip of motherboard).
2. MBR (Master Boot Record) - this very the boot loader is stored
3. Bootloader - GRUB (grand unified bootloader) its responsible for loading the kernal image in file system in memory.
4. Kernal - its kicked in from the Initial RAM disk
5. Inital Ram Disk - initramfs image - this contains all programs to mount the proper driver systems.
6. /sbin/init (parent process) - after the initramfs the system binaries are started from sbin/init folder where it will start executing and run all the services as daemons.
7. systemd - processes or daemons with systemd are all started parallely so which are running as daemons.
8. systemctl - is also known as system control where we start, stop, restart, enable and disable the daemons in the operating systems.

# Linux file ystse

# Linux File System: [Link to video for below content](https://www.youtube.com/watch?v=HbgzrKJvDRw&t=13s)
----------------------
Linux distros follows a standard called FHS(filesystem Hierarchy Standard), the folders present at the root level and what contents they have are below.
* bin - binaries these are basic programs which we use in the shell or command line these include ls, cat, pwd and more.
* sbin - system binaries that a system administrors use and standard user doesnt have permission. SU single user mode which doesnot have access to networking and we perform testing.
* boot - this contains all files which is useful for the system to boot up. bootloaders live here.
* dev - this is where our devices live like we can find the harddisk and partitions live, we can alos find the keyboard and mouse files.
* etc - excetra added to config like system wide config like apt where sources list place where the package manager looks for various applications.
* home - each user have there own home folder, it contains all user related files and folders like Desktop, Downloads and more. 
* lib - lib32, lib64, these are libraries are stored which are used by bin, sbin and more
* mnt or media - we find the other mounted drive like harddisk, Drive A, and more, network drive and more. mnt is used for manual mounts, media is used by Operating system to mount automatically.
* opt - optional folder additionally installed softwares resides.
* proc - sudo files this contains all current process files we can locate them from PID number and we can see the information. 
   * ```$cat /proc/cpuinfo```
   * ```#cat /proc/uptime```
* root - its the root users home folder
* run - its the temporary folder
* snap - this is where snap packages are stored - mainly used by the ubuntu
* srv - it stores the server files if we run the FTP server.
* sys - this is a system directory this is everytime clean for each system restart and starts storing system to kernal interaction.
* tmp - temporary directory its session based (usually empty when reboots).
* usr - user applciation space where applications installed by each user stored here.
* var - its the variable director, this folder contains files which grow on time like mail and more.
* 