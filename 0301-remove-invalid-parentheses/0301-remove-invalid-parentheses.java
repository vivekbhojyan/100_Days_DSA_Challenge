class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {
            String cur = q.poll();

            if (isValid(cur)) {
                ans.add(cur);
                found = true;
            }

            if (found) continue;

            for (int i = 0; i < cur.length(); i++) {
                if (cur.charAt(i) != '(' && cur.charAt(i) != ')')
                    continue;

                String next = cur.substring(0, i) + cur.substring(i + 1);

                if (!visited.contains(next)) {
                    visited.add(next);
                    q.offer(next);
                }
            }
        }

        return ans;
    }

    private boolean isValid(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;

                if (count < 0)
                    return false;
            }
        }

        return count == 0;
    }
}