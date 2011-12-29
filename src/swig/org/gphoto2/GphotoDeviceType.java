/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public final class GphotoDeviceType {
  public final static GphotoDeviceType GP_DEVICE_STILL_CAMERA = new GphotoDeviceType("GP_DEVICE_STILL_CAMERA", 0);
  public final static GphotoDeviceType GP_DEVICE_AUDIO_PLAYER = new GphotoDeviceType("GP_DEVICE_AUDIO_PLAYER", 1 << 0);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GphotoDeviceType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GphotoDeviceType.class + " with value " + swigValue);
  }

  private GphotoDeviceType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GphotoDeviceType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GphotoDeviceType(String swigName, GphotoDeviceType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GphotoDeviceType[] swigValues = { GP_DEVICE_STILL_CAMERA, GP_DEVICE_AUDIO_PLAYER };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

