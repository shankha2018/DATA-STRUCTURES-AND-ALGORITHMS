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


# Array Rotation:

1. A Program to rotate an array by a given no. of elements.

**METHOD 1:** see **Code1: Array_Rotation(using Temporary Array).c**

**METHOD 2:** see **Code2: Array_Rotation(in Same Array).c**

# 2.LINKED LIST:

Linked List is a **linear** data structure. Unlike arrays, linked list elements are not stored at a contiguous location; the elements are linked using pointers.


A linked list is represented by a pointer to the first node of the linked list. The first node is called the **head**. If the linked list is empty, then the value of the head is **NULL**.
Each node in a list consists of at least two parts:
1) data
2) Pointer (Or Reference) to the next node.


# Limitations of Arrays:

1. The size of the arrays is fixed. So we need to know the upper limit on the number of elements in advance.Also generally the allocated memory is equal to the upper limit irrespective of the usage.Linked List,on the other hand, has dynamic sizes. 

2. Inserting a new element in an array of elements is expensive because the room has to be created for the new elements and to create room existing elements have to be shifted. Insertion/deletion in linked list is easier than that of arrays.


# Limitations of Linked List:

1. Random access is not allowed. We have to access elements sequentially starting from the first node. So we cannot do binary search with linked lists efficiently with its default implementation. 

2. Extra memory space for a pointer is required with each element of the list.

3. Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.








