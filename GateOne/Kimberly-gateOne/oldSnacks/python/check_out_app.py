from datetime import date
how_many_pieces = 0;
how_many_unit = 0;
#add_more_items = null
customers_name = input("What is the customer's name ?")
total = 0

user_list = []
items_list = []
my_new_list = []
total = 0

today = date.today()


while(True):
	user_buy = input("What did the user buy ?")
	items_list.append(user_buy)
	how_many_pieces = int(input("How many pieces ?\n"))

	how_many_unit = int(input("How much per unit ?\n"))

	user_list.append(how_many_unit)

	user_continue = input("Would you like to continue\n")

	if(user_continue == 'yes'):
		continue
	else:
		break

for i in user_list:
	my_new_list.append(i * how_many_pieces)

for counter in range(0, len(my_new_list)):
	total = total + my_new_list[counter]

print(total)

cashier_name = input("What is your name ?")
discount_amount = int(input("How much discount will he get ?"))
converted_discount = float(discount_amount)

discount = converted_discount / 100 
discount_calculated = discount * total
vat_tax = (total * 17.5) / 100
bill_total = (total - discount_calculated) + vat_tax

print("\n")
print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print(today)
print(f'Customer Name: {customers_name}')
print("================================================================================================")
print("\t\tITEM\tQTY\tPRICE\t\tTOTAL(NGN)")
print("-----------------------------------------------------------------------------------------------")

for counter in range(len(items_list)):
	print (f'\t\t{items_list[counter]}\t{how_many_pieces}\t  {user_list[counter]} \t \t{my_new_list[counter]}')
print("\n")

print("-------------------------------------------------------------------------------------------------")
print(f'\t\t\t\tSub total:\t{total}')
print(f'\t\t\t\tDiscount:\t{discount_calculated}')
print(f'\t\t\t\tVAT @ 7.5%:     {vat_tax:.2f}')
print("===================================================================================================")
print(f'\t\t\t\tBill Total:     {bill_total:.2f}')
print("===================================================================================================")
print(f'\t\t\tTHIS IS NOT AN RECIEPT KINDLY PAY {bill_total:.2f}')
print("===================================================================================================")


customer_payment = int(input("How much did the customer give to you ?"))
balance = customer_payment - bill_total


print("\n")
print("SEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULEY WAY, SABO YABA, LAGOS.")
print("TEL: 03293828343")
print(today)
print(f'Cashiers Name: {cashier_name}')
print(f'Customer Name: {customers_name}')
print("================================================================================================")
print("\t\tITEM\tQTY\tPRICE\t\tTOTAL(NGN)")
print("-----------------------------------------------------------------------------------------------")

for counter in range(len(items_list)):
	print (f'\t\t{items_list[counter]}\t{how_many_pieces}\t  {user_list[counter]} \t \t{my_new_list[counter]}')
print("\n")

print("-------------------------------------------------------------------------------------------------")
print(f'\t\t\t\tSub total:\t{total}')
print(f'\t\t\t\tDiscount:\t{discount_calculated}')
print(f'\t\t\t\tVAT @ 7.5%:     {vat_tax:.2f}')
print("===================================================================================================")
print(f'\t\t\t\tBill Total:     {bill_total:.2f}')
print(f'\t\t\t\tAmount Paid\t{customer_payment}')
print(f'\t\t\t\tBalance\t\t{balance:.2f}')
print("===================================================================================================")
print("\t\t\t\tTHANK YOU FOR YOUR PATRONAGE")
print("===================================================================================================")





	