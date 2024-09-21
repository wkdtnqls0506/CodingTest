import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> uidNameMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : record) {
            String[] recordSplit = str.split(" ");
            if (recordSplit.length == 3) {
                uidNameMap.put(recordSplit[1], recordSplit[2]);
            }
        }
        
        for (int i = 0; i < record.length; i++) {
            String[] recordSplit = record[i].split(" ");
            if(recordSplit[0].equals("Enter")) {
                list.add(uidNameMap.get(recordSplit[1]) + "님이 들어왔습니다.");
            } else if (recordSplit[0].equals("Leave")) {
                list.add(uidNameMap.get(recordSplit[1]) + "님이 나갔습니다.");     
            }
        }
        
        return list.toArray(new String[0]);
    }
}