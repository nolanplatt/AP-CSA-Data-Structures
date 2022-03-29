---
layout: default
permalink: /datastructures
---
{% include navigation.md %}
# Data Structures 

### **Week 2**
* [Problem Solutions](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge2/imports/Calculator.java)
* Code Snippets:
   * [Snippet 1](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge2/imports/Calculator.java#L179-#L192)
   * [Snippet 2](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge2/imports/Calculator.java#L199-#L200)
   * [Snippet 3](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge2/imports/Calculator.java#L202-#L215)
* [Replit Runtime](https://replit.com/@nolanplatt/AP-CSA-Data-Structures#challenge2/Challenge2.java)
* [Review Issue](https://github.com/rpeddakama/AP-CSA-T3/issues/28)

* Key Learnings In Week 2:
This week, I deeply progressed my understanding of data structures and how they work in Java. Using Mr. Mortensen's base code, I expanded to include both powers (^) and, the optional extra credit SQRT() function. Most interesting to me was how sensitive Stacks are in Java. For a while, I was struggling to troubleshoot my code after getting an "EmptyStackException". After some testing, I realized some of my if  statements, as well as switch cases, were not testing if the stack was > 0 (e.g. NOT empty), and therefore, in some cases, my own code was trying to remove something that doesn't exist, hence breaking the code. This furthered my learning as it shows how careful you need to be when, especially in Java, working with data structures (and mroe specifically Stacks and LinkedLists as well). Furthermore, I learned how we need to approach problems we face in data structures highly intuitively. One example of this was when I was finalizing my Reverse Polish  Notation (RPN) to the Stack to compute, and I noticed that I was having problems casting an Object to  a Double in order to make the computation. At first, I was going to waste several minutes by changing every computation to cast to a Double; but, after approaching intuitively - I saw I could make two new local variables and cast from the old ones in order to avoid excessive and bad code. One major takeaway from all of this, is in programming and data structures specifically, we need to avoid bad code - even if it works, we need to always do our best to resort to clean and concise code.



### **Week 1**
* [Problem Solutions](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge1/Challenge1.java)
* Code Snippets:
   * [Snippet 1](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge1/Challenge1.java#L59-L66)
   * [Snippet 2](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge1/Challenge1.java#L69-L75)
   * [Snippet 3](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge1/Challenge1.java#L86-L131)
   * [Snippet 4](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge1/Challenge1.java#L141-L150)
* [Replit Runtime](https://replit.com/@nolanplatt/AP-CSA-Data-Structures#challenge1/Challenge1.java)
* [Review Issue](https://github.com/rpeddakama/AP-CSA-T3/issues/22)

* Key Learnings In Week 1:
During this week's challenges, I learned much more about Queues/LinkedLists, Stacks, and how they fit into the OOP paradgim. Before this week, I never really considered or thought about how data structures are literally crucial to the usage of algorithms. During this challenge, I used several algorithms with my data structures. This can be seen in some of my code snippets above. I believe one of my biggest takeaways from this challenge is the usage of a Stack to reverse a Queue. I've known how queues work (push and pop), but never really thought how those could be used with Queues for the purpose of reversing one - or even normalizing a Queue if it's already reversed. It opened my eyes on how, when we're working with data structures, we need to look at it intuitively rather than objectively; if we look at it objectively, we will fail to see other data structures (like Stacks) that we can use to easily meet our task.
### **Week 0**
* [Problem Solutions](https://github.com/nolanplatt/AP-CSA-Data-Structures/tree/main/challenge0)
* [Code Snippet(s)](https://github.com/nolanplatt/AP-CSA-Data-Structures/blob/main/challenge0/imports/Swap.java#L8-L24)
* [Replit Runtime](https://replit.com/@nolanplatt/AP-CSA-Data-Structures#challenge0/Main.java)
* [Review Issue](https://github.com/rpeddakama/AP-CSA-T3/issues/4)
