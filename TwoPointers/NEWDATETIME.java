package TwoPointers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class NEWDATETIME {
    public static void main(String[] args) throws IOException {
        System.out.println(LocalDate.now());
       // System.out.println("CASDECISION"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
      //  System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));
        String app=" ";
        String dear="\t";
      //  System.out.println(app.isEmpty()+" "+dear.isBlank());

//        byte[] bytes = Files.readAllBytes(Path.of("/apps/los/PL_LOS_SAMPLE_UPLOAD_FILE (1).xlsx"));
//        System.out.println(java.util.Arrays.toString(bytes));
        System.out.println(LocalDateTime.now());
        String value=String.valueOf(LocalDateTime.now());
        System.out.println(value);
        System.out.println("JVM Timezone: " + TimeZone.getDefault().getID());
        Integer arr1=12;
        Integer arr2=12;
        System.out.println(arr1==arr2);
    }

}
