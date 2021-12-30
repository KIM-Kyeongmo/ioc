package kr.co.ezenac.ioc;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder() {
        this.iEncoder = new Base64Encoder();
    }

    public String Encoder(String message) {
        return iEncoder.encode(message);
    }
}