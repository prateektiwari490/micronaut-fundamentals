package smart.oven;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class OvenController {

    @Get("/status/{ovenId}")
    public String getOvenStatus(String ovenId) {
        return "OK";
    }
}
