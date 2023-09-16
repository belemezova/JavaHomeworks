package bg.startit.java.oop.homework1.time;

import java.util.Scanner;

public class TimeTest {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    Time time=new Time();
    System.out.println("Please entre the hour: ");
    time.setHour(scanner.nextInt());
    System.out.println("Please entre the minute: ");
    time.setMinute(scanner.nextInt());
    System.out.println("Please entre the seconds: ");
    time.setSecond(scanner.nextInt());
    time.tick(time.getHour(), time.getMinute(), time.getSecond());
    time.print();

  }
}
/*Failed to push to [maya-zaharieva]
(the full certificate chain may not be available locally; see "hg help debugssl") abort: error:
[SSL: CERTIFICATE_VERIFY_FAILED] certificate verify failed (_ssl.c:727)
hg debugssl [SOURCE]

test a secure connection to a server

    This builds the certificate chain for the server on Windows, installing
    the missing intermediates and trusted root via Windows Update if
    necessary.  It does nothing on other platforms.

-- More  --
*/