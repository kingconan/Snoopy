/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public class GPPortSettingsDisk {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public GPPortSettingsDisk(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(GPPortSettingsDisk obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gphoto2JNI.delete_GPPortSettingsDisk(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMountpoint(String value) {
    gphoto2JNI.GPPortSettingsDisk_mountpoint_set(swigCPtr, this, value);
  }

  public String getMountpoint() {
    return gphoto2JNI.GPPortSettingsDisk_mountpoint_get(swigCPtr, this);
  }

  public GPPortSettingsDisk() {
    this(gphoto2JNI.new_GPPortSettingsDisk(), true);
  }

}
