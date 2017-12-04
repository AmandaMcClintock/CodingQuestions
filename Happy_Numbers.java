#include <stdio.h>
	int sum;
	int fd;
	int initial_num;
int is_happy(int sum) { 
		if(sum == 1) {
			printf("%d is happy\n", initial_num);
		}
		else {
			printf("%d is not happy\n", initial_num);
		}

		return 0;
	}
int findDigit(int initial_num) {
		sum = (initial_num % 10) * (initial_num % 10);
		initial_num = initial_num / 10;
		
		return 0;
	}
int main(int argc, char const *argv[])
{
	//int newNum;
	
	//bool flag;
	while(initial_num != 0) {
		findDigit(initial_num);
	}
	
	printf("%d\n", sum);
	is_happy(sum);
	
	return 0;
}