/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/ntcip/EssPrecipYesNo.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.ntcip;

/**
 * Class definition of the EssPrecipYesNo type of the ntcip module.
 */
public class EssPrecipYesNo extends fr.marben.asnsdk.japi.spe.EnumeratedValue
{
  /**
   * value of the named enumerated precip.
   */
  public static final int ASN_precip = 1;

  /**
   * value of the named enumerated noPrecip.
   */
  public static final int ASN_noPrecip = 2;

  /**
   * value of the named enumerated error.
   */
  public static final int ASN_error = 3;

  /**
   *  Constructs a newly allocated EssPrecipYesNo.
   */
  public EssPrecipYesNo ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated EssPrecipYesNo that represents the primitive int argument.
   *  @param value the value to be represented by this EssPrecipYesNo.
   */
  public EssPrecipYesNo (int value)
  {
    super(value);
  };
}