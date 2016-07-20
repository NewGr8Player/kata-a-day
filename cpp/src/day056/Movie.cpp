#include <igloo/igloo_alt.h>
#include <math.h>

using namespace igloo;
using namespace std;

class Movie {

public:
	static int movie(int card, int ticket, double perc) {
		double count = 0, systemB = card;
		while (ticket * count <= ceil(systemB)) systemB += ticket * pow(perc, ++count);
		return (int) count;
	}
};

void testequal(int ans, int sol) {
	Assert::That(ans, Equals(sol));
}

Describe(movie_Tests) {
	It(Fixed_Tests) {
		testequal(Movie::movie(500, 15, 0.9), 43);
		testequal(Movie::movie(100, 10, 0.95), 24);
	}
};

