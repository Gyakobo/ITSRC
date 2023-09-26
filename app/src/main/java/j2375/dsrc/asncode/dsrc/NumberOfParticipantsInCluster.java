/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/NumberOfParticipantsInCluster.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the NumberOfParticipantsInCluster type of the dsrc module.
 */
public class NumberOfParticipantsInCluster extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated small.
   */
  public static final int ASN_small = 1;

  /**
   * value of the named enumerated medium.
   */
  public static final int ASN_medium = 2;

  /**
   * value of the named enumerated large.
   */
  public static final int ASN_large = 3;

  /**
   *  Constructs a newly allocated NumberOfParticipantsInCluster.
   */
  public NumberOfParticipantsInCluster ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated NumberOfParticipantsInCluster that represents the primitive int argument.
   *  @param value the value to be represented by this NumberOfParticipantsInCluster.
   */
  public NumberOfParticipantsInCluster (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated NumberOfParticipantsInCluster that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this NumberOfParticipantsInCluster.
   */
  public NumberOfParticipantsInCluster (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
