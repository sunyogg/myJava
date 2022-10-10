
# nums = [123, 12, 32 ,1, 1, 3453, 45323]


# def listNum(numList):
#     """This method will print even digit in a number in a list"""
#     counter = 0
#     for s in range(len(numList)):
#         numInStr = str(numList[s])
#         result = len(numInStr)
#         if result % 2 == 0:
#             counter += 1
#     return counter


# so = listNum(nums)
# print(so)











def add(a , b) :
    c = a+b
    return c 

def subtract(a , b) :
    c = a-b
    return c

def multiply(a , b) :
    c = a*b 
    return c

def divide(a , b) :
    c = a/b
    return c


print("Select operation")
print("1. for addition")
print("2. for subtraction")
print("3. for multiplication")
print("4. for division")

while True :
    choice = int((input("Enter your choice (1/2/3/4) : ")))
1
    num_1 = int(input("Enter the first number: "))
    num_2 = int(input("Enter the second number: "))
    

    if choice == 1 :
        print (f"{num_1} + {num_2} = {add(num_1 , num_2)}")
    elif choice == 2 :
        print (f"{num_1} - {num_2} = {subtract(num_1 , num_2)}")
    elif choice == 3 :
        print (f"{num_1} * {num_2} = {multiply(num_1 , num_2)}")
    elif choice == 4 :
        print (f"{num_1} / {num_2} = {divide(num_1 , num_2)}")

    another_calculation = input("do you want to do another calculation , (yes/no)?")
    if another_calculation == 'no' :
        break


        




























