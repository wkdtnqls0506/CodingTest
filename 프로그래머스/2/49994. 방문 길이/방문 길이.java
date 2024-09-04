/*
    1. 좌표 설정 및 이동 방향 - HashMap을 사용해서 짝지어 저장해두기
        - U: [0, 1]
        - D: [0, -1]
        - L: [-1, 0]
        - R: [1, 0]
    2. 이동 범위 제한 -5 <= x <= 5 && -5 <= y <= 5
    3. 경로 중복 처리 - HashSet을 사용하여 중복 경로 관리
        - 같은 경로를 다시 이동할 때는 경로 길이에 포함되지 않도록 경로를 관리해야 함.
        - (x1, y1) -> (x2, y2)
        - (x2, y2) -> (x1, y1)
*/

import java.util.*;

class Solution {
    public int solution(String dirs) {
        // 각 방향에 따른 좌표 변화 정의
        HashMap<Character, int[]> directions = new HashMap<>() {{
            put('U', new int[]{0, 1});
            put('D', new int[]{0, -1});
            put('L', new int[]{-1, 0});
            put('R', new int[]{1, 0});
        }};
        
        // 방문한 경로를 저장할 HashSet
        // 경로를 문자열로 저장하여 중복된 경로를 처리
        HashSet<String> setDirections = new HashSet<>();
        
        // 시작 좌표 (0, 0)
        int x = 0;
        int y = 0;
        
        for(char ch : dirs.toCharArray()) {
            if(directions.containsKey(ch)) {
                int[] move = directions.get(ch);
                int newX = x + move[0];
                int newY = y + move[1];
                                
                 // 이동한 좌표가 범위를 벗어나지 않는지 확인
                if (newX >= -5 && newX <= 5 && newY >= -5 && newY <= 5) {
                    // 경로를 양방향으로 처리하여 중복을 막음
                    // ex) (x1, y1 -> x2, y2)와 (x2, y2 -> x1, y1)을 동일하게 처리
                    String path1 = x + "," + y + "->" + newX + "," + newY;
                    String path2 = newX + "," + newY + "->" + x + "," + y;
                    
                    // 새 경로라면 Set에 추가
                    if (!setDirections.contains(path1) && !setDirections.contains(path2)) {
                        setDirections.add(path1);  // 경로 추가
                        setDirections.add(path2);  // 양방향 경로 추가
                    }
                    
                    // 좌표 갱신
                    x = newX;
                    y = newY;
                }
            }
        }
        
        // 양방향 경로를 저장했으므로, 전체 경로 수의 절반을 반환
        return setDirections.size() / 2;
    }
}