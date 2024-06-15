package com.example.serving_web_content;

// To handle this error, you can create a custom error controller that implements the ErrorController interface
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

    // Define a request mapping for /error
    @RequestMapping("/error")
    public String handleError() {
        // Return the name of the view that you want to display for the error
        return "errorPage";
    }

    // No need to override getErrorPath() anymore
}