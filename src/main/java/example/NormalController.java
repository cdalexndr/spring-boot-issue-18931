package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static example.Application.RESPONSE;

@Controller
public class NormalController {
    @GetMapping("/normal")
    @ResponseBody
    public String get() {
        return RESPONSE;
    }
}
