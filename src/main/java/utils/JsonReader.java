package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JsonReader {

    public static JSONObject getTestData() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/test/resources/testdata.json"));
            return (JSONObject) obj;
        } catch (Exception e) {
            throw new RuntimeException("Failed to read JSON");
        }
    }
}
