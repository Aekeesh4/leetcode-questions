class Solution {


    public boolean isvowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }
    public String toGoatLatin(String sentence) {

        String[] words= sentence.split(" ");
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<words.length;i++)
        {
            String word=words[i];
            int position= i+1;

            if(!isvowel(word.charAt(0)))
            {
                word=word.substring(1)+word.charAt(0);
            }
            word=word+"ma";

            for(int j=0;j<position;j++)
            {
                word=word+"a";
            }
            ans.append(word);
          
          if(i!=words.length-1)
          {
            ans.append(" ");
          }
        }
        return ans.toString();
    }
}