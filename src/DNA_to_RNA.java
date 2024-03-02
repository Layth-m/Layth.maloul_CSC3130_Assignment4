import java.util.Queue;

import java.util.LinkedList;
public class DNA_to_RNA {
    String input;

   StringBuilder RNA ;

    public DNA_to_RNA(String input) {
        this.input = input;
        RNA = new StringBuilder();
    }
    public StringBuilder convert_DNA_to_RNA() {
        for (char ch : input.toCharArray()) {
            if (ch == 'T') {
                RNA.append('U');
            } else {
                RNA.append(ch);
            }
        }
        return RNA;
    }
}



