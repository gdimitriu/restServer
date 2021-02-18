package restserver.server.entrypoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryPointController {

    private static final Logger log = LoggerFactory.getLogger(EntryPointController.class);

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo() {
        log.debug("MyEntryPoint");
        return "MyEntryPoint";
    }

    @RequestMapping(value = "/secured", method = RequestMethod.GET)
    public String getSecured() {
        log.debug("MySecuredInfo");
        return "MySecuredInfo";
    }

}
