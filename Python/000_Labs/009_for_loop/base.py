num = int(input("how long will this line be?\n"))
usr = input("will this line be vertical or horizontal\n")
while True:
    if usr == "vertical" or usr == "horizontal":
        break
    else:
        usr = input("sir, will this line be ''horizontal'' or ''vertical''?\n")

if usr == "vertical":
    for x in range(0,num):
        print("         |")
elif usr == "horizontal":
    print("\n\n\n")
    for x in range(0,num):
        print("-", end="")
    print("\n\n\n")
