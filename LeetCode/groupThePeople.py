class Solution:
    def groupThePeople(self, groupSizes: List[int]) -> List[List[int]]:
        groups = {}
        theGroups = []

        for index, num in enumerate(groupSizes):
            if num in groups.keys():
                currlist = groups.get(num)
                currlist.append(index)
                groups.update({num: currlist})
            else:
                groups[num] = [index]

        for size, people in groups.items():
            if len(people) > size:
                temp = [people[i:i+size] for i in range(0, len(people), size)]
                for i in temp:
                    theGroups.append(i)
            else:
                theGroups.append(people)

        return theGroups
