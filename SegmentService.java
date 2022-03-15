import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author Dylan
 * The client to get target cords from jetson
 */

class Dim3i{
    public int x,y,z;
    public Dim3i(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Dim3i{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

public class SegmentService {

    public static byte[] REQUEST_HEADER = {'Q','U','E','R','Y'};

    public static String REQUEST_ADDRESS = "192.168.0.105";
    public static int REQUEST_PORT = 8081;
    public boolean Running = true;
    Socket sc;

    public SegmentService() throws IOException {
        while(Running) {
            try {
                Thread.sleep(3);
                sc = new Socket(REQUEST_ADDRESS, REQUEST_PORT, InetAddress.getByName("0.0.0.0"), 16000);
                break;
            } catch (Exception e) {
                System.out.println("INIT FAILED, RETRYING...");
                e.printStackTrace();
            }
        }

        sc.setSoTimeout(300);
    }

    public Dim3i getPosition(){
        try{
            sc.getOutputStream().write(REQUEST_HEADER);
            byte[] result = new byte[12];
            sc.getInputStream().read(result,0,12);
            int x = genInteger(Arrays.copyOfRange(result,0,4));
            int y = genInteger(Arrays.copyOfRange(result,4,8));
            int z = genInteger(Arrays.copyOfRange(result,8,12));
            System.out.println(new Dim3i(x,y,z));
            return new Dim3i(x,y,z);
        }catch (Exception e){
            try{ sc.close();}catch (IOException e2){
                System.out.println("FUCK YOUR MOM");
            }
            while(Running) {
                try {
                    Thread.sleep(3);
                    sc = new Socket(REQUEST_ADDRESS, REQUEST_PORT, InetAddress.getByName("0.0.0.0"), 5000);
                    break;
                } catch (Exception e3) {
                    System.out.println("RECONNECT FAILED, RETRYING...");
                }
            }
        }
        return null;
    }

    public static int genInteger(byte[] bytes){
        assert(bytes.length==4);
        int out = 0;

        for (int i = 0; i < 4; i++) {
            int n = ((int)bytes[i]) & 0xff;
            n <<= (3-i)*8;
            out += n;
        }
        return out;
    }
}
