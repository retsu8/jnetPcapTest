public class pcapSearch{
    public String[] pcapArray = s.split(',"');
    public String[] passwords = null;
    public class void main(String pcap){
        ipAddressSYN(pcap);
        passFinder(pcap);

    }
    public class void ipAddressSYN(String pcap){
        for(String testStr : pcapArray){
            
        }
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