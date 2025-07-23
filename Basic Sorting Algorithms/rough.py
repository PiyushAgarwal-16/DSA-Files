list1 = [3,4,5,2,1,6]
smallest = list1[0]
smallest_index = 0
for i in range(len(list1)):
    if(smallest > list1[i]):
        smallest = list1[i]
        smallest_index = i

print("Smallest Number:", smallest)
print("Smallest Number Index:", smallest_index)
