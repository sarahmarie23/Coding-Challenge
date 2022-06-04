class Solution:
    def isValid(self, s: str) -> bool:
        paren = {'(':')', '{':'}', '[':']'}
        stack = []
        for char in s:
            if char in ['(', '{', '[']:
                stack.append(char)
            else:
                if len(stack) is 0:
                    return False
                elif paren.get(stack[-1]) is char:
                    stack.pop()
                else:
                    return False
        
        if len(stack) is 0:
            return True
     
        return False
                
