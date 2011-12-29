/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public final class CameraCaptureType {
  public final static CameraCaptureType GP_CAPTURE_IMAGE = new CameraCaptureType("GP_CAPTURE_IMAGE");
  public final static CameraCaptureType GP_CAPTURE_MOVIE = new CameraCaptureType("GP_CAPTURE_MOVIE");
  public final static CameraCaptureType GP_CAPTURE_SOUND = new CameraCaptureType("GP_CAPTURE_SOUND");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CameraCaptureType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CameraCaptureType.class + " with value " + swigValue);
  }

  private CameraCaptureType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CameraCaptureType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CameraCaptureType(String swigName, CameraCaptureType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CameraCaptureType[] swigValues = { GP_CAPTURE_IMAGE, GP_CAPTURE_MOVIE, GP_CAPTURE_SOUND };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
