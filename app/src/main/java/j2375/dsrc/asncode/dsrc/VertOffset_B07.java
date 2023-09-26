/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/VertOffset_B07.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> LSB units of 002 G steps over -252 to +254 G
 * <BR> The value +127 shall be used for ranges >= 254 G
 * <BR> The value -126 shall be used for ranges <= 252 G
 * <BR> The value -127 shall be used for unavailable
 * Class definition of the VertOffset_B07 type of the dsrc module.
 */
public class VertOffset_B07 extends fr.marben.asnsdk.japi.spe.IntIntegerValue
{
  /**
   *  Constructs a newly allocated VertOffset_B07.
   */
  public VertOffset_B07 ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated VertOffset_B07 that represents the primitive int argument.
   *  @param value the value to be represented by this VertOffset_B07.
   */
  public VertOffset_B07 (int value)
  {
    super(value);
  };
}
