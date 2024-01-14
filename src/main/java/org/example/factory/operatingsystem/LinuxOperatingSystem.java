package org.example.factory.operatingsystem;

public class LinuxOperatingSystem extends OperatingSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {
        System.out.println("Changing Linux directory");
    }

    @Override
    public void removeDir(String dir) {
        System.out.println("Removing Linux directory");
    }
}
