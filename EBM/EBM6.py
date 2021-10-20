#!/usr/bin/env python3
dec_val= int(input("Введите десятичное число: "))
bin_val = int(input("Введите двоичное число: "))

def DecimalToBinary(num):
	if num >= 1:
		DecimalToBinary(num // 2)
    
	print(num % 2, end = '')


def binaryToDecimal(bin_val):
	
	binary1 = bin_val
	decimal, i, n = 0, 0, 0
	while(bin_val != 0):
		dec = bin_val % 10
		decimal = decimal + dec * pow(2, i)
		bin_val = bin_val//10
		i += 1
	print(decimal)

print("\n")
print(dec_val,"а двоичную систему: ", end = '')
DecimalToBinary(dec_val)
print("")
print(bin_val,"на десятичную систему ", end ='')
binaryToDecimal(bin_val) 