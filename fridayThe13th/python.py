from datetime import datetime

def fridaythe13th():
    # Verify that the user's input is a number.
    while True:
        try:
            friYear = int(input("Enter a year to find how which months had a Friday the 13th date that year: "))
            friYear = int(friYear)
            break
        except ValueError:
            print("This is not a number. Try again.")

    for i in range(1, 12, +1):
        friDate = datetime(friYear,i,13)
        if friDate.strftime("%A") == "Friday":
                print(friDate.strftime("%B"))
fridaythe13th()
