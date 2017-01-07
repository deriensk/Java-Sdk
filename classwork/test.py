def getIntegers(number):
	
	print("Enter " +  str(number) +  " integer values.\n")
	
	values = []

	for x in range(number):
		a = int(raw_input())
		values.append(a)
	return values
# print 	
	
# def getAverage(array):

# 	total_sum = 0
# 	for i in range(len(array)):
# 		total_sum += array[i]
# 	return float(total_sum) / float(len(array))

 
print_array = getIntegers(5)
print print_array
print sorted(print_array, reverse=True)