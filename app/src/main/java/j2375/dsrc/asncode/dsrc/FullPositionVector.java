/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/FullPositionVector.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the FullPositionVector type of the dsrc module.
 */
public class FullPositionVector extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 73;

  /**
   * optional field utcTime.
   */
  public j2375.dsrc.asncode.dsrc.DDateTime utcTime;

  /**
   * <BR> time with mSec precision
   * mandatory field a__long.
   */
  public j2375.dsrc.asncode.dsrc.Longitude a__long;

  /**
   * <BR> 1/10th microdegree
   * mandatory field lat.
   */
  public j2375.dsrc.asncode.dsrc.Latitude lat;

  /**
   * <BR> 1/10th microdegree
   * optional field elevation.
   */
  public j2375.dsrc.asncode.dsrc.Elevation elevation;

  /**
   * <BR> units of 01 m
   * optional field heading.
   */
  public j2375.dsrc.asncode.dsrc.Heading heading;

  /**
   * optional field speed.
   */
  public j2375.dsrc.asncode.dsrc.TransmissionAndSpeed speed;

  /**
   * optional field posAccuracy.
   */
  public j2375.dsrc.asncode.dsrc.PositionalAccuracy posAccuracy;

  /**
   * optional field timeConfidence.
   */
  public j2375.dsrc.asncode.dsrc.TimeConfidence timeConfidence;

  /**
   * optional field posConfidence.
   */
  public j2375.dsrc.asncode.dsrc.PositionConfidenceSet posConfidence;

  /**
   * optional field speedConfidence.
   */
  public j2375.dsrc.asncode.dsrc.SpeedandHeadingandThrottleConfidence speedConfidence;

  /**
   *  Constructs a newly allocated FullPositionVector.
   */
  public FullPositionVector ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this FullPositionVector.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type identifier of the component.
   *  @return the value identified by the named type.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnGetSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return this.utcTime;
     case 1 :
       return this.a__long;
     case 2 :
       return this.lat;
     case 3 :
       return this.elevation;
     case 4 :
       return this.heading;
     case 5 :
       return this.speed;
     case 6 :
       return this.posAccuracy;
     case 7 :
       return this.timeConfidence;
     case 8 :
       return this.posConfidence;
     case 9 :
       return this.speedConfidence;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this FullPositionVector.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this FullPositionVector.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.DDateTime();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.Longitude();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.Latitude();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.Elevation();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.Heading();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.TransmissionAndSpeed();
     case 6 :
       return new j2375.dsrc.asncode.dsrc.PositionalAccuracy();
     case 7 :
       return new j2375.dsrc.asncode.dsrc.TimeConfidence();
     case 8 :
       return new j2375.dsrc.asncode.dsrc.PositionConfidenceSet();
     case 9 :
       return new j2375.dsrc.asncode.dsrc.SpeedandHeadingandThrottleConfidence();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this FullPositionVector.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this FullPositionVector.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.utcTime = new j2375.dsrc.asncode.dsrc.DDateTime();
       return this.utcTime;
     case 1 :
       this.a__long = new j2375.dsrc.asncode.dsrc.Longitude();
       return this.a__long;
     case 2 :
       this.lat = new j2375.dsrc.asncode.dsrc.Latitude();
       return this.lat;
     case 3 :
       this.elevation = new j2375.dsrc.asncode.dsrc.Elevation();
       return this.elevation;
     case 4 :
       this.heading = new j2375.dsrc.asncode.dsrc.Heading();
       return this.heading;
     case 5 :
       this.speed = new j2375.dsrc.asncode.dsrc.TransmissionAndSpeed();
       return this.speed;
     case 6 :
       this.posAccuracy = new j2375.dsrc.asncode.dsrc.PositionalAccuracy();
       return this.posAccuracy;
     case 7 :
       this.timeConfidence = new j2375.dsrc.asncode.dsrc.TimeConfidence();
       return this.timeConfidence;
     case 8 :
       this.posConfidence = new j2375.dsrc.asncode.dsrc.PositionConfidenceSet();
       return this.posConfidence;
     case 9 :
       this.speedConfidence = new j2375.dsrc.asncode.dsrc.SpeedandHeadingandThrottleConfidence();
       return this.speedConfidence;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the FullPositionVector.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnGetSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Returns whether or not this group is present among the extensions.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @return <code>true</code>: when the group is present.
   *          <code>false</code>: when the group is not present.
   */
   public boolean asnIsSetSeqGroupPresent(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated group value of the FullPositionVector.
   *  This group is created for temporary use, in order to solve atNotations.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated group value of the FullPositionVector.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param group the extension group.
   *  @param field the named type of the extension group.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqGroupValue(fr.marben.asnsdk.japi.Context context,
                                fr.marben.asnsdk.japi.vi.ISetSeqExtensionGroup group,
                                fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (group.getFieldNumber(context))
     {
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to find the group " + group.getFieldNumber(context));
     }
   }

  /**
   *  Gets the typeIndex value for this class.
   *  This method is only for ASNSDK internal use. 
   *  @return the type index.
   */
  public int asnGetTypeIndex()
  {
    return 73;
  }

}