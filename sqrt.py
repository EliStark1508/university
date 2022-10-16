import math

##The first column is a number, a
#the second column is the square root of a computed with mysqrt
#the third column is the square root computed by math.sqrt
#the fourth column is the absolute value of the difference between the two estimates
##

import math

def my_sqrt(a):
    x=6
    while True:
        y = (x + a/x) / 2.0
        if y == x:
            break
        x = y
    return(x)

def test_square_root():
    a = 1
    while a < 25:
        print('a =', a, '| my_sqrt(a) =', my_sqrt(a), '| math.sqrt(a) =', math.sqrt(a), '| diff =',
              abs(math.sqrt(a) - my_sqrt(a)))
        a = a + 1
    return 0
print(test_square_root())
