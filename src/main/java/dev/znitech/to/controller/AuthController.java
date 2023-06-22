package dev.znitech.to.controller;

import dev.znitech.to.model.ReqHttpLogin;
import dev.znitech.to.model.RespHttpLogin;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.Operation;

@Controller("/auth")
public class AuthController {


    @Post("/login")
    @Operation(summary = "Login API")
    public RespHttpLogin login(@Body ReqHttpLogin reqHttpLogin) {
        return new RespHttpLogin("Success Login","status");
    }
}
