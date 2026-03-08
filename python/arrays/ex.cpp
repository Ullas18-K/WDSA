#include <iostream>
#include <vector>
#include <algorithm>
#include <iterator>
using namespace std;

int main(){
    vector<int> nums={1,2,35,3,6};
    reverse(nums.begin()+2, nums.end());
    for(int i : nums){
        cout<< i <<" ";
    }
    return 0;
}