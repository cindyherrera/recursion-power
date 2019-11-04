# recursion-power

will raise a base to an exponential number using recursion


public static int power(int base, int exponent) {
	if (exponent == 0) {
		return 1;
	} else {
		return base * power(base, exponent - 1);
		}
	}
	
