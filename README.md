# Seating_Arrangement
Problem: Seating Arrangement
Input1: An integer representing total number of students.
Input2: An integer array A, representing preferred seats of students.
Output Specification:<br>
Print an integer array representing the order in which the seats will get occupied according to their attempts to sit in their preferred seats.
Example 1:  <br>
input1: 3   <br>
input2: {3,2,2} 

Output: 3,2,1 <br>
Explanation: Given an array with 3 students and their preferred seats {3,2,2}, we can find the final arrangement in the following way:

Initially, all the seats are empty: {0,0,0}.
- The first student wants seat number 3, which is vacant.They occupy it, resulting in: {3,0,0}.
- The third student wants seat number 2, but it is occupied. They search in a circular manner and find seat number 1 vacant. They occupy it, resulting in the final seating arrangement: {3,2,1} 
