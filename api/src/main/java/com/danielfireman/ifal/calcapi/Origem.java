package com.danielfireman.ifal.calcapi;

import io.jooby.Context;
import io.jooby.MediaType;
import io.jooby.annotations.*;

@Path("/origem")
public class Origem {

  @GET
  public String origem(Context ctx) {
    ctx.setResponseCode(200);
    ctx.setResponseType(MediaType.HTML);
    return ctx.headerMap().toString();
  }
}
