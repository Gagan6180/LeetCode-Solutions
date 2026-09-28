class Solution {
    private boolean valid(String s){
        int count =0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count = count+1;
            }else{
                count = count-1;
            }

            if(count < 0) return false;
        }
        
        return count==0;
    }

    private void generateParenthesisHelper(String curr, int n, List<String>res){
        if(curr.length() == 2*n){
            if(valid(curr)){
                res.add(curr);
            }
            return;
        }
        generateParenthesisHelper(curr+"(",n,res);
        generateParenthesisHelper(curr+")",n,res);
    }
    public List<String> generateParenthesis(int n) {
        List<String>res = new ArrayList<>();
        generateParenthesisHelper("",n,res);
        return res;
    }
}