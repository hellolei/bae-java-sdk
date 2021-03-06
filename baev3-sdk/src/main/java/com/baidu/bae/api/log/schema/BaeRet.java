/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.baidu.bae.api.log.schema;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum BaeRet implements org.apache.thrift.TEnum {
  OK(0),
  RETRY(1),
  OLD_VERSION(2),
  AUTH_PARM_ERROR(3),
  AUTH_FAIL(4),
  AUTH_ASK_NOT_EXIST(5),
  AUTH_ASK_NOT_MATCH(6),
  AUTH_QUOTA_NOT_INIT(7),
  AUTH_QUOTA_EXCEED(8),
  AUTH_QUOTA_UPDATE_ERROR(9),
  AUTH_CONN_FAIL(10),
  INTERNAL_ERROR(11);

  private final int value;

  private BaeRet(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static BaeRet findByValue(int value) { 
    switch (value) {
      case 0:
        return OK;
      case 1:
        return RETRY;
      case 2:
        return OLD_VERSION;
      case 3:
        return AUTH_PARM_ERROR;
      case 4:
        return AUTH_FAIL;
      case 5:
        return AUTH_ASK_NOT_EXIST;
      case 6:
        return AUTH_ASK_NOT_MATCH;
      case 7:
        return AUTH_QUOTA_NOT_INIT;
      case 8:
        return AUTH_QUOTA_EXCEED;
      case 9:
        return AUTH_QUOTA_UPDATE_ERROR;
      case 10:
        return AUTH_CONN_FAIL;
      case 11:
        return INTERNAL_ERROR;
      default:
        return null;
    }
  }
}
