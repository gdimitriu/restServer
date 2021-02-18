package restserver.server.forms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger log = LoggerFactory.getLogger(FormsController.class);

    @RequestMapping(value = "/form1", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postForms(@RequestParam("key") String key,
                                    @RequestParam("actor") String actor,
                                    @RequestParam("data")MultipartFile dataFile) {

        try {
            log.info("key=" + key);
            log.info("actor=" + actor);
            log.info("data=" + new String(dataFile.getBytes()));
        } catch (IOException e) {
            return "fail";
        }

        return "success";
    }

    @RequestMapping(value = "/formSecure", method = RequestMethod.POST, consumes = {"multipart/form-data"}, produces = {"application/text"})
    public String postFormsSecure(@RequestParam("key") String key,
                                    @RequestParam("actor") String actor,
                                    @RequestParam("data")MultipartFile dataFile) {

        try {
            log.info("key=" + key);
            log.info("actor=" + actor);
            log.info("data=" + new String(dataFile.getBytes()));
        }  catch (IOException e) {
            return "fail";
        }

        return "success";
    }
}
