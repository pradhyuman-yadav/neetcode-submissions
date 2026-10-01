class Solution {
public:

    string encode(vector<string>& str) {
        if(str.empty()) return "";
        string res;
        for (const string& i: str) {
            res += i + ';';
        }
        return res;
    }

    vector<string> decode(string strings) {
        istringstream ts(strings);
        string token;
        vector<string> res;
        while(getline(ts, token, ';')) {
            res.push_back(token);
        }
        return res;
    }
};
