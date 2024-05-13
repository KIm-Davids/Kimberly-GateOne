from datetime import datetime

def age_calculator(date):
	current_day = datetime.now().day
	current_month = datetime.now().month
	current_year = datetime.now().year

	converted_day = int(current_day)
	converted_month = int(current_month)
	converted_year = int(current_year)

	if(len(date) != 11):
		year = (date[6:])
		month = (date[3:5])
		day = (date[0:2])

	user_input_year = int(year)
	user_input_month = int(month)
	user_input_day = int(day)
	new_year = 0

	updated_year = converted_year - user_input_year 

	if(user_input_year == 2022 and user_input_month > 6 ):
		new_year = updated_year - 1
		print(f'You are {new_year} year old')
	if(user_input_year == 2023):
		print(f'You are {updated_year} year old')

	if(user_input_month <= 6):
		print(f'You are {updated_year} year old')
	else:
		print(f'You are {updated_year} year old')

