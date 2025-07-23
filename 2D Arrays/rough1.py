for rows in range(0,7):
    for columns in range(0,7):
        if(columns == 1 or (((rows == 0) or (rows == 3)) and (columns > 0 and columns < 5)) or (((rows == 1) or (rows == 2)) and ((columns == 1) or (columns == 5))) or ((rows == 4 and columns == 3) or (rows == 5 and columns == 4) or (rows == 6 and columns == 5))):
            print("*", end='')
        else:
            print(" ", end='')
    print("")

print("")

for rows in range(0,7):
    for columns in range(0,7):
        if(columns == 1 and (rows < 6 and rows > 0) or ((rows == 0 or rows == 6) and (columns > 1 and columns < 5)) or ((rows == 3 or rows == 4 or rows == 5) and (columns == 1 or columns == 5)) or (rows == 3 and (columns > 2 and columns < 6))):
            print("* ", end="")
        else:
            print("  ", end="")
        
    print("")

n = int(input("Enter a no: "))
for rows in range(1,n):
    for columns in range(1,n):
        if(columns == 1 and (rows > 1 and rows < n-1) or ((rows == 1 or rows == n-1) and (columns > 1 and columns < n-1)) or ((columns == 1 or columns == n-1) and (rows >= (n//2) and rows < n-1)) or ((rows == n//2) and (columns != 2))):
            print("* ", end="")

        else:
            print("  ", end="")
    print("")