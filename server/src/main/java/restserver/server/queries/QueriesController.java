package restserver.server.queries;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/queries")
public class QueriesController {

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    String queryGet(@RequestParam(name="query1", required = true) String query1,
                    @RequestParam(name="query2", required = true) String query2) {
        return "Received: query1=" + query1 + ";query2=" + query2;
    }
}
