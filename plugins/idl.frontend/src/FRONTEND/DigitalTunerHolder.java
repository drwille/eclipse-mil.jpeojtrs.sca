package FRONTEND;

/**
* FRONTEND/DigitalTunerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /data/Workspaces/dev_1-10_workspace/mil.jpeojtrs.sca/plugins/idl.frontend/idl/redhawk/FRONTEND/TunerControl.idl
* Wednesday, December 18, 2013 5:32:24 PM EST
*/

public final class DigitalTunerHolder implements org.omg.CORBA.portable.Streamable
{
  public FRONTEND.DigitalTuner value = null;

  public DigitalTunerHolder ()
  {
  }

  public DigitalTunerHolder (FRONTEND.DigitalTuner initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = FRONTEND.DigitalTunerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    FRONTEND.DigitalTunerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return FRONTEND.DigitalTunerHelper.type ();
  }

}