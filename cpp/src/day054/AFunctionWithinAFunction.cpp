#include <igloo/igloo_alt.h>

using namespace igloo;
using namespace std;

function<int(void)> always(int x) {
	return [=]() { return x; };
}

Describe(always_method) {
	It(basic_test) {
		function<int(void)> two = always(2);
		Assert::That(two(), Equals(2));
	}
};