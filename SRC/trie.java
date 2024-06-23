public class trie {
    //trie class Node
    static class Node{
        Node[] children;
        boolean eow;  //end of word

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
        }
    }

    //root node
    static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';

            if(curr.children[idx]==null){
                //add new node
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
               curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    //Searching   ->O(l) l=length of the string
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';   //index value to search
            Node node=curr.children[idx];

            if(node==null){
                return false;
            }
            if(i==key.length()-1 && node.eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }

        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secondPart=key.substring(i);
            if(search(firstPart)&& wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    //search prefix
    public static boolean searchPrefix(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx]==null){
                return false;
            }

            curr=curr.children[idx];
        }
        return true;
    }

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }
        return count+1;
    }

    public static String ans="";
    //longest word with all prefixes
    public static void longestWord(Node root,StringBuilder temp){
        if(root==null){
            return;
        }
        Node curr=root;
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null && curr.children[i].eow==true){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(curr.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String args[]){
        String words[]={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0; i< words.length;i++){
            insert(words[i]);
        }

//        System.out.println(search("like"));
//        System.out.println(search("thor"));
//
//        String key="ilikesamsung";
//        System.out.println(wordBreak(key));
//
//        String prefix="sams";
//        System.out.println(searchPrefix(prefix));

        //count of unique substrings
        //1.find all suffix of string
        //2.construct trie for the suffix
        //3.total nodes of trie=count of unique substrings
//        String str="ababa";
//        for(int i=0;i<str.length();i++){
//            String suffix=str.substring(i);
//            insert(suffix);
//        }
//        System.out.println(countNodes(root));

        //longest word with all its prefixes in the array
        //1.construct a trie
        //2.we will observe the longest word with all its prefixes has eow true
        //compare the tempString with string length if it is greater then update the string
        //4.return the string
        longestWord(root,new StringBuilder(""));
        System.out.println(ans);

    }
}
