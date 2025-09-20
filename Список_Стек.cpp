C++

#include <iostream>
#include <string>
using namespace std;

int main() {
    string str = "AaBbCcDd";
    string uppercase = "";
    string lowercase = "";
    
    for (int i = 0; i < str.length(); i++) {
        if (i % 2 == 0) {
            uppercase += str[i]; // Четные индексы - заглавные
        } else {
            lowercase += str[i]; // Нечетные индексы - строчные
        }
    }
    
    cout << "Заглавные: " << uppercase << endl;
    cout << "Строчные: " << lowercase << endl;
    
    return 0;
}

//стек

#include <iostream>
#include <stack>
#include <vector>
#include <string>
#include <cctype>
#include <algorithm> // для reverse

using namespace std;

int main() {
    // Исходный стек
    stack<string> originalStack;
    vector<string> temp = {"a", "1", "b", "2", "c", "3"};
    for (const auto& item : temp) {
        originalStack.push(item);
    }
    
    // Векторы для букв и цифр
    vector<string> letters;
    vector<string> numbers;
    
    // Обрабатываем стек, извлекая элементы с вершины
    while (!originalStack.empty()) {
        string item = originalStack.top();
        originalStack.pop();
        
        if (item.length() == 1) {
            if (isalpha(item[0])) {  // если это буква
                letters.push_back(item);
            } else if (isdigit(item[0])) {  // если это цифра
                numbers.push_back(item);
            }
        }
    }
    
    // Переворачиваем векторы, чтобы сохранить исходный порядок
    reverse(letters.begin(), letters.end());
    reverse(numbers.begin(), numbers.end());
    
    // Выводим результаты
    cout << "Буквы: ";
    for (const auto& letter : letters) {
        cout << letter << " ";
    }
    cout << endl;
    
    cout << "Цифры: ";
    for (const auto& number : numbers) {
        cout << number << " ";
    }
    cout << endl;
    
    return 0;
}
