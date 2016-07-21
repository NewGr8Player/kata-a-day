#include<igloo/igloo_alt.h>
#include<math.h>

using namespace igloo;
using namespace std;

int makeNegative(int num) {
	return abs(num) * -1;
}

Describe(make_negative_algorithm) {
	It(should_handle_positive_test) {
		Assert::That(makeNegative(42), Equals(-42));
	}
};