package coreJava;

public class Operators {

	public static void main(String[] args) {
		// unary
		int i = 10;
		i++;
		System.out.println(i);
		i--;
		System.out.println(i);
		++i;
		System.out.println(i);
		--i;
		System.out.println(i);
		// arithmetic
		int a = 10;
		int b = 12;
		int c = a+b;
		System.out.println(c);
		int d = a-b;
		System.out.println(d);
		int e = a/b;
		System.out.println(e);
		int f = a*b;
		System.out.println(f);
		// shift
		// left shift <<
		System.out.println(10<<2); // 10*2^2=40
		System.out.println(10<<3); // 10*2^3=80	
		// right shift >>
		System.out.println(10>>2); //10/2^2=2
		System.out.println(20>>2); //20/2^2=5
		// relational 
		System.out.println(10==2);
		System.out.println(10!=2);
		System.out.println(10>2);
		System.out.println(10<2);
		System.out.println(10>=2);
		System.out.println(10<=2);
		// bitwise operators
		// bitwise AND
		int p = 8;
		int q = 2;
		int r = p&q;
		System.out.println(r);
		// bitwise OR it should be present in any one
		int a1 = 9;
		int b1 = 6;
		int m = a1|b1;
		System.out.println(m);
		// bitwise XOR it is set in one operand but not both
		int a3 = 5;
		int b3 = 3;
		int c3 = a3 ^ b3;
		System.out.println(c3);
		// logical operators &&, ||, !
		// && AND returns true if both operands are true, otherwise returns false
		int u = 10, v = 20;
		if (u<v && v>15) {
			System.out.println("both conditions are true");
			// || OR returns true if at least one of the operands is true
			int age = 25;
			if (age<18 || age>21) {
				System.out.println("condition is true");
				// ! NOT reverses the logical state of the operand
				boolean isRaining = false;
				if(!isRaining) {
					System.out.println("You can go out");
					// assignment operators // =, +=, -=
					int k = 10;
					int l = 20;
					k+= 4; // k = k+4
					System.out.println(k);
					l-= 4; // l = l-4
					System.out.println(l);
					// ternary operator short hand for if-else
					// condition ? expression_if_true : expression_if_false
					int w1 = 10, w2 = 20;
							int max = (w1>w2) ? w1:w2;
					System.out.println(max);
					
					
				}
			}
			
		}
		

	}

}
