/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/VertOffset_B08.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> LSB units of of 10 cm
 * <BR> with a range of +- 63 meters vertical 
 * <BR> value  63 to be used for  63 or greater
 * <BR> value -63 to be used for -63 or greater
 * <BR> value -64 to be unavailable
 * Class definition of the VertOffset_B08 type of the dsrc module.
 */
public class VertOffset_B08 extends fr.marben.asnsdk.japi.spe.IntIntegerValue
{
  /**
   *  Constructs a newly allocated VertOffset_B08.
   */
  public VertOffset_B08 ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated VertOffset_B08 that represents the primitive int argument.
   *  @param value the value to be represented by this VertOffset_B08.
   */
  public VertOffset_B08 (int value)
  {
    super(value);
  };
}
