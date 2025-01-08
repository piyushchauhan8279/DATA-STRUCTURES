public class Prefix {
    static class Node {
        Node children[] = new Node[26];
        int freq = 0;  // Initialize with 0 to properly count word passage through each node

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert method
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
            curr.freq++;  // Increment frequency for the current node
        }
    }

    // Find unique prefix for each word
    public static void findPrefix(Node root, String ans) {
        if (root == null) return;

        if (root.freq == 1) {  // Unique prefix identified
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "dove", "duck" };
        for (String word : arr) {
            insert(word);
        }

        findPrefix(root, "");  // Find and print unique prefixes
    }
}
