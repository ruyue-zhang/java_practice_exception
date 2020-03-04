import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.IOException;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object){
    //TODO: change the code to pass the test
    ObjectMapper map = new ObjectMapper();
    String s = null;
    try {
      s = map.writeValueAsString(object);
    }catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return s;
  }
}
