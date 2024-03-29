/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/SnapshotTime.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * <BR> a sequence of data frames
 * <BR> which encodes the data
 * Class definition of the SnapshotTime type of the dsrc module.
 */
public class SnapshotTime extends fr.marben.asnsdk.japi.spe.SequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 158;

  /**
   * mandatory field speed1.
   */
  public j2375.dsrc.asncode.dsrc.GrossSpeed speed1;

  /**
   * <BR> meters/sec - the instantaneous speed  
   * <BR> when the calculation is performed
   * mandatory field time1.
   */
  public j2375.dsrc.asncode.dsrc.SecondOfTime time1;

  /**
   * <BR> in seconds
   * mandatory field speed2.
   */
  public j2375.dsrc.asncode.dsrc.GrossSpeed speed2;

  /**
   * <BR> meters/sec - the instantaneous speed 
   * <BR> when the calculation is performed
   * mandatory field time2.
   */
  public j2375.dsrc.asncode.dsrc.SecondOfTime time2;

  /**
   *  Constructs a newly allocated SnapshotTime.
   */
  public SnapshotTime ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this SnapshotTime.
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
       return this.speed1;
     case 1 :
       return this.time1;
     case 2 :
       return this.speed2;
     case 3 :
       return this.time2;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this SnapshotTime.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this SnapshotTime.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.GrossSpeed();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.SecondOfTime();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.GrossSpeed();
     case 3 :
       return new j2375.dsrc.asncode.dsrc.SecondOfTime();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this SnapshotTime.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this SnapshotTime.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.speed1 = new j2375.dsrc.asncode.dsrc.GrossSpeed();
       return this.speed1;
     case 1 :
       this.time1 = new j2375.dsrc.asncode.dsrc.SecondOfTime();
       return this.time1;
     case 2 :
       this.speed2 = new j2375.dsrc.asncode.dsrc.GrossSpeed();
       return this.speed2;
     case 3 :
       this.time2 = new j2375.dsrc.asncode.dsrc.SecondOfTime();
       return this.time2;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Gets the typeIndex value for this class.
   *  This method is only for ASNSDK internal use. 
   *  @return the type index.
   */
  public int asnGetTypeIndex()
  {
    return 158;
  }

}
