def cardValidator(collectiInput):
	if(len(card_number) == 16 and card_number[0] == '4' or card_number[0] == '5' or card_number[0] == '6' and card_number[4] == '-' and card_number[9] == '-' and card_number[14] == '-'):
		return False	
	else:
		return True

card_number = input("Enter card Number")

print(cardValidator(card_number))
	
