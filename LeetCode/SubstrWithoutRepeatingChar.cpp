class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.length() == 0) {
            return 0;
        }
        
        if(s.length() == 1) {
            return 1;
        }
        
        int max = 1;
        queue<char> substr;
        set<char> letters;
        int curr = 0;
        char letter = ' ';
        int stop = s.length() -1;
        
        substr.push(s.at(0));
        letters.insert(s.at(0));
        
        while(true) {
            curr++;
            letter = s.at(curr);
            while(letters.count(letter) > 0) {
                char front = substr.front();
                substr.pop();
                letters.erase(front);
            }
            
            substr.push(letter);
            letters.insert(letter);
            
            
            if(substr.size() > max) {
                max = substr.size();
            }
            
            if(curr == stop) {
                return max;
            }
        }
        return max;
    }
};
