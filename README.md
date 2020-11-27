# Open-Close-RecyclerView
This repository contains a recyclerview with respect to open close principle. 

Implementing adapters is one of the most frequent tasks for an Android developer. It’s the base for every list. Looking at apps, lists are the base of most apps. when you need to have different kind of items in your views, you maybe violate OCP.

Scott Meyers in "Effective C++" says:
Anytime you find yourself writing code of the form “if the object is of type T1, then do something, but if it’s of type T2, then do something else,” slap yourself.

If you look at those adapters implementation that have switch case with instace cheking in onCreate and onBind Viewholder, there is a lot of slapping to be done.

you can see the 4 types of implementation in these repositories: 


https://github.com/hadi72h/Open-Close-RecyclerView/tree/hadi-approach


https://github.com/hadi72h/Open-Close-RecyclerView/tree/hadi-main-approach


https://github.com/abbasiehsan1991/Open-Close-RecyclerView/tree/second-way


https://github.com/cormen3/Open-Close-RecyclerView/tree/hossein-approach

