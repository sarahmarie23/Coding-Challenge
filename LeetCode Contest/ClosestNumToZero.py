class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        posList = []
        negList = []

        for x in nums:
            if x >= 0:
                posList.append(x)
            else:
                negList.append(x)


        posList.sort()
        negList.sort()

        if len(negList) is 0:
            return posList[0]
        elif len(posList) is 0:
            return negList[-1]
        elif posList[0] == abs(negList[-1]):
            return posList[0]
        else:
            if posList[0] > abs(negList[-1]):
                return negList[-1]
            else:
                return posList[0]
