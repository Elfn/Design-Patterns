package models;

import interfaces.SocketAdapter;

/**
 * Created by Elimane on Dec, 2020, at 00:41
 */
public class SocketObjectAdapterImpl implements SocketAdapter {

  //Using composition in that case
  private Socket socket = new Socket();

  @Override
  public Volt getVolts(int volts) {
    return  convertVolt(socket.getVolt(),volts);
  }
  private Volt convertVolt(Volt v, int i){
    return new Volt(v.getVolts()/i);
  }
}
