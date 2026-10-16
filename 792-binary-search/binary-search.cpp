class Solution {
public:
    int search(vector<int>& nums, int target)
     {
        int mid,str,end;
        str=0;
        end=nums.size()-1;
        while(str<=end)
        {
        mid=str+(end-str)/2;
        if(target>nums[mid])
        {
            str=mid+1;
        }
        else if(target<nums[mid])
        {
            end=mid-1;
        }
        else if(target==nums[mid]){
                return mid;
        }
        }
                    return -1;
        

    }   
};
// int main()
// {
//     vector<int> nums={1,2,3,4,5,6,7};
//     Solution s;
//     int result = s.search(nums,1);
//     cout<<"your element is on "<<result<<"index";

// }