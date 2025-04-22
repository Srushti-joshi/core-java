package com.xworkz.external;

import com.xworkz.internal.Hospital;

public class Apollo implements Hospital {

    @Override
    public void clean() {
        System.out.println("running clean in apollo");
    }
}
