/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package swig.org.gphoto2;

public class CameraFileInfo {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public CameraFileInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CameraFileInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gphoto2JNI.delete_CameraFileInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPreview(CameraFileInfoPreview value) {
    gphoto2JNI.CameraFileInfo_preview_set(swigCPtr, this, CameraFileInfoPreview.getCPtr(value), value);
  }

  public CameraFileInfoPreview getPreview() {
    long cPtr = gphoto2JNI.CameraFileInfo_preview_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CameraFileInfoPreview(cPtr, false);
  }

  public void setFile(CameraFileInfoFile value) {
    gphoto2JNI.CameraFileInfo_file_set(swigCPtr, this, CameraFileInfoFile.getCPtr(value), value);
  }

  public CameraFileInfoFile getFile() {
    long cPtr = gphoto2JNI.CameraFileInfo_file_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CameraFileInfoFile(cPtr, false);
  }

  public void setAudio(CameraFileInfoAudio value) {
    gphoto2JNI.CameraFileInfo_audio_set(swigCPtr, this, CameraFileInfoAudio.getCPtr(value), value);
  }

  public CameraFileInfoAudio getAudio() {
    long cPtr = gphoto2JNI.CameraFileInfo_audio_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CameraFileInfoAudio(cPtr, false);
  }

  public CameraFileInfo() {
    this(gphoto2JNI.new_CameraFileInfo(), true);
  }

}
