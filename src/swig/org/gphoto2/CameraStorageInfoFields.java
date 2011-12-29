/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public final class CameraStorageInfoFields {
  public final static CameraStorageInfoFields GP_STORAGEINFO_BASE = new CameraStorageInfoFields("GP_STORAGEINFO_BASE", (1 << 0));
  public final static CameraStorageInfoFields GP_STORAGEINFO_LABEL = new CameraStorageInfoFields("GP_STORAGEINFO_LABEL", (1 << 1));
  public final static CameraStorageInfoFields GP_STORAGEINFO_DESCRIPTION = new CameraStorageInfoFields("GP_STORAGEINFO_DESCRIPTION", (1 << 2));
  public final static CameraStorageInfoFields GP_STORAGEINFO_ACCESS = new CameraStorageInfoFields("GP_STORAGEINFO_ACCESS", (1 << 3));
  public final static CameraStorageInfoFields GP_STORAGEINFO_STORAGETYPE = new CameraStorageInfoFields("GP_STORAGEINFO_STORAGETYPE", (1 << 4));
  public final static CameraStorageInfoFields GP_STORAGEINFO_FILESYSTEMTYPE = new CameraStorageInfoFields("GP_STORAGEINFO_FILESYSTEMTYPE", (1 << 5));
  public final static CameraStorageInfoFields GP_STORAGEINFO_MAXCAPACITY = new CameraStorageInfoFields("GP_STORAGEINFO_MAXCAPACITY", (1 << 6));
  public final static CameraStorageInfoFields GP_STORAGEINFO_FREESPACEKBYTES = new CameraStorageInfoFields("GP_STORAGEINFO_FREESPACEKBYTES", (1 << 7));
  public final static CameraStorageInfoFields GP_STORAGEINFO_FREESPACEIMAGES = new CameraStorageInfoFields("GP_STORAGEINFO_FREESPACEIMAGES", (1 << 8));

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CameraStorageInfoFields swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CameraStorageInfoFields.class + " with value " + swigValue);
  }

  private CameraStorageInfoFields(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CameraStorageInfoFields(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CameraStorageInfoFields(String swigName, CameraStorageInfoFields swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CameraStorageInfoFields[] swigValues = { GP_STORAGEINFO_BASE, GP_STORAGEINFO_LABEL, GP_STORAGEINFO_DESCRIPTION, GP_STORAGEINFO_ACCESS, GP_STORAGEINFO_STORAGETYPE, GP_STORAGEINFO_FILESYSTEMTYPE, GP_STORAGEINFO_MAXCAPACITY, GP_STORAGEINFO_FREESPACEKBYTES, GP_STORAGEINFO_FREESPACEIMAGES };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

