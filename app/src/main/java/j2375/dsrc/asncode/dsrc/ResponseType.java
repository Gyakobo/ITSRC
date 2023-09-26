/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/ResponseType.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the ResponseType type of the dsrc module.
 */
public class ResponseType extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated notInUseOrNotEquipped.
   */
  public static final int ASN_notInUseOrNotEquipped = 0;

  /**
   * value of the named enumerated emergency.
   */
  public static final int ASN_emergency = 1;

  /**
   * value of the named enumerated nonEmergency.
   */
  public static final int ASN_nonEmergency = 2;

  /**
   * value of the named enumerated pursuit.
   */
  public static final int ASN_pursuit = 3;

  /**
   * value of the named enumerated stationary.
   */
  public static final int ASN_stationary = 4;

  /**
   * value of the named enumerated slowMoving.
   */
  public static final int ASN_slowMoving = 5;

  /**
   * value of the named enumerated stopAndGoMovement.
   */
  public static final int ASN_stopAndGoMovement = 6;

  /**
   *  Constructs a newly allocated ResponseType.
   */
  public ResponseType ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated ResponseType that represents the primitive int argument.
   *  @param value the value to be represented by this ResponseType.
   */
  public ResponseType (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated ResponseType that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this ResponseType.
   */
  public ResponseType (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
