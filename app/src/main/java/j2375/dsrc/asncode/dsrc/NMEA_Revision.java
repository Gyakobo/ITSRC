/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/NMEA_Revision.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the NMEA_Revision type of the dsrc module.
 */
public class NMEA_Revision extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unknown.
   */
  public static final int ASN_unknown = 0;

  /**
   * value of the named enumerated reserved.
   */
  public static final int ASN_reserved = 1;

  /**
   * value of the named enumerated rev1.
   */
  public static final int ASN_rev1 = 2;

  /**
   * value of the named enumerated rev2.
   */
  public static final int ASN_rev2 = 3;

  /**
   * value of the named enumerated rev3.
   */
  public static final int ASN_rev3 = 4;

  /**
   * value of the named enumerated rev4.
   */
  public static final int ASN_rev4 = 5;

  /**
   * value of the named enumerated rev5.
   */
  public static final int ASN_rev5 = 6;

  /**
   *  Constructs a newly allocated NMEA_Revision.
   */
  public NMEA_Revision ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated NMEA_Revision that represents the primitive int argument.
   *  @param value the value to be represented by this NMEA_Revision.
   */
  public NMEA_Revision (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated NMEA_Revision that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this NMEA_Revision.
   */
  public NMEA_Revision (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
