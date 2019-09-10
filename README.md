# DATA-STRUCTURES-AND-ALGORITHMS


# 1.ARRAYS:


An array is collection of items stored at contiguous memory locations.The memory location of the first element of the array (generally denoted by the name of the array)is the base address adding an offset to which makes the task of finding the position of each element easier. The idea of an array is to represent many instances in one variable.

# Types of indexing in array:
1. 0 (zero-based indexing): The first element of the array is indexed by 0

2. 1 (one-based indexing): The first element of the array is indexed by 1

3. n (n-based indexing): The base index of an array can be freely chosen. Usually programming languages allowing n-based indexing also allow negative index values and other scalar data types like enumerations, or characters may be used as an array index.

# Advantages of using arrays:

1. Arrays allow random access of elements. Accessing elements by position becomes faster.

2. Arrays have better cache locality that can make a pretty big difference in performance.

# Array declaration in C/C++:

   1. **int n = 10;** 
   
      **int arr[n];**
      
      or
      
      **int arr[10];**
      
      This is array declaration **by specifying size**.
      
   2. **int arr[] = { 10, 20, 30, 40 };**
   
      This is array declaration **by initializing elements**
     

   3. **int arr[6] = { 10, 20, 30, 40 };** 
   
      or
      
      **int arr[]={10,20,30,40,0,0};**
      
      This is array declaration **by specifying size and initializing  elements**
      
      
   **NOTE:** There is no index out of bounds checking in C/C++ie.it compiles fine but may produce unexpected output when run.







