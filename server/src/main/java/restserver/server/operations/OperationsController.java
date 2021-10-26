package restserver.server.operations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operations")
public class OperationsController {
    private static final Logger log = LoggerFactory.getLogger(OperationsController.class);

    @RequestMapping(path="/putOperation", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResultOperation>  putOperation(@RequestBody RequestOperation data) {
        ResultOperation result = new ResultOperation(data.getKey(), data.getValue() + " received");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(path="/patchOperation", method = RequestMethod.PATCH, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResultOperation>  patchOperation(@RequestBody RequestOperation data) {
        ResultOperation result = new ResultOperation(data.getKey(), data.getValue() + " received");
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
