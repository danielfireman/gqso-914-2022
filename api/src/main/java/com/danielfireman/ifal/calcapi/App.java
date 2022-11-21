package com.danielfireman.ifal.calcapi;

import io.jooby.Jooby;

public class App extends Jooby {

  {
    setTrustProxy(true);
    mvc(new Index());
    mvc(new Raiz());
    mvc(new Origem());
    mvc(new SomaMultiplos());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }
}
