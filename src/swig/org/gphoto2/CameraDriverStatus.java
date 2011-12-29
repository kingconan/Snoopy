/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public final class CameraDriverStatus {
  public final static CameraDriverStatus GP_DRIVER_STATUS_PRODUCTION = new CameraDriverStatus("GP_DRIVER_STATUS_PRODUCTION");
  public final static CameraDriverStatus GP_DRIVER_STATUS_TESTING = new CameraDriverStatus("GP_DRIVER_STATUS_TESTING");
  public final static CameraDriverStatus GP_DRIVER_STATUS_EXPERIMENTAL = new CameraDriverStatus("GP_DRIVER_STATUS_EXPERIMENTAL");
  public final static CameraDriverStatus GP_DRIVER_STATUS_DEPRECATED = new CameraDriverStatus("GP_DRIVER_STATUS_DEPRECATED");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CameraDriverStatus swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CameraDriverStatus.class + " with value " + swigValue);
  }

  private CameraDriverStatus(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CameraDriverStatus(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CameraDriverStatus(String swigName, CameraDriverStatus swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CameraDriverStatus[] swigValues = { GP_DRIVER_STATUS_PRODUCTION, GP_DRIVER_STATUS_TESTING, GP_DRIVER_STATUS_EXPERIMENTAL, GP_DRIVER_STATUS_DEPRECATED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

