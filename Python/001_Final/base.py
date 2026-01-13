# Type "pip install sklearn" into the terminal
import json
import random
import joblib
from datetime import datetime
import requests

def get_response(tag):
    responses = []
    for intent in data:
        if intent["tag"] == tag:
            responses = intent
            break
    response = random.choice(responses["responses"])
    return response

#--------------------------



model = joblib.load("./intents.pkl")

with open("./intents.json") as file:
    data = json.load(file)["intents"]

print("\n=================================================================\n\nWelcome to Ultidank\n\nask it about anything to do with the Dankpods Cinematic Universe (do not ask about the dcu, it's not a real term)\n\ntype 'exit' to leave the program\nIt will not save you if you ask about the dcu. Enjoy! :)\n\n=================================================================\n\n\n\n")

while True:
    user_input = input("You: ")

    if user_input.lower() == "exit":
        print("Ultidank is now dead, congratulations")
        break

    predicted_tag = model.predict([user_input])[0]
    response = get_response(predicted_tag)

    print("Ultidank: " + response)

    if response == "why did you ask about that?":
        while True:
            print("you shouldn't have asked that\nyou should've listened to the console")
