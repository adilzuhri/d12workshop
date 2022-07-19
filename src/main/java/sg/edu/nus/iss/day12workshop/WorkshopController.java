package sg.edu.nus.iss.day12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorkshopController {

    @RequestMapping(path={ "/workshop"})
    public String Test() {
        return "workshop";
    }

    
}
