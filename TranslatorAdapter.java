package SDP_assignment3;

public class TranslatorAdapter implements EnglishSpeaker {
    private RussianSpeaker russianSpeaker;

    public TranslatorAdapter(RussianSpeaker russianSpeaker) {
        this.russianSpeaker = russianSpeaker;
    }

    @Override
    public void speakEnglish(String words) {
        String translated = "Перевод на русский: " + words;
        russianSpeaker.speakRussian(translated);
    }
}
