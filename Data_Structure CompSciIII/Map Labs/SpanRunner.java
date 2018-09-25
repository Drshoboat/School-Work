public class SpanRunner{
  public static void main(String[] args) {
    SpanishToEnglish bing = new SpanishToEnglish();
    bing.addWords();

    File q = new File("sentences.dat");
    Scanner scan = new Scanner(q);

    scan.nextInt();

    scan.nextLine();
    String[] sentence = scan.split(" ");

    for(int i = 0; i < sentence.length(); i++) {
      scan.nextLine();
      String[] sentence = scan.split(" ");
    }
    bing.translate(sentence);
  }
}
