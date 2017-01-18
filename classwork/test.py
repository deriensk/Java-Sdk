# num = [5,7,3,9,1,9]

# l = []
# largest = None

# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)

# #2
# largest = None
# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)

# #3
# largest = None
# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)

# #4

# largest = None
# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)

# #5
# largest = None
# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)

# #6
# largest = None
# for item in num:
#     if item >= largest:
#         largest = item
# l.append(largest)      
# index_find = num.index(largest)
# num.pop(index_find)


# print num
# print largest,l 

num = [5,7,3,9,1,9]

def rec(listo):


    l = []
    largest = None

    for item in num:
        if item >= largest:
            largest = item
    l.append(largest)      
    index_find = num.index(largest)
    num.pop(index_find)
    if len(listo) == 0:
        exit()
    print l, listo   

    return rec(listo)


a= rec(num)
print a