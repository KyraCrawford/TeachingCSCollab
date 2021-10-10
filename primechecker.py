#program to check if a given number is prime

#OBJECTIVE: print "True" if the given int is prime

from math import sqrt

number = int(input("Enter a positive integer greater than 1: "))
primetrack_bool = False

if(number > 1):
    for i in range(2, int(sqrt(number)) + 1): #iterates until more than two factors are found
        if (number % i == 0): #if there is no remainder, the num is not prime (more than 2 factors)
            primetrack_bool = True
            break #stopping this if statement
    if (primetrack_bool == False):# display 'True' if the number is not flagged as not prime
        print("True")
    else:
        print("False") #this could be an elif with the condition primetrack_bool == True
else:
    print("Invalid number")