/*logan@logan:~/VS Code Projects/Python/others$ g++ EBM7.cpp
logan@logan:~/VS Code Projects/Python/others$ ./a.out */

#include <iostream>
using namespace std;
#define BITNESS 32
#include <cstring>

int Length(char t[BITNESS])
{
    int length = 0;
    for (int i = 0; i < BITNESS; i++)
    {
        if (t[i] != '\0')
        {
            length++;
        }
        else
        {
            break;
        }
    }
    return length;
}

char *ToAlign(char *t)
{
    int p = Length(t);
    for (int i = 0; i < Length(t); i++)
    {
        t[BITNESS - 1 - p] = t[i];
        t[i] = '0';
        p--;
    }
    for (int i = 0; i < BITNESS; i++)
    {
        if (t[i] == '\0')
        {
            t[i] = '0';
        }
    }
    return t;
}

void ToPrint(char *p)
{
    for (size_t i = 0; i < BITNESS; i++)
    {
        cout << p[i];
        if ((i + 1) % 4 == 0)
        {
            cout << " ";
        }
    }
    cout << endl;
}

char *ToSum(char *leftOperand, char *rightOperand)
{
    char *result = new char[BITNESS];
    memset(result, '0', BITNESS);
    bool overflow = false;
    for (int i = BITNESS - 1; i >= 0; i--)
    {
        if (leftOperand[i] == '0' && rightOperand[i] == '0')
        {
            if (overflow)
            {
                result[i] = '1';
                overflow = false;
            }
        }
        else if ((leftOperand[i] == '0' && rightOperand[i] == '1') || (leftOperand[i] == '1' && rightOperand[i] == '0'))
        {
            if (overflow)
            {
                result[i] = '0';
            }
            else
            {
                result[i] = '1';
            }
        }
        else if (leftOperand[i] == '1' && rightOperand[i] == '1')
        {
            if (overflow)
            {
                result[i] = '1';
            }
            else
            {
                result[i] = '0';
                overflow = true;
            }
        }
    }
    return result;
}

int main()
{
    setlocale(LC_ALL, "Russian");
    char *a = new char[BITNESS],
         *b = new char[BITNESS],
         *result = new char[BITNESS];
    memset(a, '0', BITNESS);
    memset(b, '0', BITNESS);
    memset(result, '0', BITNESS);
    cout << "Введите число A (в двоичном формате): ";
    cin >> a;
    cout << "Введите число B (в двоичном формате): ";
    cin >> b;
    a = ToAlign(a);
    b = ToAlign(b);
    result = ToSum(a, b);
    ToPrint(a);
    cout << "+\n";
    ToPrint(b);
    for (size_t i = 0; i < BITNESS + BITNESS / 4; i++)
    {
        cout << "_";
    }
    cout << endl;
    ToPrint(result);
    return 0;
}