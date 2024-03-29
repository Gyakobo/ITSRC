/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/AnimalType.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the AnimalType type of the dsrc module.
 */
public class AnimalType extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated serviceUse.
   */
  public static final int ASN_serviceUse = 1;

  /**
   * value of the named enumerated pet.
   */
  public static final int ASN_pet = 2;

  /**
   * value of the named enumerated farm.
   */
  public static final int ASN_farm = 3;

  /**
   *  Constructs a newly allocated AnimalType.
   */
  public AnimalType ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated AnimalType that represents the primitive int argument.
   *  @param value the value to be represented by this AnimalType.
   */
  public AnimalType (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated AnimalType that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this AnimalType.
   */
  public AnimalType (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
