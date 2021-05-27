package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "githup";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hup","lap"));
        System.out.println("word = "+word);
        word = word.replace("hup","lab");
        System.out.println("word = "+word);
        word =word.replace("i","o").replace("a","i");
        System.out.println("word = "+word);

        String sentence ="java is fun";
        String noSpaces =sentence.replace(" ","");
        System.out.println(noSpaces);
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");

        System.out.println(sentence);

        String result ="1-48 of over 4,000 results for \"java book\"";
        result = result.replace("1-48 of over ","").replace(",","");
        System.out.println("result = "+result);
    }
}
