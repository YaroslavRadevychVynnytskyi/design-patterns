package patterns.structural.decorator.example1.decorator;

import patterns.structural.decorator.example1.DataSource;

public class EncryptionDataSourceDecorator extends DataSourceDecorator {

    public EncryptionDataSourceDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        encrypt(data);
        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decrypt(data);
    }

    private String encrypt(String data) {
        String encryptedData = new StringBuilder(data).reverse().toString();
        System.out.println("Encrypted data: " + encryptedData);

        return encryptedData;
    }

    private String decrypt(String data) {
        String decryptedData = new StringBuilder(data).reverse().toString();
        System.out.println("Decrypting data: " + decryptedData);

        return decryptedData;
    }
}
