## Make Change Project

### Week 1 homework for Skill Distillery.

## Overview: Make Change

After week one of Skill Distillery, our first homework assignment was to develop a program that calculates exact change owed to a buyer given the cost of the item and the amount of money used to pay.

Assignment Guidelines:

Calculate the amount of change returned to a customer based on the purchase price and the amount tendered. Notify the attendant how many of each piece of currency (twenties, tens, fives, ones, quarters, dimes, nickels, and pennies) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

## Technologies/Skills Used

Working the process from start to finish, I began by building a Scanner to record user input to assign the cost of the item and the amount tendered to Double variables.

Next I created If statements that would determine one of three things. If the funds provided were lower than the cost of the item, a message would be printed stated the buyer had insufficient funds. If the buy gave exact change a message would be printed acknowledgeing that and would end the transaction. If the buy provided more funds than the cost of the item, then the program would move on to calculating their exact change.

Change is determined by the amount given minus the cost of the item. Using the determined change amount I used if statements to run through how many of each piece of currency was needed. I started with the largest (twenties) working all the way down to pennies. This ensured that the change given used the largest bill and coin denominations.


* Java
* Eclipse
* Git

## Lessons Learned

While working through this project I began to see many of the basic Java skills learned throughout the course pre-work and reviewed during the first week.

Personally I learned how to take the concept presented in the assigned, transition it to a vision in my mind, then work to utilize the skills learned to build the code to execute the final project.

Technically I learned how to work through problems by trial and error. Making minor changes to existing code and checking the effects on the product. I learned that sometimes when casting doubles to int variables, and when making calculations using int variables in general there can be mathmatical errors resulting in incorrect results.
