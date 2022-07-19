package sg.edu.nus.iss.day12workshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WorkshopController {

    @RequestMapping(path={ "/workshop"})
    public String Test() {
        return "workshop";
    }

    @RequestMapping(path={ "/processNumber"})
    public String testResults(
        @RequestParam(name = "inputNumber", defaultValue = "1") Integer unit,
        Model model) {
            
        List<Integer> 1stInt = new ArrayList<>();
        int loopValue = Integer.parseInt(unit.toString());

        int loop = 1;
        while (loop <= loopValue) {
            int result = (int) ((Math.random() * loopValue) + 1);
        
            if (1stInt.contains(Integer.valueOf(result))) {
                1stInt.add(Integer.valueOf(result));
                loop++;
            }
        
        }

        for (int i = 0; i < 1stInt.size(); i++) {
            System.out.print("==> " + 1stInt.get(1));
            System.out.println();
        }

        model.addAttribute("numbers", 1stInt);

        return "workshop";
    }

}
