package restserver.server.forms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/forms")
public class FormsController {

    @RequestMapping(value = "/form1", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    public ResponseEntity postForms(@RequestParam("key") String key,
                                    @RequestParam("actor") String actor,
                                    @RequestParam("data")MultipartFile dataFile) {

        try {
            System.out.println("key=" + key);
            System.out.println("actor=" + actor);
            System.out.println("data=" + new String(dataFile.getBytes()));
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.PARTIAL_CONTENT);
        }

        return new ResponseEntity(HttpStatus.OK);
    }
}
