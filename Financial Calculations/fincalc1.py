capital = int(input("Capital investment: $"))
no_of_years = int(input("How many years of expected cash receipt: "))
expected_cash_receipt = []
profit_margin = float(input("Required profit margin in percentage: "))
discount_rate = float(input("Discount rate in percentage: "))
profit_margin = profit_margin/ 100
discount_rate = discount_rate/ 100

for x in range(no_of_years):
    cash_receipt = float(input(f"Expected cash receipt for year {x+1}: "))
    expected_cash_receipt.append(cash_receipt)

print("Cash Flow")
print(f"Year 0 = ${capital * -1}")
for x in range(no_of_years):
    print(f"Year {x+1} = ${expected_cash_receipt[x]}")

neg_cap = -1 * capital
DCF_list = []
print("\nDiscounted Cash Flow")
print(f"Year 0 = ${capital * -1}")
for x in range(no_of_years):
    DCF = round(expected_cash_receipt[x]*((profit_margin +1)**-(x+1)), 2)
    DCF_list.append(DCF)
    print(f"Year {x+1} = ${DCF}")


ADCF_list = [neg_cap]
print("\nAccumulated Discounted Cash Flow")
print(f"Year 0 = ${capital * -1}")
for x in range(no_of_years):
    plus = DCF_list[x] + ADCF_list[x]
    ADCF = round(plus, 2)
    print(f"Year {x+ 1} = ${ADCF} ")
    ADCF_list.append(ADCF)

print("\nNet Present Value")
for x in range(no_of_years):
    