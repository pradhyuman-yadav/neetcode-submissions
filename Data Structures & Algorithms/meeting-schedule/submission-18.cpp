/**
 * Definition of Interval:
 * class Interval {
 * public:
 *     int start, end;
 *     Interval(int start, int end) {
 *         this->start = start;
 *         this->end = end;
 *     }
 * }
 */

class Solution {
public:
    bool canAttendMeetings(vector<Interval>& intervals) {
        vector<int> totalTime(1000);
        for(int i=0; i<intervals.size(); i++) {
            for (int j=intervals[i].start; j<intervals[i].end; j++){
                if(totalTime[j] == 1) return false;
                totalTime[j] = 1;
            }
        }
        return true;
    }
};
