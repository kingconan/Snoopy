/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public final class GPPin {
  public final static GPPin GP_PIN_RTS = new GPPin("GP_PIN_RTS");
  public final static GPPin GP_PIN_DTR = new GPPin("GP_PIN_DTR");
  public final static GPPin GP_PIN_CTS = new GPPin("GP_PIN_CTS");
  public final static GPPin GP_PIN_DSR = new GPPin("GP_PIN_DSR");
  public final static GPPin GP_PIN_CD = new GPPin("GP_PIN_CD");
  public final static GPPin GP_PIN_RING = new GPPin("GP_PIN_RING");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static GPPin swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + GPPin.class + " with value " + swigValue);
  }

  private GPPin(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private GPPin(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private GPPin(String swigName, GPPin swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static GPPin[] swigValues = { GP_PIN_RTS, GP_PIN_DTR, GP_PIN_CTS, GP_PIN_DSR, GP_PIN_CD, GP_PIN_RING };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

