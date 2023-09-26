/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/dsrc/PositionalAccuracy.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.dsrc;

/**
 * Class definition of the PositionalAccuracy type of the dsrc module.
 */
public class PositionalAccuracy extends fr.marben.asnsdk.japi.spe.SequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 40;

  /**
   * <BR> NMEA-183 values expressed in strict ASN form
   * mandatory field semiMajor.
   */
  public j2375.dsrc.asncode.dsrc.SemiMajorAxisAccuracy semiMajor;

  /**
   * mandatory field semiMinor.
   */
  public j2375.dsrc.asncode.dsrc.SemiMinorAxisAccuracy semiMinor;

  /**
   * mandatory field orientation.
   */
  public j2375.dsrc.asncode.dsrc.SemiMajorAxisOrientation orientation;

  /**
   *  Constructs a newly allocated PositionalAccuracy.
   */
  public PositionalAccuracy ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this PositionalAccuracy.
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
       return this.semiMajor;
     case 1 :
       return this.semiMinor;
     case 2 :
       return this.orientation;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this PositionalAccuracy.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this PositionalAccuracy.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.dsrc.SemiMajorAxisAccuracy();
     case 1 :
       return new j2375.dsrc.asncode.dsrc.SemiMinorAxisAccuracy();
     case 2 :
       return new j2375.dsrc.asncode.dsrc.SemiMajorAxisOrientation();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this PositionalAccuracy.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this PositionalAccuracy.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.semiMajor = new j2375.dsrc.asncode.dsrc.SemiMajorAxisAccuracy();
       return this.semiMajor;
     case 1 :
       this.semiMinor = new j2375.dsrc.asncode.dsrc.SemiMinorAxisAccuracy();
       return this.semiMinor;
     case 2 :
       this.orientation = new j2375.dsrc.asncode.dsrc.SemiMajorAxisOrientation();
       return this.orientation;
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
    return 40;
  }

}