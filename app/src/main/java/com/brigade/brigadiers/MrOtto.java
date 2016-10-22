package com.brigade.brigadiers;

import com.squareup.otto.Bus;

/**
 * Created by felipegutierrez on 10/21/16.
 */

public class MrOtto {
    private static final Bus BUS = new Bus();

    public static Bus getInstance() {
        return BUS;
    }

    private MrOtto() {
        // No instances.
    }
}
