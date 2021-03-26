package fr.esiea.ex4A;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetMockController {

    @PostMapping("/api/inscription")
    public void inscription(@RequestBody UserInfo userInfo) throws InterruptedException{
        System.out.println(userInfo);
    }
}
