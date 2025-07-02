package com.CarRent.Controller;

import com.CarRent.Dao.Details;
import com.CarRent.Dto.UserRequest;
import com.CarRent.Repository.UserRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class DetailsController {

    @Autowired private final UserRequestRepository urr;

    @PostMapping("/update")
    public String updateDetails(@RequestBody UserRequest ur){
        Details details = new Details();
        details.setLicense(ur.getLicense());
        details.setAdhar(ur.getAdhar());
        details.setEmail(ur.getEmail());
        details.setPan(ur.getPan());
        urr.save(details);
        return "Details updated";
    }

}
