package introduction;

import org.apache.log4j.Logger;

public class HelloWorld {

    public static void main(String [ ] args) {
        Logger log = Logger.getLogger("name");
        log.info("INFO.COM");
        System.out.println("Hello! Witaj!");}

}