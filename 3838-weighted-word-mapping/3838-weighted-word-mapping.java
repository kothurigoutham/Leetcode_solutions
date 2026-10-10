class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb= new StringBuilder();
      for(int i=0;i<words.length;i++){
        String str= words[i];
        
        int sum=0;
        for(int j=0;j<str.length();j++){
            int index= str.charAt(j) - 'a';
            sum+= weights[index];
        }
        sum=sum%26;
       
        char ch= (char) (122-sum);
        sb.append(ch);
      }
     return sb.toString();  
    }
}