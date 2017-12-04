#include <stdio.h>
	
// int is_happy(int sum) { 
// 		if(sum == 1) {
// 			printf("%d is happy\n", initial_num);
// 		}
// 		else {
// 			printf("%d is not happy\n", initial_num);
// 		}

// 		return 0;
// 	}
int findDigit(int initial_num);
int sum;
int initial_num;


int main(int argc, char const *argv[])
{
	

	// while(sum != 1){
	// 	// printf("%s\n", "I'm here now!");
	// 	sum = 0;

	initial_num = 19;
	while(sum != 1) {
		findDigit(initial_num);
	}
	


	// 	printf("%s\n", "I'm here now!");

	// }
	
	
	return 0;
}

int findDigit(int initial_num) {
	while(initial_num > 0){

		
		sum += ((initial_num % 10) * (initial_num % 10));
		initial_num = initial_num / 10;
		printf("is: %d, sum: %d\n", initial_num, sum);
	}
	//initial_num = sum; sum = 0;
	printf("is: %d, sum: %d\n", initial_num, sum);
	return 0;
}