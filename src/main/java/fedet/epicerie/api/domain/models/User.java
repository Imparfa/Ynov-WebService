package fedet.epicerie.api.domain.models;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class User {

  public byte[] getQRCode() throws WriterException, IOException {
    QRCodeWriter qrCodeWriter = new QRCodeWriter();
    BitMatrix bitMatrix = qrCodeWriter.encode("16", BarcodeFormat.QR_CODE, 126, 126);

    ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
    MatrixToImageConfig con = new MatrixToImageConfig( 0xFF000002 , 0xFFFFC041 ) ;

    MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream,con);
      return pngOutputStream.toByteArray();
  }

}
