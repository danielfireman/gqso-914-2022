package com.danielfireman.ifal.calcapi;

import io.jooby.annotations.*;

@Path("/raiz/{p}")
public class Raiz {

  @GET
  public double calculaRaiz(@PathParam String p) {
    return Math.sqrt(Float.parseFloat(p));
  }
}
