str = input("what think you of sPoNgEcAsE?\n")
i = 2

# A String variable can be made upper or lower case given the following methods
str = str.lower()
str = str.upper()
# These commands turn the entire String to upper or lower case and stores it back in str

# The following loop goes through each letter in str one by one. 
# char becomes each letter for each loop!

for char in str:
    if i % 2 == 0:
        char = char.lower()
        print(char, end="")
    else:
        char = char.upper()
        print(char, end="")
    i = i + 1
