package org.acme;

import io.netty.util.internal.MathUtil;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import java.util.Random;

@QuarkusMain
public class CmdApp implements QuarkusApplication {

    private static final Logger LOG = Logger.getLogger(CmdApp.class);

    @ConfigProperty(defaultValue = "15", name = "fizzbuzz.max")
    String max;

    @Inject
    Fizzbuzzity fizzbuzzity;

    @Override
    public int run(String... args) {

        int fizzbuzzMax = new Random().nextInt(Integer.parseInt(this.max));
        LOG.info("Starting FizzBuzz, max: " + fizzbuzzMax);

        fizzbuzzity.fizzbuzz(fizzbuzzMax);

        LOG.info("FizzBuzz completed");
        return 0;
    }
}