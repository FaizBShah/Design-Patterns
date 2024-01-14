package org.example.factory;

import org.example.factory.operatingsystem.LinuxOperatingSystem;
import org.example.factory.operatingsystem.OperatingSystem;
import org.example.factory.operatingsystem.WindowsOperatingSystem;

public class OperatingSystemFactory {

    private OperatingSystemFactory() {
    }

    public static OperatingSystem getOperatingSystem(String type, String version, String architecture) {
        return switch (type) {
            case "WINDOWS" -> new WindowsOperatingSystem(version, architecture);
            case "LINUX" -> new LinuxOperatingSystem(version, architecture);
            default -> throw new IllegalArgumentException("OS Not supported");
        };
    }
}
