class Solution:
    def largestInteger(self, num: int) -> int:
        numlist = [int(d) for d in str(num)]
    
        newlist = []
        evenlist = []
        oddlist = []
        finallist = []
    
        for i in numlist:
            curr = i % 2
            newlist.append(curr)
            if curr is 0:
                evenlist.append(i)
            else:
                oddlist.append(i)


        evenlist.sort()
        oddlist.sort()

        for i in newlist:
            if i == 0:
                get = evenlist.pop()
                finallist.append(get)
            else:
                get = oddlist.pop()
                finallist.append(get)

        nums ="".join([str(i) for i in finallist])
        answer = int(nums)

        return answer
