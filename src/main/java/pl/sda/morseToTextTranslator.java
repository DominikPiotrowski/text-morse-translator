package pl.sda;

import java.util.Map;

public class morseToTextTranslator implements translator {

    @Override
    public String translate(String morseToTranslate) {

        Map<String, String> mappings = createMappings();
        String[] morses = morseToTranslate.split("/");
        StringBuilder stringBuilder = new StringBuilder();

        for (String morse : morses) {
            stringBuilder.append(translateWord(morse, mappings));
        }
        return stringBuilder.toString();
    }

    private String translateWord(String morseToTranslate, Map<String, String> mappings) {
        StringBuilder stringBuilder = new StringBuilder();

        int countCharacters = 0;
        if (morseToTranslate.contains("/")) {
            countCharacters++;
        }

        for (int i = 0; i == countCharacters; i++) {

            String morseCharacter = morseToTranslate.split("/")[i];
            stringBuilder.append(mappings.get(morseCharacter));
        }
        return stringBuilder.toString();
    }

    private Map<String, String> createMappings() {
        mappingFileREaderMorseToTxt mappingFileReader = new mappingFileREaderMorseToTxt();
        Map<String, String> mappings = mappingFileReader.readMappingFileMorseToTxt();
        return mappings;
    }
}