package org.j2ee.util;

import java.util.UUID;

public class UuidUtils {

    public static String getUuid() {
        return UUID.randomUUID().toString();
    }

}
