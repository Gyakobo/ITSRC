/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/MovementPhaseState.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the MovementPhaseState type of the dsrc module.
 */
public class MovementPhaseState extends fr.marben.asnsdk.japi.spe.EnumeratedValue
{
  /**
   * value of the named enumerated unavailable.
   */
  public static final int ASN_unavailable = 0;

  /**
   * value of the named enumerated dark.
   */
  public static final int ASN_dark = 1;

  /**
   * value of the named enumerated stop_Then_Proceed.
   */
  public static final int ASN_stop_Then_Proceed = 2;

  /**
   * value of the named enumerated stop_And_Remain.
   */
  public static final int ASN_stop_And_Remain = 3;

  /**
   * value of the named enumerated pre_Movement.
   */
  public static final int ASN_pre_Movement = 4;

  /**
   * value of the named enumerated permissive_Movement_Allowed.
   */
  public static final int ASN_permissive_Movement_Allowed = 5;

  /**
   * value of the named enumerated protected_Movement_Allowed.
   */
  public static final int ASN_protected_Movement_Allowed = 6;

  /**
   * value of the named enumerated permissive_clearance.
   */
  public static final int ASN_permissive_clearance = 7;

  /**
   * value of the named enumerated protected_clearance.
   */
  public static final int ASN_protected_clearance = 8;

  /**
   * value of the named enumerated caution_Conflicting_Traffic.
   */
  public static final int ASN_caution_Conflicting_Traffic = 9;

  /**
   *  Constructs a newly allocated MovementPhaseState.
   */
  public MovementPhaseState ()
  {
    super();
  };

  /**
   *  Constructs a newly allocated MovementPhaseState that represents the primitive int argument.
   *  @param value the value to be represented by this MovementPhaseState.
   */
  public MovementPhaseState (int value)
  {
    super(value);
  };
}
