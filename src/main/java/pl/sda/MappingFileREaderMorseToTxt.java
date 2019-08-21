package pl.sda;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MappingFileREaderMorseToTxt {

    public Map<String, String> readMappingFileMorseToTxt() {

        File file = new File("path to \\morseMappings");
        Map<String, String> mappings = new HashMap<>();

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(":");
                mappings.put(tokens[1], tokens[0].toLowerCase() );
            }

        } catch (FileNotFoundException e) {
            throw new MappingFileNotFoundException();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return mappings;
    }
}

