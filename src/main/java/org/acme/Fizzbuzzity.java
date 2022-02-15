package org.acme;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Fizzbuzzity {
    private static final Logger LOG = Logger.getLogger(Fizzbuzzity.class);


    public void fizzbuzz(int max) {
        StringBuffer fizzbuzz = new StringBuffer();
        for (int i = 0; i < max; i++) {

            fizzbuzz.append(i % 3 == 0 ? "fizz" : "");
            fizzbuzz.append(i % 5 == 0 ? "buzz" : "");
            LOG.info(fizzbuzz.length() == 0 ? i : fizzbuzz.toString());
            fizzbuzz.delete(0, fizzbuzz.length());


        }
    }
}
