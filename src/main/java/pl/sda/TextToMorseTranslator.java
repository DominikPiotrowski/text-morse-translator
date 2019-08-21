package pl.sda;

import java.util.Map;

public class TextToMorseTranslator implements Translator {

    @Override
    public String translate(String textToTranslate) {

        //mapa - słownik , nowa mapa na słowa trim i stringBulider

        Map<String, String> mappings = createMappings();
        String[] words = textToTranslate.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        //porównuje słowo do "słownika" w pętli i buduje na nowo stringa z tłumaczeniem

        for (String word : words) {
            stringBuilder.append(translateWord(word, mappings)).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    private String translateWord(String textToTranslate, Map<String, String> mappings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < textToTranslate.length(); i++) {

        //rozbija na litery i zmienia w małe litery

            Character character = textToTranslate.toCharArray()[i];
            String charToTranslate = character.toString().toLowerCase();
            stringBuilder.append(mappings.get(charToTranslate));

            //rozdziela litery morsa "/"
            if (i < textToTranslate.length() - 1) {
                stringBuilder.append("/");
            }
        }
        return stringBuilder.toString();
    }

    //metoda odczytuje mapę i zwraca Mapę<String,String>

    private Map<String, String> createMappings() {

        MappingFileReader mappingFileReader = new MappingFileReader();
        Map<String, String> mappings = mappingFileReader.readMappingFile();
        return mappings;
    }
}