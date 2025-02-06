public class IPaddress {
    public static boolean sameSubnet( String ip1, String ip2, String subnetMask) {
        int ip1Binary = ipToInt(ip1);
        int ip2Binary = ipToInt(ip2);
        int maskBinary = ipToInt(subnetMask);

        return (ip1Binary & maskBinary ) == (ip2Binary & maskBinary);


    
    }




    private static int ipToInt(String ip) {
        String[] parts = ip.split("\\.");
        return (Integer.parseInt(parts[0]) << 24) |
               (Integer.parseInt(parts[1]) << 16) |
               (Integer.parseInt(parts[2]) << 8) |
               Integer.parseInt(parts[3]);
    }


        public static void main(String[] args) {
        System.out.println(sameSubnet("192.168.1.10", "192.168.1.20", "255.255.255.0"));
    }
}
