def mult(x, y):
    prod = x * y
    return prod

def printList(lst):
    i = 1
    for item in lst:
        print(str(i) + ". " + item)
        i = i + 1

def sumList(lst):
    i = 0
    for item in lst:
       i = i + item
    print(str(i))

#------------------------------

#num1 = int(input("num1\n"))
#num2 = int(input("num2\n"))
#print(str(mult(num1, num2)))

#xmaslist = ["Quest 3", "wireless earbuds", "Miata", "Communist Manifesto", "Anarchist's Cookbook", "Thermonuclear Warhead"]

#printList(xmaslist)

favnum = [67, 43, 41, 21, 27, 2, 6, 7,]

sumList(favnum)
