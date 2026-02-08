# Create a 5 X 5 rectangle whose top left corner is at (row*5, col*5). (Where is the bottom right corner?) If the sum of the row and col numbers is even, set the fill color of the rectangle to white, otherwise set it to black. Then draw the rectangle.

import matplotlib.pyplot as plt
import matplotlib.patches as patches

# Create figure and axis
fig, ax = plt.subplots(figsize=(6, 6))

# Draw the 5x5 grid of rectangles
for row in range(5):
    for col in range(5):
        # Top left corner at (row*5, col*5)
        # Bottom right corner at ((row+1)*5, (col+1)*5)
        
        # Choose color based on row+col parity
        color = 'white' if (row + col) % 2 == 0 else 'black'
        
        # Create and add the rectangle
        rect = patches.Rectangle((row*5, col*5), 5, 5,facecolor=color, edgecolor='red')
        ax.add_patch(rect)

# Set limits and aspect ratio
ax.set_xlim(0, 25)
ax.set_ylim(0, 25)
ax.set_aspect("equal")

# Hide axes
ax.axis('on')

# Set title
plt.title("5x5 Grid of Black and White Rectangles")

# Show the plot
plt.show()