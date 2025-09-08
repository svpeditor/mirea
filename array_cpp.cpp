// C++: массив
#include <iostream>
using namespace std;

int main() {
    int nums[5] = {1, 2, 3, 4, 5};
    int total = 0;
    for (int i = 0; i < 5; i++) total += nums[i];
    cout << total << endl;
    return 0;
}
