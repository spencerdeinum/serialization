package com.sdeinum;

import java.io.Serializable;
import java.util.Map;

public class Manager {

    private CustomerId customerId;

    public Manager() {
        this.customerId = new CustomerId("1234");
    }

    public void process(Map<String, Object> httpSession) {
        httpSession.put("customerId", customerId);
    }

    public class CustomerId implements Serializable {

        private String id;

        public CustomerId(String id) {
            this.id = id;
        }

    }

}
