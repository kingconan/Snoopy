
LOCAL_PATH:= $(call my-dir)

include $(CLEAR_VARS)

LOCAL_ARM_MODE := arm

LOCAL_SRC_FILES:= \
	ltdl.c

LOCAL_C_INCLUDES += $(LOCAL_PATH)/android


LOCAL_CFLAGS += -DHAVE_CONFIG_H -DHAVE_LIBDL # -DHAVE_SHL_LOAD
LOCAL_CFLAGS += -DLTDL_SHLIB_EXT=\".so\"
LOCAL_CFLAGS += -W -Wall
LOCAL_CFLAGS += -fPIC -DPIC


ifeq ($(TARGET_BUILD_TYPE),release)
	LOCAL_CFLAGS += -O2
endif

LOCAL_LDLIBS := -L$(SYSROOT)/usr/lib -ldl

LOCAL_MODULE:= libltdl

LOCAL_PRELINK_MODULE := false
include $(BUILD_SHARED_LIBRARY)
