total = 0
for numbers in range(1,11):
	scores = int(input('Please enter a score'))
	total += scores

average = total / numbers
print(f'The total scores are {average}')
