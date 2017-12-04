/*
* When running this program, enter a single string as an argument
* You can input uppercase
* For example: ./main OntarioCanada
*/
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define BASE 97
#define ALPHA_LEN 26

int main(int argc, char *argv[])
{
	//Finding the string length of the input
	int str_len = strlen(argv[1]);
	
	//Putting the input into a char array
	char *ch = argv[1];

	//Making uppercase letters to lower case
	int lc;
	for(lc = 0; lc < str_len; lc++)
	{
		if(isalpha(ch[lc]))
		{
			ch[lc] = tolower(ch[lc]);
		}
	}
	
	//Setting up an alphabet array used to keep track of letter occurances
	int alphabet[26] = {0};
	
	int i, j, l, w;
	for (i = 0; i < str_len; i++)
	{
		alphabet[ch[i] % BASE]+=1;	
		
	}

	//Prints character count for distinct letters in string
	printf("\"%s\" -> ",  argv[1]);
	for (j = 0; j < ALPHA_LEN; j++)
	{
		
		if(alphabet[j] > 0){
			printf("%c: %d", (j + BASE), alphabet[j]);
			
			//handles comma case
			for(w = j + 1; w < ALPHA_LEN; w++)
			{
				if(alphabet[w] > 0)
				{
					printf("%s", ", "); 
					break;
				} 

			}
		}
	}
}