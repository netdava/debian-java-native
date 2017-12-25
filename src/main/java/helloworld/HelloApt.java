package helloworld;

import jnr.ffi.LibraryLoader;

public class HelloApt {

public static interface Configuration {
}

public static interface LibApt {
}

public static void main(String[] args) {
        LibApt apt = LibraryLoader.create(LibApt.class).load("apt-pkg");

        apt.
}
}