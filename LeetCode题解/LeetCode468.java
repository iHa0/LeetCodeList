class Solution {
    public String validIPAddress(String queryIP) {
        if (isIpv4(queryIP)) return "IPv4";
        if (isIpv6(queryIP)) return "IPv6";
        return "Neither";
    }

    private boolean isIpv4(String queryIP) {
        String[] segment = queryIP.split("\\.", -1);
        if (segment.length != 4) return false;
        for (String ip : segment) {
            if (ip.length() > 3 || ip.length() == 0 || ip.charAt(0) == '0' && ip.length() != 1) return false;
            int sum = 0;
            for (char c : ip.toCharArray()) {
                if (c < '0' || c > '9') return false;
                sum = sum * 10 + (c - '0');
            }
            if (sum < 0 || sum > 255) return false;
        }
        return true;
    }

    private boolean isIpv6(String queryIP) {
        String[] segment = queryIP.split("\\:", -1);
        if (segment.length != 8) return false;
        for (String ip : segment) {
            if (ip.length() == 0 || ip.length() > 4) return false;
            for (char c : ip.toCharArray()) {
                if (c < '0' || c < 'A' && c > '9' || c > 'F' && c < 'a' || c > 'f') return false;
            }
        }
        return true;
    }
}
