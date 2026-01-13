usr = input("number\n")
x = 1
y = 0
#   x is the one being incremented and used for visualizing the equation. y is used to sum up the actual numbers using x's incremention
for i in range(0,int(usr)):
    print(str(x), end="")
    y = y + x
    x = x + 1
#   prints "+" when loop isnt finished, prints the answer when loop is done
    if i != int(usr)-1:
        print("+", end="")
    else:
        print("\n= "+str(y))
