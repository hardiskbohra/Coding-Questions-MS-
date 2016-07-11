
// WAP to find the character which occurred maximum times in the character array

#include<bits/stdc++.h>
#define ASCII_SIZE 256
using namespace std;

char getMaxOccuringChar(char* str)
{
    int count[ASCII_SIZE] = {0};

    int len = strlen(str);
    for (int i=0; i<len; i++)
        count[str[i]]++;

    int max = -1;
    char result;

    for (int i = 0; i < len; i++) {
        if (max < count[str[i]]) {
            max = count[str[i]];
            result = str[i];
        }
    }

    return result;
}

int main()
{
    char str[] = "sample string";
    cout << "Max occurring character is " << getMaxOccuringChar(str);
}
