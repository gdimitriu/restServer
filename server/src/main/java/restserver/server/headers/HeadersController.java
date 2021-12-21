package restserver.server.headers;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/headers")
public class HeadersController {

    @RequestMapping(value = "/header", method = RequestMethod.GET)
    String getHeaders(@RequestHeader("header1") String header1,@RequestHeader("header2") String header2) {
        return "Received: header1=" + header1 + ";header2=" + header2;
    }
}
