package SDP_assignment3;

public class Main {
    public static void main(String[] args) {
        RussianSpeaker russianSpeaker = new RussianSpeaker();
        EnglishSpeaker englishSpeaker = new TranslatorAdapter(russianSpeaker);
        englishSpeaker.speakEnglish("Hello, how are you?");
    }
}
