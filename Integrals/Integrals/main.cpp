#include <iostream>
#include <locale>
#include <cmath>

class IntegralCalculator {
private:
    double lowerLimit;
    double upperLimit;
    int numSubintervals;

    /* Функция за оценка*/
    double function(double x) {
        // Дефиниране на функцията, която ще се изчисли
        return std::sin(x); // Пример: f(x) = sin(x)
    }

public:
    // Конструктор
    IntegralCalculator(double a, double b, int n) {
        lowerLimit = a;
        upperLimit = b;
        numSubintervals = n;
    }

    // Сетъри за промяна на границите и броя на подинтервалите
    void setLowerLimit(double a) {
        lowerLimit = a;
    }

    void setUpperLimit(double b) {
        upperLimit = b;
    }

    void setNumSubintervals(int n) {
        numSubintervals = n;
    }

    // Функция за изчисление на интеграла с помощта на правилото на трапеците
    double calculateIntegral() {
        double h = (upperLimit - lowerLimit) / numSubintervals; // Изчисляване на стъпката
        double sum = 0.5 * (function(lowerLimit) + function(upperLimit)); // Инициализиране на сумата със стойностите в краищата

        // Обхождане на подинтервалите и сумиране на стойностите на функцията
        for (int i = 1; i < numSubintervals; ++i) {
            double x = lowerLimit + i * h; // Изчисляване на текущата точка
            sum += function(x); // Добавяне на стойността на функцията към сумата
        }

        return h * sum; // Връщане на окончателния резултат
    }
};

int main() {

    double a, b; // Границите на интегриране
    int n; // Брой на подинтервалите

    // Въвеждане на данните от конзолата
    std::cout << "Въведете долната граница на интегриране: ";
    std::cin >> a;

    std::cout << "Въведете горната граница на интегриране: ";
    std::cin >> b;

    std::cout << "Въведете броя на подинтервалите: ";
    std::cin >> n;

    // Създаване на инстанция на класа IntegralCalculator с въведените данни
    IntegralCalculator calculator(a, b, n);

    // Изчисляване на интеграла
    double integral = calculator.calculateIntegral();

    // Извеждане на резултата
    std::cout << "Стойността на интеграла е: " << integral << std::endl;

    return 0;
}
