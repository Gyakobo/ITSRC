/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/PublicSafetyAndRoadWorkerActivity.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> value determined by local device 
 * <BR> as per standard
 * Class definition of the PublicSafetyAndRoadWorkerActivity type of the dsrc module.
 */
public class PublicSafetyAndRoadWorkerActivity extends fr.marben.asnsdk.japi.spe.BitStringValue
{
  /**
   * value of the named bit unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named bit workingOnRoad.
   */
  public static final int ASN_workingOnRoad = 1;

  /**
   * value of the named bit settingUpClosures.
   */
  public static final int ASN_settingUpClosures = 2;

  /**
   * value of the named bit respondingToEvents.
   */
  public static final int ASN_respondingToEvents = 3;

  /**
   * value of the named bit directingTraffic.
   */
  public static final int ASN_directingTraffic = 4;

  /**
   * value of the named bit otherActivities.
   */
  public static final int ASN_otherActivities = 5;

  /**
   *  Constructs a newly allocated PublicSafetyAndRoadWorkerActivity.
   */
  public PublicSafetyAndRoadWorkerActivity ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated PublicSafetyAndRoadWorkerActivity.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the bytes array parameter.
   *  @param value the value to be represented by this PublicSafetyAndRoadWorkerActivity.
   *  @param bitCount the number of used bits to be represented by this PublicSafetyAndRoadWorkerActivity.
   *  @throws IllegalArgumentException if the bitCount is not consistent with the length of the value.
   */
  public PublicSafetyAndRoadWorkerActivity (byte[] value, int bitCount)
  {
    super(value, bitCount);
  }

  /**
   *  Constructs a newly allocated PublicSafetyAndRoadWorkerActivity.
   *  Sets the number of used bits using the int parameter
   *  and sets the internal value using the subarray of bytes.
   *  @param value the array containing the value to be represented by this PublicSafetyAndRoadWorkerActivity.
   *  @param bitOffset  the index of the first bit to be represented by this PublicSafetyAndRoadWorkerActivity.
   *  @param bitCount the number of used bits to be represented by this PublicSafetyAndRoadWorkerActivity.
   *  @throws IllegalArgumentException if the bitCount and bitOffset are not consistent with the length of the value.
   */
  public PublicSafetyAndRoadWorkerActivity (byte[] value, int bitOffset, int bitCount)
  {
    super(value, bitOffset, bitCount);
  }
}