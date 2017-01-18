#greedy algorithm technique 
#code repetiton, here function is not used

num = [5,7,3,9,1,9]

l = []
largest = None

for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num

#2
largest = None
for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num

#3
largest = None
for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num

#4

largest = None
for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num

#5
largest = None
for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num

#6
largest = None
for item in num:
    if item >= largest:
        largest = item
l.append(largest)      
index_find = num.index(largest)
num.pop(index_find)
print num


print num
print largest,l 

print("final output is: ") 
for i in l:
	print i,
	
