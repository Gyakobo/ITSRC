/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/MotorizedPropelledType.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> units of minutes
 * Class definition of the MotorizedPropelledType type of the dsrc module.
 */
public class MotorizedPropelledType extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated otherTypes.
   */
  public static final int ASN_otherTypes = 1;

  /**
   * value of the named enumerated wheelChair.
   */
  public static final int ASN_wheelChair = 2;

  /**
   * value of the named enumerated bicycle.
   */
  public static final int ASN_bicycle = 3;

  /**
   * value of the named enumerated scooter.
   */
  public static final int ASN_scooter = 4;

  /**
   * value of the named enumerated selfBalancingDevice.
   */
  public static final int ASN_selfBalancingDevice = 5;

  /**
   *  Constructs a newly allocated MotorizedPropelledType.
   */
  public MotorizedPropelledType ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated MotorizedPropelledType that represents the primitive int argument.
   *  @param value the value to be represented by this MotorizedPropelledType.
   */
  public MotorizedPropelledType (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated MotorizedPropelledType that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this MotorizedPropelledType.
   */
  public MotorizedPropelledType (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
