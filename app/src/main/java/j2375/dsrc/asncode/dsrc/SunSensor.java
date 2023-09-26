/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/SunSensor.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> LSB units of 15 degrees, a range of -189 to +189 degrees
 * <BR> +001 = +15 deg
 * <BR> -126 = -189 deg and beyond  
 * <BR> +126 = +189 deg and beyond
 * <BR> +127 to be used for unavailable
 * Class definition of the SunSensor type of the dsrc module.
 */
public class SunSensor extends fr.marben.asnsdk.japi.spe.IntIntegerValue
{
  /**
   *  Constructs a newly allocated SunSensor.
   */
  public SunSensor ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated SunSensor that represents the primitive int argument.
   *  @param value the value to be represented by this SunSensor.
   */
  public SunSensor (int value)
  {
    super(value);
  };
}
