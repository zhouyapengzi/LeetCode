class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        result = nums1 + nums2
        result.sort()
        length = len(result)
        if length % 2 == 0:
            midnum = int(length / 2)
            median = (result[midnum] + result[midnum - 1]) / 2
        else:
            midnum = int ((length -1) / 2)
            median = result[midnum]
        return median


if __name__=='__main__':
    nums1 = [1, 3, 4]
    nums2 = [2]
    result = Solution()
    print(result.findMedianSortedArrays(nums1, nums2))

