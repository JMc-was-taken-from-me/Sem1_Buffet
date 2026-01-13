import random

rng = []
usr = int(input("number, how many?\n"))

for i in range(0,usr):
    rng.append(random.randrange(0,11))

print("your numbers are " + str(rng))
