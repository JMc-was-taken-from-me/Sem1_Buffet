#Run "pip install yfinance" in a terminal

import yfinance as yf

comp = input("Which company do you want to loop up stock info for? (use their ticker, not case sensitive)\n")
stock = yf.Ticker(comp.upper())
current_price = stock.history(period="1d")["Close"][0]
info = stock.info

for i in range (0,10):

    print(yf.Ticker(comp.upper()), end = "\n")
    print(info["longName"], end = "\n")
    print(info["website"], end = "\n")

    print(comp.upper()+" current price: ", current_price, end = "\n")

    comp = input("\nwhat other company's info do you want?\n")
