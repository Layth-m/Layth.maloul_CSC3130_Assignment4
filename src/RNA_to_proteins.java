
import javax.lang.model.type.NullType;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.LinkedList;
public class RNA_to_proteins {
String input;

public RNA_to_proteins(String input){
    this.input = input;
}

public char codon_to_protein(String codons) {
    if (codons == "GGU") {
        return 'G';
    } else if ("GGC".equals(codons)) {
        return 'G';
    } else if ("GGA".equals(codons)) {
        return 'G';
    } else if ("GGG".equals(codons)) {
        return 'G';
    } else if ("GAU".equals(codons)) {
        return 'D';
    } else if ("GAC".equals(codons)) {
        return 'D';
    } else if ("GAA".equals(codons)) {
        return 'E';
    } else if ("GAG".equals(codons)) {
        return 'E';
    } else if ("GCG".equals(codons)) {
        return 'A';
    } else if ("GCA".equals(codons)) {
        return 'A';
    } else if ("GCC".equals(codons)) {
        return 'A';
    } else if ("GCU".equals(codons)) {
        return 'A';
    } else if ("GUG".equals(codons)) {
        return 'V';
    } else if ("GUA".equals(codons)) {
        return 'V';
    } else if ("GUC".equals(codons)) {
        return 'V';
    } else if ("GUU".equals(codons)) {
        return 'V';
    } else if ("AGG".equals(codons)) {
        return 'R';
    } else if ("AGA".equals(codons)) {
        return 'R';
    } else if ("AGC".equals(codons)) {
        return 'S';
    } else if ("AGU".equals(codons)) {
        return 'S';
    } else if ("AAG".equals(codons)) {
        return 'K';
    } else if ("AAA".equals(codons)) {
        return 'K';
    } else if ("AAC".equals(codons)) {
        return 'N';
    } else if ("AAU".equals(codons)) {
        return 'N';
    } else if ("ACG".equals(codons)) {
        return 'T';
    } else if ("ACA".equals(codons)) {
        return 'T';
    }
    else if ("ACC".equals(codons)) {
        return 'T';
    } else if ("ACU".equals(codons)) {
        return 'T';
    } else if ("AUG".equals(codons)) {
        return 'M';
    } else if ("AUA".equals(codons)) {
        return 'I';
    } else if ("AUC".equals(codons)) {
        return 'I';
    } else if ("AUU".equals(codons)) {
        return 'I';
    } else if ("CGG".equals(codons)) {
        return 'R';
    } else if ("CGA".equals(codons)) {
        return 'R';
    } else if ("CGC".equals(codons)) {
        return 'R';
    } else if ("CGU".equals(codons)) {
        return 'R';
    } else if ("CAG".equals(codons)) {
        return 'Q';
    } else if ("CAA".equals(codons)) {
        return 'Q';
    } else if ("CAC".equals(codons)) {
        return 'H';
    } else if ("CAU".equals(codons)) {
        return 'H';
    } else if ("CCG".equals(codons)) {
        return 'P';
    } else if ("CCA".equals(codons)) {
        return 'P';
    } else if ("CCC".equals(codons)) {
        return 'P';
    } else if ("CCU".equals(codons)) {
        return 'P';
    } else if ("CUG".equals(codons)) {
        return 'L';
    } else if ("CUA".equals(codons)) {
        return 'L';
    } else if ("CUC".equals(codons)) {
        return 'L';
    } else if ("CUU".equals(codons)) {
        return 'L';
    } else if ("UGA".equals(codons)) {
        return '.';
    } else if ("UGC".equals(codons)) {
        return 'C';
    } else if ("UGU".equals(codons)) {
        return 'C';
    } else if ("UAG".equals(codons)) {
        return '.';
    } else if ("UAA".equals(codons)) {
        return '.';
    } else if ("UAC".equals(codons)) {
        return 'Y';
    } else if ("UAU".equals(codons)) {
        return 'Y';
    } else if ("UCG".equals(codons)) {
        return 'S';
    } else if ("UCA".equals(codons)) {
        return 'S';
    } else if ("UCC".equals(codons)) {
        return 'S';
    } else if ("UCU".equals(codons)) {
        return 'S';
    } else if ("UUG".equals(codons)) {
        return 'L';
    } else if ("UUA".equals(codons)) {
        return 'L';
    } else if ("UUC".equals(codons)) {
        return 'F';
    } else if ("UUU".equals(codons)) {
        return 'F';
    } else {
        return '?';
    }
}

public String convert_RNA_to_protein(){
    StringBuilder protein = new StringBuilder();

    Queue<Character> codonQueue = new ArrayDeque<>();

    for(char ch : input.toCharArray() ){
        codonQueue.add(ch);
        String codons;
        if(codonQueue.size()==3){
            codons =   codonQueue.poll().toString()+
                              codonQueue.poll().toString()+
                              codonQueue.poll().toString();

            char aminoAcid;
            aminoAcid = codon_to_protein(codons);
            protein.append(aminoAcid);
        }

    }
return protein.toString();
}

}
