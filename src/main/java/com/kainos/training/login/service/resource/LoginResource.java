package com.kainos.training.login.service.resource;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {

    private final String requiredUsername;
    private final String requiredPassword;

    public LoginResource(String requiredUsername, String requiredPassword) {
        this.requiredUsername = requiredUsername;
        this.requiredPassword = requiredPassword;
    }

    @POST
    public Response login(@FormParam("username") String username,
           @FormParam("password") String password) {

        // todo: username and password check

        return Response
                .status(Response.Status.OK)
                .entity("Success!")
                .build();
    }
}
