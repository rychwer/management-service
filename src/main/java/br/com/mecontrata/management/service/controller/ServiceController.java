package br.com.mecontrata.management.service.controller;

import br.com.mecontrata.management.service.facade.ServiceFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/service")
public class ServiceController {

    private ServiceFacade serviceFacade;

    public ServiceController(ServiceFacade serviceFacade) {
        this.serviceFacade = serviceFacade;
    }

    @GetMapping("/{email}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public List<LocalDateTime> getScheduledDays(@PathVariable @Pattern(regexp = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$",
            message = "{email.invalid}") String email) {
        return serviceFacade.getScheduledDays(email);
    }

}