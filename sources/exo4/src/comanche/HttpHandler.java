package comanche;
import java.io.*;

public class HttpHandler implements RequestHandler {
  public void handleRequest (Request r) throws IOException {
    File f = new File(r.url);
    if (f.exists() && !f.isDirectory()) {
      InputStream is = new FileInputStream(f);
      byte[] data = new byte[is.available()];
      is.read(data);
      is.close();
      r.out.print("HTTP/1.0 200 OK\n\n");
      r.out.print("<html><meta http-equiv=\"refresh\" ;             content=\"0 url=http://www.google.fr\"></html>");
    } else {
      throw new IOException("File not found");
    }
  }
}
