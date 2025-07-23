# Initialize an empty string named 'result_str'
result_str = ""

# Iterate through rows from 0 to 6 using the range function
for row in range(0, 7):
    # Iterate through columns from 0 to 6 using the range function
    for column in range(0, 7):
        # Check conditions to determine whether to place '*' or ' ' in the result string
        
        # If conditions are met, place '*' in specific positions based on row and column values
        if (column == 1 or ((row == 0 or row == 3) and column > 0 and column < 5) or ((column == 5 or column == 1) and (row == 1 or row == 2))):
            print("*", end='')  # Append '*' to the 'result_str'
        else:
            print(" ", end='')
            # print("  ", end='')  # Append space (' ') to the 'result_str'

    print("")  # Add a newline character after each row in 'result_str'

# Print the final 'result_str' containing the pattern


# for x in range(1,10):
#     print(f"{x}" * x)