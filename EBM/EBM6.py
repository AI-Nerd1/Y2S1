#!/usr/bin/env python3
dec_val= int(input("Введите десятичное число: "))
bin_val = int(input("Введите двоичное число: "))

# Function to convert decimal number to binary using recursion
def DecimalToBinary(num):
	if num >= 1:
		DecimalToBinary(num // 2)
    
	print(num % 2, end = '')
# Driver Code
if __name__ == '__main__':
	# decimal value
    DecimalToBinary(dec_val)
print(f"(2) = {dec_val}(10) ")
	# Calling function

# Function calculates the decimal equivalent of a given binary number

def binaryToDecimal(bin_val):
	
	binary1 = bin_val
	decimal, i, n = 0, 0, 0
	while(bin_val != 0):
		dec = bin_val % 10
		decimal = decimal + dec * pow(2, i)
		bin_val = bin_val//10
		i += 1
	print(decimal)
	

# Driver code
if __name__ == '__main__':
	binaryToDecimal(bin_val)
print(f"(10) = {bin_val}(2) ")
	# Calling function
print("\n")
	

    
