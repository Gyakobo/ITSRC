/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/TractionControlStatus.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> LSB units of of 10 mSec, 
 * <BR> with a range of 001 seconds to 10 minutes and 5534 seconds
 * <BR> a value of 65534 to be used for 65534 seconds or greater
 * <BR> a value of 65535 to be unavailable
 * Class definition of the TractionControlStatus type of the dsrc module.
 */
public class TractionControlStatus extends fr.marben.asnsdk.japi.spe.EnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated off.
   */
  public static final int ASN_off = 1;

  /**
   * value of the named enumerated on.
   */
  public static final int ASN_on = 2;

  /**
   * value of the named enumerated engaged.
   */
  public static final int ASN_engaged = 3;

  /**
   *  Constructs a newly allocated TractionControlStatus.
   */
  public TractionControlStatus ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated TractionControlStatus that represents the primitive int argument.
   *  @param value the value to be represented by this TractionControlStatus.
   */
  public TractionControlStatus (int value)
  {
    super(value);
  };
}
