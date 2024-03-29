/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/RoadSegment.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> a unique mapping to the road segment
 * <BR> in question within the above region of use
 * <BR> during its period of assignment and use
 * <BR> note that unlike intersectionID values, 
 * <BR> this value can be reused by the region
 * Class definition of the RoadSegment type of the dsrc module.
 */
public class RoadSegment extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 142;

  /**
   * optional field name.
   */
  public j2375.dsrc.asncode.dsrc.DescriptiveName name;

  /**
   * mandatory field id.
   */
  public j2375.dsrc.asncode.dsrc.RoadSegmentReferenceID id;

  /**
   * <BR> a globally unique value for the segment
   * mandatory field revision.
   */
  public j2375.dsrc.asncode.dsrc.MsgCount revision;

  /**
   * <BR> Required default values about the descriptions to follow
   * mandatory field refPoint.
   */
  public j2375.dsrc.asncode.dsrc.Position3D refPoint;

  /**
   * <BR> the reference from which subsequent
   * <BR> data points are offset until a new
   * <BR> point is used
   * optional field laneWidth.
   */
  public j2375.dsrc.asncode.dsrc.LaneWidth laneWidth;

  /**
   * <BR> Reference width used by all subsequent 
   * <BR> lanes unless a new width is given  
   * optional field speedLimits.
   */
  public j2375.dsrc.asncode.dsrc.SpeedLimitList speedLimits;

  /**
   * <BR> Reference regulatory speed limits
   * <BR> used by all subsequent 
   * <BR> lanes unless a new speed is given   
   * <BR> See Section 11 for converting and  
   * <BR> translating speed expressed in mph 
   * <BR> into units of m/s
   * <BR> Data describing disruptions in the RoadSegment
   * <BR> such as work zones etc will be added here;
   * <BR> in the US the SAE ITIS codes would be used here
   * <BR> The details regarding each lane type in the RoadSegment
   * mandatory field roadLaneSet.
   */
  public j2375.dsrc.asncode.dsrc.RoadLaneSetList roadLaneSet;

  /**
   * optional field regional.
   */
  public Regional regional;

  /**
   * class definition of the regional field.
   */
  public static class Regional extends fr.marben.asnsdk.japi.spe.SequenceOfValue
  {
    /**
     * class definition of the SEQUENCE field.
     */
    public static class SEQUENCE extends fr.marben.asnsdk.japi.spe.SequenceValue
    {
      /**
       * mandatory field regionId.
       */
      public j2375.dsrc.asncode.dsrc.RegionId regionId;

      /**
       * mandatory field regExtValue.
       */
      public fr.marben.asnsdk.japi.spe.OpenTypeValue regExtValue;

      /**
       *  Constructs a newly allocated SEQUENCE.
       */
      public SEQUENCE ()
      {
        super();
      };

      /**
       *  Gets the value of a component from this SEQUENCE.
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
           return this.regionId;
         case 1 :
           return this.regExtValue;
         default :
           throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
         }
       }

      /**
       *  Creates a newly allocated component value from this SEQUENCE.
       *  this value is created for temporary use to solve atNotations
       *  This method is only for ASNSDK internal use.
       *  @param context a fr.marben.asnsdk.japi.Context.
       *  @param field the named type of this SEQUENCE.
       *  @return a value from a class implementing the IValue interface.
       */
       public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                               fr.marben.asnsdk.japi.Context context,
                               fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
       {
         switch (field.getFieldNumber(context))
         {
         case 0 :
           return new j2375.dsrc.asncode.dsrc.RegionId();
         case 1 :
           return new fr.marben.asnsdk.japi.spe.OpenTypeValue();
         default :
           throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
         }
       }

      /**
       *  Creates and sets a newly allocated component value from this SEQUENCE.
       *  This method is only for ASNSDK internal use.
       *  @param context a fr.marben.asnsdk.japi.Context.
       *  @param field the named type of this SEQUENCE.
       *  @return a value from a class implementing the IValue interface.
       */
       public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                               fr.marben.asnsdk.japi.Context context,
                               fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
       {
         switch (field.getFieldNumber(context))
         {
         case 0 :
           this.regionId = new j2375.dsrc.asncode.dsrc.RegionId();
           return this.regionId;
         case 1 :
           this.regExtValue = new fr.marben.asnsdk.japi.spe.OpenTypeValue();
           return this.regExtValue;
         default :
           throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
         }
       }

    }

    /**
     *  Constructs a newly allocated Regional.
     */
    public Regional ()
    {
      super();
    };

    /**
     *  Constructs a newly allocated Regional with the given list.
     *  @param list the list used to initialize this Regional.
     */
    public Regional (java.util.List list)
    {
      super(list);
    };
    
    /**
     *  Creates and appends a newly allocated component value from 
     *  this Regional.
     *  This method is only for ASNSDK internal use. 
     *  @param context a fr.marben.asnsdk.japi.Context.
     *  @param field the named type of this Regional.
     *  @return a value from a class implementing de IValue interface.
     */
    public fr.marben.asnsdk.japi.vi.IValue asnAddNewSetSeqOfValue(
                          fr.marben.asnsdk.japi.Context context,
                          fr.marben.asnsdk.japi.vi.ISetSeqOfNamedType field)
    {
          j2375.dsrc.asncode.dsrc.RoadSegment.Regional.SEQUENCE value = new j2375.dsrc.asncode.dsrc.RoadSegment.Regional.SEQUENCE();
          this.valueList.add(value);
          return value;
    }
  }

  /**
   *  Constructs a newly allocated RoadSegment.
   */
  public RoadSegment ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this RoadSegment.
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
       return this.name;
     case 1 :
       return this.id;
     case 2 :
       return this.revision;
     case 3 :
       return this.refPoint;
     case 4 :
       return this.laneWidth;
     case 5 :
       return this.speedLimits;
     case 6 :
       return this.roadLaneSet;
     case 7 :
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this RoadSegment.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this RoadSegment.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.DescriptiveName();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.RoadSegmentReferenceID();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.MsgCount();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.Position3D();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.LaneWidth();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.SpeedLimitList();
     case 6 :
       return new j2375.dsrc.asncode.dsrc.RoadLaneSetList();
     case 7 :
       return new Regional();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this RoadSegment.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this RoadSegment.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.name = new j2375.dsrc.asncode.dsrc.DescriptiveName();
       return this.name;
     case 1 :
       this.id = new j2375.dsrc.asncode.dsrc.RoadSegmentReferenceID();
       return this.id;
     case 2 :
       this.revision = new j2375.dsrc.asncode.dsrc.MsgCount();
       return this.revision;
     case 3 :
       this.refPoint = new j2375.dsrc.asncode.dsrc.Position3D();
       return this.refPoint;
     case 4 :
       this.laneWidth = new j2375.dsrc.asncode.dsrc.LaneWidth();
       return this.laneWidth;
     case 5 :
       this.speedLimits = new j2375.dsrc.asncode.dsrc.SpeedLimitList();
       return this.speedLimits;
     case 6 :
       this.roadLaneSet = new j2375.dsrc.asncode.dsrc.RoadLaneSetList();
       return this.roadLaneSet;
     case 7 :
       this.regional = new Regional();
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the RoadSegment.
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
   *  Creates a newly allocated group value of the RoadSegment.
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
   *  Creates and sets a newly allocated group value of the RoadSegment.
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
    return 142;
  }

}
