import random 

def number_gen():
  num = random.randint(1,10)
  guess = int(input('Enter a number: '))
  while guess!= num:
    print("The number is " + str(num) + ". Try Again.\n")
    guess = int(input('Enter a number: '))
    num = random.randint(1, 100)  # Generate a new random number for the next iteration
  else:
    print("You guessed right!, You win!")
    


if __name__ == '__main__':
  number_gen()
  