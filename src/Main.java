
public class Main {
    public static void main(String[] args) {
    // testing for the is_balanced problem
        System.out.println("isBalanced testing");
        String bracket1 = "{[()]}";
        String bracket2 = "{[(])}";
        String bracket3 = "{{[[(())]]}}";
        isBalanced test1 = new isBalanced(bracket1);
        isBalanced test2 = new isBalanced(bracket2);
        isBalanced test3 = new isBalanced(bracket3);
        System.out.println(test1.CheckBalanced());
        System.out.println(test2.CheckBalanced());
        System.out.println(test3.CheckBalanced());

        // testing for DNA to RNA
        System.out.println("\n"+"DNA to RNA testing: ");
        String DNA = "AGCTGGGAAACGTAGGCCTA";
        DNA_to_RNA example1 = new DNA_to_RNA(DNA);
        System.out.println(example1.convert_DNA_to_RNA());

        //testing for RNA to proteins
        System.out.println("\n"+"RNA to protein testing: ");

        String sample = "AGCUGGGAAACGUAGGCCUA";

        RNA_to_proteins ex1 = new RNA_to_proteins(sample);
        System.out.println(ex1.convert_RNA_to_protein());

        //Testing for infix to postfix
        System.out.println("\n"+"Infix to Postfix testing: ");
            String infix = "a+b*(c^d-e)^(f+g*h)-i";
            infix_to_postfix postfix = new infix_to_postfix();

            String post = infix_to_postfix.InfixToPostfix(infix);
            System.out.println(post);

    }




}