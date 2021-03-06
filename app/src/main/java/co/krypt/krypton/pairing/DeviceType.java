package co.krypt.krypton.pairing;

import co.krypt.krypton.R;

public enum DeviceType {
    CHROME,
    FIREFOX,
    SAFARI,
    MICROSOFT_EDGE,
    UNKNOWN;

    public static DeviceType fromBrowser(String browser) {
        if (browser == null) {
            return DeviceType.UNKNOWN;
        }
        switch (browser) {
            case "firefox":
                return DeviceType.FIREFOX;
            case "chrome":
                return DeviceType.CHROME;
            case "safari":
                return DeviceType.SAFARI;
            case "edge":
                return DeviceType.MICROSOFT_EDGE;
            default:
                return DeviceType.UNKNOWN;
        }
    }

    public static DeviceType fromWorkstationName(String workstationName) {
        if (workstationName.startsWith("Firefox ")) {
            return DeviceType.FIREFOX;
        } else if (workstationName.startsWith("Chrome ")) {
            return DeviceType.CHROME;
        } else if (workstationName.startsWith("Safari ")) {
            return DeviceType.SAFARI;
        } else if (workstationName.startsWith("Microsoft Edge ")) {
            return DeviceType.MICROSOFT_EDGE;
        } else {
            return DeviceType.UNKNOWN;
        }
    }

    public static int getDeviceIcon(DeviceType deviceType) {
        if (deviceType == null) {
            return R.drawable.terminal_icon;
        } else switch (deviceType) {
            case FIREFOX:
                return R.drawable.firefox;
            case CHROME:
                return R.drawable.chrome;
            case SAFARI:
                return R.drawable.safari;
            case MICROSOFT_EDGE:
                return R.drawable.microsoft_edge;
            default:
                return R.drawable.terminal_icon;
        }
    }

    public boolean isBrowser() {
        return !(this == DeviceType.UNKNOWN);
    }
}
