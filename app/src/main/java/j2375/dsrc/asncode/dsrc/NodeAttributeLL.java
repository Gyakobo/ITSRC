/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/NodeAttributeLL.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the NodeAttributeLL type of the dsrc module.
 */
public class NodeAttributeLL extends fr.marben.asnsdk.japi.spe.ExtEnumeratedValue
{
  /**
   * value of the named enumerated reserved.
   */
  public static final int ASN_reserved = 0;

  /**
   * value of the named enumerated stopLine.
   */
  public static final int ASN_stopLine = 1;

  /**
   * value of the named enumerated roundedCapStyleA.
   */
  public static final int ASN_roundedCapStyleA = 2;

  /**
   * value of the named enumerated roundedCapStyleB.
   */
  public static final int ASN_roundedCapStyleB = 3;

  /**
   * value of the named enumerated mergePoint.
   */
  public static final int ASN_mergePoint = 4;

  /**
   * value of the named enumerated divergePoint.
   */
  public static final int ASN_divergePoint = 5;

  /**
   * value of the named enumerated downstreamStopLine.
   */
  public static final int ASN_downstreamStopLine = 6;

  /**
   * value of the named enumerated downstreamStartNode.
   */
  public static final int ASN_downstreamStartNode = 7;

  /**
   * value of the named enumerated closedToTraffic.
   */
  public static final int ASN_closedToTraffic = 8;

  /**
   * value of the named enumerated safeIsland.
   */
  public static final int ASN_safeIsland = 9;

  /**
   * value of the named enumerated curbPresentAtStepOff.
   */
  public static final int ASN_curbPresentAtStepOff = 10;

  /**
   * value of the named enumerated hydrantPresent.
   */
  public static final int ASN_hydrantPresent = 11;

  /**
   *  Constructs a newly allocated NodeAttributeLL.
   */
  public NodeAttributeLL ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated NodeAttributeLL that represents the primitive int argument.
   *  @param value the value to be represented by this NodeAttributeLL.
   */
  public NodeAttributeLL (int value)
  {
    super(value);
  };

  /**
   *  Constructs a newly allocated NodeAttributeLL that represents the unknownExt argument.
   *  @param unknownExt the unknown extension value to be represented by this NodeAttributeLL.
   */
  public NodeAttributeLL (fr.marben.asnsdk.japi.UnknownExtensionValue unknownExt)
  {
    super(unknownExt);
  };
}
