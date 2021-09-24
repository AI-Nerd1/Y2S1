capital = int(input("Капитальные вложения: $"))
no_of_years = int(input("Сколько лет ожидаемого поступления наличных: "))
expected_cash_receipt = []
profit_margin = float(input("Требуемая норма прибыли в процентах: "))
discount_rate = float(input("Ставка дисконтирования в процентах: "))
profit_margin = profit_margin/ 100
discount_rate = discount_rate/ 100

for x in range(no_of_years):
    cash_receipt = float(input(f"Ожидаемое поступление денежных средств за год {x+1}: "))
    expected_cash_receipt.append(cash_receipt)

print("\nДенежный поток")
print(f"Год 0 = ${capital * -1}")
for x in range(no_of_years):
    print(f"Год {x+1} = ${expected_cash_receipt[x]}")

neg_cap = -1 * capital
DCF_list = []
print("\nДисконтированный Денежный Поток")
print(f"Год 0 = ${capital * -1}")
for x in range(no_of_years):
    DCF = round(expected_cash_receipt[x]*((profit_margin +1)**-(x+1)), 2)
    DCF_list.append(DCF)
    print(f"Год {x+1} = ${DCF}")


ADCF_list = [neg_cap]
print("\nНакопленный Дисконтированный Денежный Поток")
print(f"Год 0 = ${capital * -1}")
for x in range(no_of_years):
    plus = DCF_list[x] + ADCF_list[x]
    ADCF = round(plus, 2)
    print(f"Год {x+ 1} = ${ADCF} ")
    ADCF_list.append(ADCF)


NPV_sum = 0
for x in range(no_of_years):
    NPV_sum = NPV_sum + DCF_list[x]

prof_index = 0
for x in range(no_of_years -1):
    prof_index = prof_index + DCF_list[x]

NPV = NPV_sum - capital
print(f"Чистая Приведенная Стоимость = ${round(NPV, 2)} ")

payback_period = ADCF_list[-2] * (-1) / DCF_list[-1] + no_of_years -1
print(f"Срок Окупаемости = {round(payback_period,2)} ")

profitability_index = prof_index / capital
print(f"Индекс рентабельности = {round(profitability_index,2)} ")