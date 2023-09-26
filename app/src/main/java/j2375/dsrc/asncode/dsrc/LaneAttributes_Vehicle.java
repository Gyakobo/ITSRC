/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/LaneAttributes_Vehicle.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the LaneAttributes_Vehicle type of the dsrc module.
 */
public class LaneAttributes_Vehicle extends fr.marben.asnsdk.japi.spe.BitStringValue
{
  /**
   * value of the named bit isVehicleRevocableLane.
   */
  public static final int ASN_isVehicleRevocableLane = 0;

  /**
   * value of the named bit isVehicleFlyOverLane.
   */
  public static final int ASN_isVehicleFlyOverLane = 1;

  /**
   * value of the named bit hovLaneUseOnly.
   */
  public static final int ASN_hovLaneUseOnly = 2;

  /**
   * value of the named bit restrictedToBusUse.
   */
  public static final int ASN_restrictedToBusUse = 3;

  /**
   * value of the named bit restrictedToTaxiUse.
   */
  public static final int ASN_restrictedToTaxiUse = 4;

  /**
   * value of the named bit restrictedFromPublicUse.
   */
  public static final int ASN_restrictedFromPublicUse = 5;

  /**
   * value of the named bit hasIRbeaconCoverage.
   */
  public static final int ASN_hasIRbeaconCoverage = 6;

  /**
   * value of the named bit permissionOnRequest.
   */
  public static final int ASN_permissionOnRequest = 7;

  /**
   *  Constructs a newly allocated LaneAttributes_Vehicle.
   */
  public LaneAttributes_Vehicle ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated LaneAttributes_Vehicle.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the bytes array parameter.
   *  @param value the value to be represented by this LaneAttributes_Vehicle.
   *  @param bitCount the number of used bits to be represented by this LaneAttributes_Vehicle.
   *  @throws IllegalArgumentException if the bitCount is not consistent with the length of the value.
   */
  public LaneAttributes_Vehicle (byte[] value, int bitCount)
  {
    super(value, bitCount);
  }

  /**
   *  Constructs a newly allocated LaneAttributes_Vehicle.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the subarray of bytes.
   *  @param value the array containing the value to be represented by this LaneAttributes_Vehicle.
   *  @param bitOffset  the index of the first bit to be represented by this LaneAttributes_Vehicle.
   *  @param bitCount the number of used bits to be represented by this LaneAttributes_Vehicle.
   *  @throws IllegalArgumentException if the bitCount and bitOffset are not consistent with the length of the value.
   */
  public LaneAttributes_Vehicle (byte[] value, int bitOffset, int bitCount)
  {
    super(value, bitOffset, bitCount);
  }
}