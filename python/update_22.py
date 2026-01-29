def fizzBuzz(number):
    # 1. Check for both 3 and 5 first (or 15)
    if number % 3 == 0 and number % 5 == 0:
        print("FizzBuzz")
    
    # 2. Check for 3
    elif number % 3 == 0:
        print("Fizz")
        
    # 3. Check for 5
    elif number % 5 == 0:
        print("Buzz")
        
    # 4. Otherwise, print the number
    else:
        print(number)
