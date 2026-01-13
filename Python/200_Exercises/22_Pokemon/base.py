import requests

usr = input("what pokemon do you want to know about") 

pokemon = requests.get("https://pokeapi.co/api/v2/pokemon/"+usr).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer

print(pokemon["name:\n"])
print("abilities: " + pokemon["abilities"])
print("forms: " + pokemon["forms"])

