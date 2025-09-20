Java

public class Main {
    public static void main(String[] args) {
        String str = "AaBbCcDd";
        
        // Строка с заглавными буквами (шаг 2, начиная с индекса 0)
        StringBuilder uppercase = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            uppercase.append(str.charAt(i));
        }
        
        // Строка со строчными буквами (шаг 2, начиная с индекса 1)
        StringBuilder lowercase = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2) {
            lowercase.append(str.charAt(i));
        }
        
        System.out.println("Заглавные: " + uppercase.toString());
        System.out.println("Строчные: " + lowercase.toString());
    }
}

//стек

import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Исходный стек
        Stack<String> originalStack = new Stack<>();
        originalStack.push("a");
        originalStack.push("1");
        originalStack.push("b");
        originalStack.push("2");
        originalStack.push("c");
        originalStack.push("3");
        
        // Списки для букв и цифр
        List<String> letters = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        
        // Обрабатываем стек, извлекая элементы с вершины
        while (!originalStack.isEmpty()) {
            String item = originalStack.pop();
            if (item.length() == 1) {
                char c = item.charAt(0);
                if (Character.isLetter(c)) {  // если это буква
                    letters.add(item);
                } else if (Character.isDigit(c)) {  // если это цифра
                    numbers.add(item);
                }
            }
        }
        
        // Переворачиваем списки, чтобы сохранить исходный порядок
        Collections.reverse(letters);
        Collections.reverse(numbers);
        
        // Выводим результаты
        System.out.println("Буквы: " + letters);
        System.out.println("Цифры: " + numbers);
    }
}
