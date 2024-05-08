total = 0
for numbers in range(1,11):
	scores = int(input('Please enter a score'))
	if scores % 2 == 0:
		total += scores 

average = total / numbers
print(f'The total scores including the average are {average} {total}')
