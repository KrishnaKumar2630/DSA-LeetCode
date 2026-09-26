class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> Row = new ArrayList<>();
        long ans = 1;

        Row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex - i + 1);
            ans /= i;

            Row.add((int) ans);
        }

        return Row;
    }
}