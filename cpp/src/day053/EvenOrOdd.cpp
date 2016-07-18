#include <igloo/igloo_alt.h>

using namespace igloo;

std::string even_or_odd(int number) {
    return (number % 2 == 0) ? "Even" : "Odd";
}

Describe(even_or_odd_method) {
    It(basic_tests) {
        Assert::That(even_or_odd(2), Equals("Even"));
        Assert::That(even_or_odd(1), Equals("Odd"));
        Assert::That(even_or_odd(0), Equals("Even"));
        Assert::That(even_or_odd(7), Equals("Odd"));
    }
};