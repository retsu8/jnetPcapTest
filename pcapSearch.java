import java.util.Arrays;

public class pcapSearch{
    public String[] pcapArray = s.split(',"');
    public String[] passwords = null;
    public String[] IPsyn = null;
    public String[] IPacksyn = null;
    public String IPADDRESS_PATTERN ="(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
    public Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
    public Matcher matcher = pattern.matcher(ipString);

    public class void main(String pcap){
        ipAddressSYN(pcap);
        passFinder(pcap);

    }
    public class void ipAddressSYN(String pcap){
        Array[] bucket = null;
        for(String testStr : pcapArray){
            if (testStr.indexOf("SYN+ACK") != -1){
               if (matcher.find()) {
                   IPacksyn.add(matcher.group());
                }
            }else if (testStr.indexOf("SYN") != -1){
                if (matcher.find()) {
                    IPsyn.add(matcher.group());
                }
            }
        }
        for(String ip : ipsyn)
            if(Arrays.asList(bucket).contains(ip)){
                bucket[ip]++;
            }
            else
                bucket.add(ip);
                bucket[ip]++;
    }
    public class void passFinder(String pcap){
            for(String testStr : pcapArray){
                if (testStr.indexOf("password") != -1){
                    int p1 = testStr.indexOf("password");
                    testStr = testStr.substring(p1, testStr.length());
                    p1 = testStr.indexOf('"')
                    testStr = testStr.substring(0, p1);
                    passwords.add(testStr);
                }else if (testStr.indexOf("pass") != -1){
                    int p1 = testStr.indexOf("pass");
                    testStr = testStr.substring(p1, testStr.length());
                    p1 = testStr.indexOf('"')
                    testStr = testStr.substring(0, p1);
                    passwords.add(testStr);
                    passwords.add(testStr);
                }else if (testStr.indexOf("user") != -1){
                    int p1 = testStr.indexOf("user");
                    testStr = testStr.substring(p1, testStr.length());
                    p1 = testStr.indexOf('"')
                    testStr = testStr.substring(0, p1);
                    passwords.add(testStr);
                    passwords.add(testStr);
                }else if (testStr.indexOf("usr") != -1){
                    int p1 = testStr.indexOf("usr");
                    testStr = testStr.substring(p1, testStr.length());
                    p1 = testStr.indexOf('"')
                    testStr = testStr.substring(0, p1);
                    passwords.add(testStr);
                    passwords.add(testStr);
                }
            }
            for (String pass : passwords){
                System.out.print(pass);
            }
    }
}