import random

def guessTheNumber():
    x = random.randint(1, 11)

    # Verify that the user's input is a number.
    while True:
        try:
            y = int(input("Guess what number I am thinking of (between 1 and 10): "))
            y = int(y)
            y > 0 and y <= 10
            break
        except ValueError:
            print("This is not a number. Try again.")
    
    while x != y:
        if(x > y):
            print("Your guess is too low.")
            y = int(input("Guess what number I am thinking of (between 1 and 10): "))
        elif(x < y):
            print("Your guess is too high.")
            y = int(input("Guess what number I am thinking of (between 1 and 10): "))
        else:
            break
    print("Yes, the number is {0}.".format(x))
guessTheNumber()
