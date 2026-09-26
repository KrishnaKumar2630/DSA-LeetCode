class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int row = 1; row <= numRows; row++) {

            List<Integer> rows = new ArrayList<>();
            long val = 1;

            rows.add(1);

            for (int col = 1; col < row; col++) {
                val = val * (row - col);
                val = val / col;

                rows.add((int) val);
            }

            ans.add(rows);
        }

        return ans;
    }
}