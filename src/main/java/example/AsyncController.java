package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.WebAsyncTask;

import static example.Application.RESPONSE;

@Controller
public class AsyncController {
    @GetMapping("/async")
    @ResponseBody
    public WebAsyncTask<String> get( ) {
        return new WebAsyncTask<>( () -> RESPONSE );
    }
}
