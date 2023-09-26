/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/TrailerUnitDescription.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the TrailerUnitDescription type of the dsrc module.
 */
public class TrailerUnitDescription extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 193;

  /**
   * mandatory field isDolly.
   */
  public j2375.dsrc.asncode.dsrc.IsDolly isDolly;

  /**
   * <BR> if false this is a trailer
   * mandatory field width.
   */
  public j2375.dsrc.asncode.dsrc.VehicleWidth width;

  /**
   * mandatory field length.
   */
  public j2375.dsrc.asncode.dsrc.VehicleLength length;

  /**
   * optional field height.
   */
  public j2375.dsrc.asncode.dsrc.VehicleHeight height;

  /**
   * optional field mass.
   */
  public j2375.dsrc.asncode.dsrc.TrailerMass mass;

  /**
   * optional field bumperHeights.
   */
  public j2375.dsrc.asncode.dsrc.BumperHeights bumperHeights;

  /**
   * optional field centerOfGravity.
   */
  public j2375.dsrc.asncode.dsrc.VehicleHeight centerOfGravity;

  /**
   * <BR> The front pivot point of the unit
   * mandatory field frontPivot.
   */
  public j2375.dsrc.asncode.dsrc.PivotPointDescription frontPivot;

  /**
   * <BR> The rear pivot point connecting to the next element, 
   * <BR> if present and used (implies another unit is connected)
   * optional field rearPivot.
   */
  public j2375.dsrc.asncode.dsrc.PivotPointDescription rearPivot;

  /**
   * <BR> Rear wheel pivot point center-line offset
   * <BR> measured from the rear of the above length
   * optional field rearWheelOffset.
   */
  public j2375.dsrc.asncode.dsrc.Offset_B12 rearWheelOffset;

  /**
   * <BR> the effective center-line of the wheel set
   * <BR> Current Position relative to the hauling Vehicle
   * mandatory field positionOffset.
   */
  public j2375.dsrc.asncode.dsrc.Node_XY_24b positionOffset;

  /**
   * optional field elevationOffset.
   */
  public j2375.dsrc.asncode.dsrc.VertOffset_B07 elevationOffset;

  /**
   * <BR> Past Position history relative to the hauling Vehicle
   * optional field crumbData.
   */
  public j2375.dsrc.asncode.dsrc.TrailerHistoryPointList crumbData;

  /**
   *  Constructs a newly allocated TrailerUnitDescription.
   */
  public TrailerUnitDescription ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this TrailerUnitDescription.
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
       return this.isDolly;
     case 1 :
       return this.width;
     case 2 :
       return this.length;
     case 3 :
       return this.height;
     case 4 :
       return this.mass;
     case 5 :
       return this.bumperHeights;
     case 6 :
       return this.centerOfGravity;
     case 7 :
       return this.frontPivot;
     case 8 :
       return this.rearPivot;
     case 9 :
       return this.rearWheelOffset;
     case 10 :
       return this.positionOffset;
     case 11 :
       return this.elevationOffset;
     case 12 :
       return this.crumbData;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this TrailerUnitDescription.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this TrailerUnitDescription.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.IsDolly();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.VehicleWidth();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.VehicleLength();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.VehicleHeight();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.TrailerMass();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.BumperHeights();
     case 6 :
       return new j2375.dsrc.asncode.dsrc.VehicleHeight();
     case 7 :
       return new j2375.dsrc.asncode.dsrc.PivotPointDescription();
     case 8 :
       return new j2375.dsrc.asncode.dsrc.PivotPointDescription();
     case 9 :
       return new j2375.dsrc.asncode.dsrc.Offset_B12();
     case 10 :
       return new j2375.dsrc.asncode.dsrc.Node_XY_24b();
     case 11 :
       return new j2375.dsrc.asncode.dsrc.VertOffset_B07();
     case 12 :
       return new j2375.dsrc.asncode.dsrc.TrailerHistoryPointList();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this TrailerUnitDescription.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this TrailerUnitDescription.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.isDolly = new j2375.dsrc.asncode.dsrc.IsDolly();
       return this.isDolly;
     case 1 :
       this.width = new j2375.dsrc.asncode.dsrc.VehicleWidth();
       return this.width;
     case 2 :
       this.length = new j2375.dsrc.asncode.dsrc.VehicleLength();
       return this.length;
     case 3 :
       this.height = new j2375.dsrc.asncode.dsrc.VehicleHeight();
       return this.height;
     case 4 :
       this.mass = new j2375.dsrc.asncode.dsrc.TrailerMass();
       return this.mass;
     case 5 :
       this.bumperHeights = new j2375.dsrc.asncode.dsrc.BumperHeights();
       return this.bumperHeights;
     case 6 :
       this.centerOfGravity = new j2375.dsrc.asncode.dsrc.VehicleHeight();
       return this.centerOfGravity;
     case 7 :
       this.frontPivot = new j2375.dsrc.asncode.dsrc.PivotPointDescription();
       return this.frontPivot;
     case 8 :
       this.rearPivot = new j2375.dsrc.asncode.dsrc.PivotPointDescription();
       return this.rearPivot;
     case 9 :
       this.rearWheelOffset = new j2375.dsrc.asncode.dsrc.Offset_B12();
       return this.rearWheelOffset;
     case 10 :
       this.positionOffset = new j2375.dsrc.asncode.dsrc.Node_XY_24b();
       return this.positionOffset;
     case 11 :
       this.elevationOffset = new j2375.dsrc.asncode.dsrc.VertOffset_B07();
       return this.elevationOffset;
     case 12 :
       this.crumbData = new j2375.dsrc.asncode.dsrc.TrailerHistoryPointList();
       return this.crumbData;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the TrailerUnitDescription.
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
   *  Creates a newly allocated group value of the TrailerUnitDescription.
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
   *  Creates and sets a newly allocated group value of the TrailerUnitDescription.
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
    return 193;
  }

}