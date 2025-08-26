package com.mincheol.library.base.mvc.restController;

import com.mincheol.library.base.http.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/sample")
public class SampleController {


    @GetMapping("/sample")
    public ApiResponse selectSample() throws Exception {

        var result = "";


        return ApiResponse.ok(result);

    }

}
