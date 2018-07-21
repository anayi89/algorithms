def aPlusB():
    a = int(input("Enter a number: "))
    b = int(input("Enter another number: "))

    # Verify that the user's inputs are numbers.
    while True:
        try:
            a = int(a)
            break
        except ValueError:
            print("This is not a number. Try again.")
        try:
            b = int(b)
            break
        except ValueError:
            print("This is not a number. Try again.")
    sum = a + b

    # Display the sum
    print('{0} + {1} = {2}'.format(a, b, sum))
aPlusB()
