public class pcapSearch{
    public class void main(String pcap){
        String[] pcapArray = s.split(',"');
        String[] passwords = null;
        for(String testStr : pcapArray){
            if (testStr.indexOf("password") != -1){
                passwords.add(testStr);
            }else if (testStr.indexOf("pass") != -1){
                passwords.add(testStr);
            }else if (testStr.indexOf("user") != -1){
                passwords.add(testStr);
            }else if (testStr.indexOf("usr") != -1){
                passwords.add(testStr);
            }
        }
        for (String pass in passwords){
            
        }
    }
}