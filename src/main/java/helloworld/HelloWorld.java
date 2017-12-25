package helloworld;

import jnr.ffi.LibraryLoader;

public class HelloWorld {
    public static interface LibC {
        int puts(String s);
    }

    public static void main(String[] args) {
        LibC libc = LibraryLoader.create(LibC.class).load("c");

        libc.puts("Hello, World");
    }
}