package com.danielfireman.ifal.calcapi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import io.jooby.MockRouter;
import io.jooby.StatusCode;
import io.jooby.exception.BadRequestException;

public class RaizTest {

  @Test
  public void chamaCalculaRaiz() {
    Raiz raiz = new Raiz();
    assertEquals(5.0, raiz.calculaRaiz("25"));
  }

  @Test
  public void raiz() {
    MockRouter router = new MockRouter(new App());
    router.get("/raiz/9", rsp -> {
      assertEquals(3.0, rsp.value());
      assertEquals(StatusCode.OK, rsp.getStatusCode());
    });
  }

  @Test
  public void raiz_opString() {
    MockRouter router = new MockRouter(new App());
    assertThrows(NumberFormatException.class,
    ()->{
      router.get("/raiz/aa", rsp -> {});
    });
  }
}
