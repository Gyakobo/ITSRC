/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/SignalStatusPackage.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the SignalStatusPackage type of the dsrc module.
 */
public class SignalStatusPackage extends fr.marben.asnsdk.japi.spe.ExtSequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 187;

  /**
   * <BR> The party that made the initial SRM request
   * optional field requester.
   */
  public j2375.dsrc.asncode.dsrc.SignalRequesterInfo requester;

  /**
   * <BR> The lanes or approaches used in the request
   * mandatory field inboundOn.
   */
  public j2375.dsrc.asncode.dsrc.IntersectionAccessPoint inboundOn;

  /**
   * <BR> estimated lane / approach of vehicle
   * optional field outboundOn.
   */
  public j2375.dsrc.asncode.dsrc.IntersectionAccessPoint outboundOn;

  /**
   * <BR> The Estimated Time of Arrival (ETA) when the service is requested
   * <BR> This data echos the data of the request 
   * optional field minute.
   */
  public j2375.dsrc.asncode.dsrc.MinuteOfTheYear minute;

  /**
   * optional field second.
   */
  public j2375.dsrc.asncode.dsrc.DSecond second;

  /**
   * optional field duration.
   */
  public j2375.dsrc.asncode.dsrc.DSecond duration;

  /**
   * <BR> the SRM status for this request
   * mandatory field status.
   */
  public j2375.dsrc.asncode.dsrc.PrioritizationResponseStatus status;

  /**
   * <BR> Status of request, this may include rejection
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
          j2375.dsrc.asncode.dsrc.SignalStatusPackage.Regional.SEQUENCE value = new j2375.dsrc.asncode.dsrc.SignalStatusPackage.Regional.SEQUENCE();
          this.valueList.add(value);
          return value;
    }
  }

  /**
   *  Constructs a newly allocated SignalStatusPackage.
   */
  public SignalStatusPackage ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this SignalStatusPackage.
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
       return this.requester;
     case 1 :
       return this.inboundOn;
     case 2 :
       return this.outboundOn;
     case 3 :
       return this.minute;
     case 4 :
       return this.second;
     case 5 :
       return this.duration;
     case 6 :
       return this.status;
     case 7 :
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this SignalStatusPackage.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this SignalStatusPackage.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.SignalRequesterInfo();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.IntersectionAccessPoint();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.IntersectionAccessPoint();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.MinuteOfTheYear();
     case 4 :
       return new j2375.dsrc.asncode.dsrc.DSecond();
     case 5 :
       return new j2375.dsrc.asncode.dsrc.DSecond();
     case 6 :
       return new j2375.dsrc.asncode.dsrc.PrioritizationResponseStatus();
     case 7 :
       return new Regional();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this SignalStatusPackage.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this SignalStatusPackage.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.requester = new j2375.dsrc.asncode.dsrc.SignalRequesterInfo();
       return this.requester;
     case 1 :
       this.inboundOn = new j2375.dsrc.asncode.dsrc.IntersectionAccessPoint();
       return this.inboundOn;
     case 2 :
       this.outboundOn = new j2375.dsrc.asncode.dsrc.IntersectionAccessPoint();
       return this.outboundOn;
     case 3 :
       this.minute = new j2375.dsrc.asncode.dsrc.MinuteOfTheYear();
       return this.minute;
     case 4 :
       this.second = new j2375.dsrc.asncode.dsrc.DSecond();
       return this.second;
     case 5 :
       this.duration = new j2375.dsrc.asncode.dsrc.DSecond();
       return this.duration;
     case 6 :
       this.status = new j2375.dsrc.asncode.dsrc.PrioritizationResponseStatus();
       return this.status;
     case 7 :
       this.regional = new Regional();
       return this.regional;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets a group value from the SignalStatusPackage.
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
   *  Creates a newly allocated group value of the SignalStatusPackage.
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
   *  Creates and sets a newly allocated group value of the SignalStatusPackage.
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
    return 187;
  }

}
