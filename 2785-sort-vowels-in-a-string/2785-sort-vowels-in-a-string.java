class Solution {
    public boolean isvowel(char ch)
    {
        return ch =='a'||ch == 'e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
          }
    public String sortVowels(String s) {
     
     List<Character> vowel=new ArrayList<>();

     for(char ch:s.toCharArray())
     {
        if(isvowel(ch))
        {
            vowel.add(ch);
        }

     }
     Collections.sort(vowel);
      char[] word=s.toCharArray();
      int j=0;
      for(int i=0;i<word.length;i++)
      {
        if(isvowel(word[i]))
        {
            word[i]=vowel.get(j);
            j++;
        }
      }
      return new String(word);

        
    }
}