# 1. Pattern
'''

****
****
****
****

'''

def ptn_1(n):
    for i in range(0,n):
        for j in range(n):
            print("*",end="")
        print()
    return None

# 2. Pattern
'''

*
**
***
****
*****

'''

def ptn_2(n):
    for i in range(0,n+1):
        for j in range(0,i):
            print("*",end="")
        print()
    return None

# 3. Pattern
'''

1
12
123
1234
12345

'''

def ptn_3(n):
    for i in range(n+1):
        for j in range(i):
            
            print(j,end="")
        print()
    return None

# 4. Pattern
'''

1
22
333
4444
55555

'''

def ptn_4(n):
    for i in range(n+1):
        for j in range(i):
            
            print(i,end="")
        print()
    return None


# 5. Pattern
'''

*****
****
***
**
*

'''

def ptn_5(n):
    for i in range(n, 0, -1):
        for j in range(i):
            print("*",end='')
        print()
    return None

# 6. Pattern
'''

12345
1234
123
12
1

'''

def ptn_6(n):
    for i in range(n, 0, -1):
        for j in range(1, i+1):
            print(j,end='')
        print()
    return None

# 7. Pattern
'''


      *
     ***
    *****
   *******
  *********

'''
def ptn_7(n):
    for i in range(n):
        
        for j in range(n-i-1):
            print(" ",end='')

        for k in range(2* i + 1):
            print("*",end='')
        print()
    return None

# 8. Pattern
'''

  *********
   *******
    *****
     ***
      *

'''

def ptn_8(n):
    for i in range(n+1):
        
        for j in range(i):
            print(" ",end='')

        for k in range(2* (n-i) + 1):
            print("*",end='')
        print()
    return None


# 9. Pattern
'''

      *
     ***
    *****
   *******
  *********
  *********
   *******
    *****
     ***
      *

'''

def ptn_9(n):
    
    
    for i in range(n):
        
        for j in range(n-i-1):
            print(" ",end='')

        for k in range(2* i + 1):
            print("*",end='')
        print()

    
    for i in range(n):
        
        for j in range(i):
            print(" ",end='')

        for k in range(2* (n-i) - 1):
            print("*",end='')
        print()
    return None

# 10. Pattern
'''

*
**
***
*****
******
*****
****
***
**
*

'''

def ptn_10(n):
    for i in range(n+1):
        for j in range(i):
            print("*",end="")
        print("")
    for i in range(n+1,0,-1):
        for j in range(i):
            print("*",end="")
        print("")


# 11. Pattern
'''

1
01
101
0101
10101

'''

def ptn_11(n):
    for i in range(n+1):
        for j in range(i):
            if(i+j) %2 == 0:
                print("1",end="")
            else:
                print("0",end="")
        print()
    return None

# 12. Pattern
'''

1      1
12    21
124  321
12344321

'''

def ptn_12(n):

    for i in range(1, n+1):
        
        
        # Inner Loop-> 1st Left Side Value.
        for j in range(1, i + 1):
            print(j,end="")
        
        
        # Inner Loop-> 2rd Add Space.
        for m in range(2*(n-i)):
            print("",end=" ")
        
        # Inner Loop-> 3rd Right Side Value.
        for j in range(i,0,-1):
            print(j,end="")
        
        
        
        print()


    return None


# 13. Pattern
'''

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

'''

def ptn_13(n):
    count = 1;
    for i in range(n):
        for j in range(i+1):
            print(count, end= " ")
            count+=1
        print()

    return None

# 14. Pattern
'''

A
A B
A B C
A B C D
A B C D E

'''

def ptn_14(n):
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + j), end= " ")
        print()

    return None

# 15. Pattern
'''

A B C D E
A B C D
A B C
A B 
A

'''

def ptn_15(n):
    for i in range(n,0,-1):
        for j in range(i):
            print(chr(65 + j), end= " ")
        print()

    return None

# 16. Pattern
'''

A
B B
C C C 
D D D D
E E E E E

'''

def ptn_16(n):
    for i in range(n):
        for j in range(i+1):
            char = chr(65 + i)
            print(char, end= " ")
        print()

    return None


# 17. Pattern
'''
   A
  ABA
 ABCBA
ABCDCBA 


'''

def ptn_17(n):
    for i in range(1, n + 1):
    # Left spaces
        for j in range(n - i):
            print(' ', end='')
    
    # Increasing letters
        for k in range(1, i + 1):
            print(chr(64 + k), end='')
    
    # Decreasing letters
        for l in range(i - 1, 0, -1):
            print(chr(64 + l), end='')

        print()

    return None


# 18. Pattern
'''

E
D E
C B E
B C D E
A B C D E

'''

def ptn_18(n):
    for i in range(n):
        char = 64 + n - i + 1
        for j in range(i):
            print(chr(char + j),end= "")
        print()

    return None


# 19. Pattern
'''

******
**  **
*    *
*    *
**  **
******

'''

def ptn_19(n):

# Upper Pattern
    for i in range(n,0,-1):

        for j in range(i):
            print('*', end='')
    
    # Middle spaces
        for k in range(2 * (n - i)):
            print(' ', end='')
        
    # Right stars
        for l in range(i):
            print('*', end='')

        print()



# Lower Pattern

    for i in range(1,n+1):

        for j in range(i):
            print('*', end='')
    
    # Middle spaces
        for k in range(2 * (n - i)):
            print(' ', end='')
        
    # Right stars
        for l in range(i):
            print('*', end='')

        print()

    return None

# 20. Pattern
'''
n=6

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *
'''

def ptn_20(n):

#-----------------------Upper Pattern

# Left Upper Pattern
    for i in range(n+1):

        for j in range(i):
            print('*', end='')


#-----------------------Middle Space Pattern

        for k in range(2*(n - i)):
            print(' ', end='')

#-----------------------Middle Space Pattern

# Right Upper Pattern

        for l in range(i):
            print('*', end='')

        print()

#-----------------------Upper Pattern
#-----------------------------------------------------|
#-----------------------Lower Pattern

# Left Lower Pattern
    for i in range(n-1,0,-1):

        for j in range(i):
            print('*', end='')


#-----------------------Middle Space Pattern

        for k in range(2*(n - i)):
            print(' ', end='')

#-----------------------Middle Space Pattern

# Right Lower Pattern

        for l in range(i):
            print('*', end='')

        print()

#-----------------------Lower Pattern



n = ptn_20(6)
