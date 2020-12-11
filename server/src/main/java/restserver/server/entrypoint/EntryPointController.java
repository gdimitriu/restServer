package restserver.server.entrypoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entry")
public class EntryPointController {

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String getInfo() {
        return "MyEntryPoint";
    }
}
