package restserver.server.mutiple;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/multiple")
public class MultipleController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    String allOperations(@RequestHeader(name = "header1",required = true) String header1,
                         @RequestHeader(name = "header2",required = true) String header2,
                         @RequestParam(name="query1", required = true) String query1,
                         @RequestParam(name="query2", required = true) String query2) {
        StringBuilder builder = new StringBuilder();
        builder.append("Headers: ");
        builder.append("header1=" + header1 + ";");
        builder.append("header2=" + header2 + ";");
        builder.append("Queries: ");
        builder.append("query1=" + query1 + "&");
        builder.append("query2=" + query2);
        return builder.toString();
    }
}
