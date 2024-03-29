/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/GenericLane.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the GenericLane type of the dsrc module.
 */
public class GenericLane extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 78;

  /**
   * mandatory field laneID.
   */
  public j2375.dsrc.asncode.dsrc.LaneID laneID;

  /**
   * <BR> The unique ID number assigned 
   * <BR> to this lane object
   * optional field name.
   */
  public j2375.dsrc.asncode.dsrc.DescriptiveName name;

  /**
   * <BR> often for debug use only 
   * <BR> but at times used to name ped crossings
   * optional field ingressApproach.
   */
  public j2375.dsrc.asncode.dsrc.ApproachID ingressApproach;

  /**
   * <BR> inbound
   * optional field egressApproach.
   */
  public j2375.dsrc.asncode.dsrc.ApproachID egressApproach;

  /**
   * <BR> outbound
   * <BR> Approach IDs to which this lane belongs
   * mandatory field laneAttributes.
   */
  public j2375.dsrc.asncode.dsrc.LaneAttributes laneAttributes;

  /**
   * <BR> All Attribute information about 
   * <BR> the basic selected lane type
   * <BR> Directions of use, Geometric co-sharing
   * <BR> and Type Specific Attributes
   * <BR> These Attributes are 'lane - global' that is,
   * <BR> they are true for the entire length of the lane
   * optional field maneuvers.
   */
  public j2375.dsrc.asncode.dsrc.AllowedManeuvers maneuvers;

  /**
   * <BR> the permitted maneuvers for this lane
   * mandatory field nodeList.
   */
  public j2375.dsrc.asncode.dsrc.NodeListXY nodeList;

  /**
   * <BR> Lane spatial path information as well as
   * <BR> various Attribute information along the node path  
   * <BR> Attributes found here are more general and may
   * <BR> come and go over the length of the lane
   * optional field connectsTo.
   */
  public j2375.dsrc.asncode.dsrc.ConnectsToList connectsTo;

  /**
   * <BR> a list of other lanes and their signal group IDs
   * <BR> each connecting lane and its signal group ID
   * <BR> is given, therefore this element provides the
   * <BR> information formerly in "signalGroups" in prior
   * <BR> editions
   * optional field overlays.
   */
  public j2375.dsrc.asncode.dsrc.OverlayLaneList overlays;

  /**
   * <BR> A list of any lanes which have spatial paths that
   * <BR> overlay (run on top of, and not simply cross) 
   * <BR> the path of this lane when used
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
          j2375.dsrc.asncode.dsrc.GenericLane.Regional.SEQUENCE value = new j2375.dsrc.asncode.dsrc.GenericLane.Regional.SEQUENCE();
          this.valueList.add(value);
          return value;
    }
  }

  /**
   *  Constructs a newly allocated GenericLane.
   */
  public GenericLane ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this GenericLane.
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
       return this.laneID;
     case 1 :
       return this.name;
     case 2 :
       return this.ingressApproach;
     case 3 :
       return this.egressApproach;
     case 4 :
       return this.laneAttributes;
     case 5 :
       return this.maneuvers;
     case 6 :
       return this.nodeList;
     case 7 :
       return this.connectsTo;
     case 8 :
       return this.overlays;
     case 9 :
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this GenericLane.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this GenericLane.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.LaneID();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.DescriptiveName();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.ApproachID();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.ApproachID();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.LaneAttributes();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.AllowedManeuvers();
     case 6 :
       return new j2375.dsrc.asncode.dsrc.NodeListXY();
     case 7 :
       return new j2375.dsrc.asncode.dsrc.ConnectsToList();
     case 8 :
       return new j2375.dsrc.asncode.dsrc.OverlayLaneList();
     case 9 :
       return new Regional();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this GenericLane.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this GenericLane.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.laneID = new j2375.dsrc.asncode.dsrc.LaneID();
       return this.laneID;
     case 1 :
       this.name = new j2375.dsrc.asncode.dsrc.DescriptiveName();
       return this.name;
     case 2 :
       this.ingressApproach = new j2375.dsrc.asncode.dsrc.ApproachID();
       return this.ingressApproach;
     case 3 :
       this.egressApproach = new j2375.dsrc.asncode.dsrc.ApproachID();
       return this.egressApproach;
     case 4 :
       this.laneAttributes = new j2375.dsrc.asncode.dsrc.LaneAttributes();
       return this.laneAttributes;
     case 5 :
       this.maneuvers = new j2375.dsrc.asncode.dsrc.AllowedManeuvers();
       return this.maneuvers;
     case 6 :
       this.nodeList = new j2375.dsrc.asncode.dsrc.NodeListXY();
       return this.nodeList;
     case 7 :
       this.connectsTo = new j2375.dsrc.asncode.dsrc.ConnectsToList();
       return this.connectsTo;
     case 8 :
       this.overlays = new j2375.dsrc.asncode.dsrc.OverlayLaneList();
       return this.overlays;
     case 9 :
       this.regional = new Regional();
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the GenericLane.
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
   *  Creates a newly allocated group value of the GenericLane.
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
   *  Creates and sets a newly allocated group value of the GenericLane.
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
    return 78;
  }

}
