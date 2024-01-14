package org.example.factory.operatingsystem;

public class WindowsOperatingSystem extends OperatingSystem {

    public WindowsOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing Windows directory");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing Windows directory");
    }
}
