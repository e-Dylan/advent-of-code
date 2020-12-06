# flag: 603

def find_valid_passwords():
	file = open('data.txt', 'r')
	lines = file.readlines()

	num_valid = 0
	for line in lines:
		line = line.strip().split(': ')
		# print(line)

		passRule = line[0].split()
		bounds = passRule[0].split('-')
		min = bounds[0]
		max = bounds[1]
		char = passRule[1]
		password = line[1]
		print(password)

		# count number of needed chars in the password
		num_chars = 0
		for i in range(len(password)):
			if password[i] == char:
				num_chars += 1
		
		if num_chars >= int(min) and num_chars <= int(max):
			num_valid += 1

	return num_valid
				

num_valid = find_valid_passwords()
print(num_valid)