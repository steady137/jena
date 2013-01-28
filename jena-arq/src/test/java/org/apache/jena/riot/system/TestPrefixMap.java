/*
 * Copyright 2013 YarcData LLC All Rights Reserved.
 */ 

package org.apache.jena.riot.system;

public class TestPrefixMap extends TestLightweightPrefixMap {

    @Override
    protected LightweightPrefixMap getPrefixMap() {
        return new PrefixMap();
    }

}