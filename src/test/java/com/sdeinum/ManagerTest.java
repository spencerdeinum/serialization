package com.sdeinum;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void testSerialization() throws IOException {
        Manager m = new Manager();
        HashMap<String, Object> httpSession = new HashMap<>();

        m.process(httpSession);

        final Object customerId = httpSession.get("customerId");

        assertInstanceOf(Manager.CustomerId.class, customerId);

        ObjectOutputStream oos = new ObjectOutputStream(new ByteArrayOutputStream());
        oos.writeObject(customerId);
    }

}