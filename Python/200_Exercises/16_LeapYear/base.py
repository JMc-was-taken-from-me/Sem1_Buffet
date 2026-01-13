usr = int(input("what year is it?\n"))

if usr % 4 == 0:
    if usr % 100 == 0 and usr % 400 != 0:
        print("not a leap year")
    
    else:
        print("leap year")
else:
    print("not a leap year")
