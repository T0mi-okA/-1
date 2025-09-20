Задание 1
Дана строка 'AaBbCcDd'. Используя срезы с шагом получите две строки: только с заглавными и только со строчными буквами. Выведите их на экран.

Python

s = 'AaBbCcDd'
uppercase = s[::2]    
lowercase = s[1::2]   

print(f"Заглавные: {uppercase}")
print(f"Строчные: {lowercase}")

//стек

Python

# Исходный список как стек
stack = ['a', '1', 'b', '2', 'c', '3']

# Списки для букв и цифр
letters = []
numbers = []

# Обрабатываем стек, извлекая элементы с конца
while stack:
    item = stack.pop()  # извлекаем с вершины стека
    if item.isalpha():  # если это буква
        letters.append(item)
    elif item.isdigit():  # если это цифра
        numbers.append(item)

# Переворачиваем списки, чтобы сохранить исходный порядок
letters.reverse()
numbers.reverse()

# Выводим результаты
print("Буквы:", letters)
print("Цифры:", numbers)
