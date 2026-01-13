#-------------Methods-------------
# This method should return the largest of 3 integers
def largestOfThree(x, y, z):
    if x > y:
        if x > z:
            print(str(x)+" is largest")
        else:
            print(str(z)+" is largest")
    elif y > x:
        if y > z:
            print(str(y)+" is largest")
        else:
            print(str(z)+" is largest")
    elif x == y: 
        if y == z:
            print("all are equal")
    else:
        print("i didnt account for ts cro")

# This method should combine all the words in the list into a sentence with spaces between
def formSentence(wordList):
    sentence=""
    for word in words:
        sentence = sentence + word+" "
    return sent   
 #This method should combine all the words in the list in reverse into a sentence with spaces between
#def reverseSentence(wordList):
    
#--------------Code--------------
a = int(input("Enter a number: "))
b = int(input("Enter another number: "))
c = int(input("Enter another number: "))

ans = largestOfThree(a, b, c)
print()

words = ["This", "will", "become", "the", "coolest", "sentence", "yahoo"]
sentence = formSentence(words)
print(sentence)

print()
print("The same sentence backwards!")
#sentence = reverseSentence(words)
#print(sentence)
