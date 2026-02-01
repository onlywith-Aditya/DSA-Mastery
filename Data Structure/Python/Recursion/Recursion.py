# def factorial(n):

#     if n == 0:
#         return 1

#     return n * factorial(n - 1)


# if __name__ == "__main__":

#     num = 5
#     print(factorial(num))


# Recursion program of fabonacci Series

def fabo(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else: return fabo(n-1)+fabo(n-2)


if __name__  == "__main__":
    n = 5
    print("Number is : ", n)
    for i in range(n):
        print(fabo(i), end=" ")
