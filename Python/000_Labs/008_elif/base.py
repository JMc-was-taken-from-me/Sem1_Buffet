num1 = float(input("num1\n"))
num2 = float(input("num2\n"))
op = input("what operation?\n")

if op == "+" or op == "plus" or op == "Plus":
    print(str(num1 + num2))
elif op == "-" or op == "minus" or op == "Minus":
    print(str(num1 - num2))
elif op == "*" or op == "x" or op == "X" or op == "multiply" or op == "Multiply" or op == "multiplication" or op == "Multiplication":
    print(str(num1 * num2))
elif op == "/" or op == "÷" or op == "divide" or op == "Divide" or op == "divistion" or op == "Division":
    print(str(num1 / num2))
