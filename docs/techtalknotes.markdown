---
layout: default
permalink: /techtalknotes
---
{% include navigation.md %}
# Tech Talk Notes


## **Tech Talk 3 | Sorts**
* CB-level Sorts that need to be familiar w/  → Bubble Sort, Selection Sort, Insertion Sort
 → need to build Merge Sort using a data structure that "supports binary analysis"
* Need to build Wiki to show complex understanding of "Big O" notation 
 → need to implement this into project somehow
 → need to create analytical tracker to show which sort has best swap avg. 
  → run at least 10 times
   → calculate an average for each
* Also, need to establish timer
  → calc. average time for each sort
* After all this  → give conclusion on which sort is the best for loading different Data Structures
  → should decide this by using all of the following *comparisions, swaps, big o complexity, and time (nanoseconds)*
* Timing example (see code on J. Mortensen's TT3: Sorts):
```
Nanoseconds: 7356000
Nanoseconds: 3186000
Nanoseconds: 1808000
Nanoseconds: 1625000
Nanoseconds: 1585000
Nanoseconds: 1593000
Nanoseconds: 1627000
Nanoseconds: 1595000
Nanoseconds: 1624000
Nanoseconds: 1603000
Average    : 2360200
```

## **Tech Talk 2 | Calculator**
* Mathematical expression→ "finite combination of symbols that is well-formed according to rules that depend on the context"
*  Can be hard to calculate in computers w/ "precedence rules" → need to convert strings into *Reverse Polish Notation (RPN)*
 via the "Shunting-yard Algorithm"
![Shunting-yard Algorithm](https://ds055uzetaobb.cloudfront.net/brioche/uploads/znDrlV7Th2-c1f3db0cf4738e82ea1535ccc835bb7f747e7abb.jpg?width=1200)
* Need to use both Stacks and ArrayLists to build a Calculator
* To test our calculator, we need to use a driver.
*  → need to consider multiple conditions
*  → need to define Data Structures to define operators
*  → need to define symbols (not operators) in order to split terms of expression
*  → need to test functions
* Need to think of flow of control via RPN algorithm 
*  → e.g. going from flow of control to terms/tokens, RPN, and final result (final calculation)
* *Tokenizer* → used to change a String expression into a series of tokens - a distinct element of a Mathematical expression
*  → requires use of .toString()
* Sample output (from TT2, J. Mortensen):
```
Simple Math
Original expression: 100 + 200  * 3
Tokenized expression: [100, +, 200, *, 3]
Reverse Polish Notation: [100, 200, 3, *, +]
Final result: 700.00
```

## **Tech Talk 1 | Linked Lists Part 2**
* Need to be familiar w/ Linked Lists, Circle Queues, and Stacks
*  → acompanying data w/ these structures ("nodes")
* to be advanced neeed to use foreach loop and generic data support (think Arrays/ArrayLists)
* Queues have a "tail"→  which is where new data is added. You can add, adjust, and delete items in a queue.
* We can merge or combine multiple Queues (challenge for this week).
* We can use Stacks and Queues simultaneously
* Java Generic Types →  Java For Each/Enhanced For Loops
* We can (mostly) easily iterate through queues & stacks
## **Tech Talk 0 | Data Structures**

* Data Structure → a "method of organizing data". They hold a single integer value (maybe like n=3) or they can hold multiple items (arrays, arraylists, stacks, queues, etc). 
* Data Strucs + Algorithms → interact simultaneously in the CS paradigm. 
* Array→ fixed length
* ArrayList→ no fixed length (variable/changes)
* HashMap→ index and value
* Algorithms *always* acompany data structures (e.g. the Fibonacci sequence - we must use both algorithms and data structures)

