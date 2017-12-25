package helloworld;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;

public class HelloApt {

    public static void main(String[] args) {
        System.setProperty("jna.library.path", "/usr/lib/x86_64-linux-gnu");
        System.setProperty("jna.debug_load", "true");

        NativeLibrary apt = NativeLibrary.getInstance("apt-pkg");
        System.out.println(apt.getName());
        System.out.println(apt.getFile().getAbsolutePath());

        Pointer pkgVersion = apt.getGlobalVariableAddress("pkgLibVersion");
        System.out.println("Version is " + pkgVersion.getString(0));
    }

    public static interface LibApt extends Library {
        LibApt INSTANCE = (LibApt) Native.loadLibrary("apt-pkg", LibApt.class);
    }

}