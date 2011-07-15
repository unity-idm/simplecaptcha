package simplecaptcha.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/sc")
    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse resp) throws Exception {

        return new ModelAndView("simplecaptcha.jsp");
    }

}
