package com.xworkz.external;


import com.xworkz.internal.Mirror;

public class WallMirror implements Mirror {

        @Override
        public void reflect() {
            System.out.println("Wall mirror is reflecting the image");
        }
    }
