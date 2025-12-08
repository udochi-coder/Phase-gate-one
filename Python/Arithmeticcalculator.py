import random

totalscore=0
totalattempts=0
random.random()

for number in range(1,11):
    questone=random.randrange(1,101)
    questtwo=random.randrange(1,11)
    print("Welcome to Udochi simple arithimetic calculator app!!you have 10 marks for each question! Question= " , questone ,"-" , questtwo)
    useranswer=int(input("Enter your answer: "))
    answers=questone - questtwo
    if useranswer == answers:
        print("You are correct!!Genius!!!")
    totalscore+=10
    if useranswer != answers:
        print("You are slowly becoming an olodo o, simple subtraction!!Try again!!! ")
        totalattempts+=1
    while totalattempts == 2 :
        print("You missed this simple subtraction twice? why?Anyways I dont want to know ,here is the answer= " , answers )
        print("Welcome to Udochi simple arithimetic calculator app!!you have 10 marks for each question! Question= " , questone ,"-" , questtwo)
        useranswer=int(input("Enter your answer: "))
        
        


print("Quiz Finished")
print("Your Score is=" ,totalscore ,"/100")






