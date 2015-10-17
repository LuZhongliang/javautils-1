package com.cenrise.commons.utils.encrypt;

import junit.framework.TestCase;

import com.cenrise.commons.utils.encrypt.Base32;

public class Base32Test extends TestCase {

    public void testBase32() {
        String text = "There can be miracles when you believe";

        String base32 = Base32.encode(text.getBytes());

        assertEquals("KRUGK4TFEBRWC3RAMJSSA3LJOJQWG3DFOMQHO2DFNYQHS33VEBRGK3DJMV3GK", base32);
        assertEquals(Base32.decode(base32), text);

    }

}