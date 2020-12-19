package models;

import interfaces.SocketAdapter;

/**
 * Created by Elimane on Dec, 2020, at 00:23
 */
//Class adapter
public class SocketAdapterImpl extends Socket implements SocketAdapter {
  @Override
  public Volt getVolts(int volts) {
    return convertVolt(new Volt(volts),2);
  }

  private Volt convertVolt(Volt v, int i){
    return new Volt(v.getVolts()/i);
  }
}
