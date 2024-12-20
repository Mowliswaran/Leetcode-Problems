class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        t=[]
        for i in range(len(nums)):
            if(nums[i]!=0):
                t.append(nums[i])
        for i in range(len(nums)):
            if(i<len(t)):
                nums[i]=t[i]
            else:
                nums[i]=0
        return nums
        