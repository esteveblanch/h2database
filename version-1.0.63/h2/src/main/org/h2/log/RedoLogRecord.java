/*
 * Copyright 2004-2007 H2 Group. Licensed under the H2 License, Version 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.log;

import org.h2.store.Storage;

public class RedoLogRecord {
    public Storage storage;
    public int sequenceId;
    public int recordId;
    public int offset;
    public byte[] data;
    
    public int getSize() {
        // estimated memory size in bytes ((5 variables+myself) * 4 bytes each)
        if (data == null) {
            return 24;
        } else {
            return 28 + data.length;
        }
    }
}