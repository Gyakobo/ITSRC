/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/UserSizeAndBehaviour.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the UserSizeAndBehaviour type of the dsrc module.
 */
public class UserSizeAndBehaviour extends fr.marben.asnsdk.japi.spe.BitStringValue
{
  /**
   * value of the named bit unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named bit smallStature.
   */
  public static final int ASN_smallStature = 1;

  /**
   * value of the named bit largeStature.
   */
  public static final int ASN_largeStature = 2;

  /**
   * value of the named bit erraticMoving.
   */
  public static final int ASN_erraticMoving = 3;

  /**
   * value of the named bit slowMoving.
   */
  public static final int ASN_slowMoving = 4;

  /**
   *  Constructs a newly allocated UserSizeAndBehaviour.
   */
  public UserSizeAndBehaviour ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated UserSizeAndBehaviour.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the bytes array parameter.
   *  @param value the value to be represented by this UserSizeAndBehaviour.
   *  @param bitCount the number of used bits to be represented by this UserSizeAndBehaviour.
   *  @throws IllegalArgumentException if the bitCount is not consistent with the length of the value.
   */
  public UserSizeAndBehaviour (byte[] value, int bitCount)
  {
    super(value, bitCount);
  }

  /**
   *  Constructs a newly allocated UserSizeAndBehaviour.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the subarray of bytes.
   *  @param value the array containing the value to be represented by this UserSizeAndBehaviour.
   *  @param bitOffset  the index of the first bit to be represented by this UserSizeAndBehaviour.
   *  @param bitCount the number of used bits to be represented by this UserSizeAndBehaviour.
   *  @throws IllegalArgumentException if the bitCount and bitOffset are not consistent with the length of the value.
   */
  public UserSizeAndBehaviour (byte[] value, int bitOffset, int bitCount)
  {
    super(value, bitOffset, bitCount);
  }
}