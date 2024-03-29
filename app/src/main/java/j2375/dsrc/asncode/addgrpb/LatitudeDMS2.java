/*
Copyright (C) 1999-2011 Marben Products. All rights reserved.

THIS FILE IS PROPRIETARY MATERIAL OF MARBEN PRODUCTS.
AND MAY BE USED ONLY BY DIRECT LICENSEES OF ASNSDK PRODUCT.
THIS FILE MAY NOT BE DISTRIBUTED.

===========================================================================

/home/itsrc/J2375_2016/src/asncode/addgrpb/LatitudeDMS2.java: 

Generated by ASNSDK TCE-JAVA ASN.1 Compiler v4.0 - REF_8.55 - REF_8.39

===========================================================================
*/
package j2375.dsrc.asncode.addgrpb;

/**
 * <BR> BCD coding of four digits of the year AD in 2 octets 
 * <BR> values with nibble values between 1010 and 1111 shall not be sent
 * <BR> except that the value 65535 (0xFFFF) shall indicate an invalid value
 * Class definition of the LatitudeDMS2 type of the addgrpb module.
 */
public class LatitudeDMS2 extends fr.marben.asnsdk.japi.spe.SequenceValue
{
  /**
   * value of the typeIndex field for this class.
   */
  public static final int ASNTYPE = 2;

  /**
   * mandatory field d.
   */
  public j2375.dsrc.asncode.addgrpb.DegreesLat d;

  /**
   * <BR> units of degrees
   * mandatory field m.
   */
  public j2375.dsrc.asncode.addgrpb.MinutesAngle m;

  /**
   * <BR> units of minutes
   * mandatory field s.
   */
  public j2375.dsrc.asncode.addgrpb.SecondsAngle s;

  /**
   *  Constructs a newly allocated LatitudeDMS2.
   */
  public LatitudeDMS2 ()
  {
    super();
  };

  /**
   *  Gets the value of a component from this LatitudeDMS2.
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
       return this.d;
     case 1 :
       return this.m;
     case 2 :
       return this.s;
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to set field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates a newly allocated component value from this LatitudeDMS2.
   *  this value is created for temporary use to solve atNotations
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this LatitudeDMS2.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewTmpSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       return new j2375.dsrc.asncode.addgrpb.DegreesLat();
     case 1 :
       return new j2375.dsrc.asncode.addgrpb.MinutesAngle();
     case 2 :
       return new j2375.dsrc.asncode.addgrpb.SecondsAngle();
     default :
       throw new fr.marben.asnsdk.japi.DysfunctionException("Unable to create field number " + field.getFieldNumber(context));
     }
   }

  /**
   *  Creates and sets a newly allocated component value from this LatitudeDMS2.
   *  This method is only for ASNSDK internal use.
   *  @param context a fr.marben.asnsdk.japi.Context.
   *  @param field the named type of this LatitudeDMS2.
   *  @return a value from a class implementing the IValue interface.
   */
   public fr.marben.asnsdk.japi.vi.IValue asnSetNewSetSeqValue(
                           fr.marben.asnsdk.japi.Context context,
                           fr.marben.asnsdk.japi.vi.ISetSeqNamedType field)
   {
     switch (field.getFieldNumber(context))
     {
     case 0 :
       this.d = new j2375.dsrc.asncode.addgrpb.DegreesLat();
       return this.d;
     case 1 :
       this.m = new j2375.dsrc.asncode.addgrpb.MinutesAngle();
       return this.m;
     case 2 :
       this.s = new j2375.dsrc.asncode.addgrpb.SecondsAngle();
       return this.s;
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
    return 2;
  }

}
