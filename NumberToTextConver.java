package Connection;

public class NumberToTextConver {
	
	
	
	public static void main(String[] args) {
		String res = convertNumToWord(87654321);
		System.out.println(res);
	}

	static String string;
	static String a[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", };
	static String b[] = { "hundred", "thousand", "lakh", "crore" };
	static String c[] = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "ninteen", };
	static String d[] = { "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty" };

	public static String convertNumToWord(int number) {
		int c = 1;
		int rm;
		string = "";

		while (number != 0) {
			switch (c) {
			case 1:
				rm = number % 100;
				pass(rm);
				if (number > 100 && number % 100 != 0) {
					display("and ");
				}
				number /= 100;
				break;
			case 2:
				rm = number % 10;
				if (rm != 0) {
					display(" ");
					display(b[0]);
					display(" ");
					pass(rm);
				}
				number /= 10;
				break;
			case 3:
				rm = number % 100;
				if (rm != 0) {
					display(" ");
					display(b[1]);
					display(" ");
					pass(rm);
				}
				number /= 100;
				break;
			case 4:
				rm = number % 100;
				if (rm != 0) {
					display(" ");
					display(b[2]);
					display(" ");
					pass(rm);
				}
				number /= 100;
				break;
			case 5:
				rm = number % 100;
				if (rm != 0) {
					display(" ");
					display(b[3]);
					display(" ");
					pass(rm);
				}
				number /= 100;
				break;
			}
			c++;
		}
		return string;
	}

	public static void display(String s) {
		String t;
		t = string;
		string = s;
		string += t;
	}

	public static void pass(int number) {
		int rm, q;
		if (number < 10) {
			display(a[number]);
		}

		if (number > 9 && number < 20) {
			display(c[number - 10]);
		}
		if (number > 19) {
			rm = number % 10;
			if (rm == 0) {
				q = number / 10;
				display(d[q - 2]);
			} else {
				q = number / 10;
				display(a[rm]);
				display(" ");
				display(d[q - 2]);
			}
		}
	}
}



