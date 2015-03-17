/** Modelo Generado - NO CAMBIAR MANUALMENTE - Copyright (C) 2006 FUNDESLE */
package org.openXpertya.model;
import java.util.*;
import java.sql.*;
import java.math.*;
import org.openXpertya.util.*;
/** Modelo Generado por C_Calendar
 *  @author Comunidad de Desarrollo openXpertya*         *Basado en Codigo Original Modificado, Revisado y Optimizado de:*         * Jorg Janke 
 *  @version  - 2008-01-03 10:26:28.796 */
public class X_C_Calendar extends PO
{
/** Constructor estándar */
public X_C_Calendar (Properties ctx, int C_Calendar_ID, String trxName)
{
super (ctx, C_Calendar_ID, trxName);
/** if (C_Calendar_ID == 0)
{
setC_Calendar_ID (0);
setName (null);
}
 */
}
/** Load Constructor */
public X_C_Calendar (Properties ctx, ResultSet rs, String trxName)
{
super (ctx, rs, trxName);
}
/** AD_Table_ID=139 */
public static final int Table_ID=139;

/** TableName=C_Calendar */
public static final String Table_Name="C_Calendar";

protected static KeyNamePair Model = new KeyNamePair(139,"C_Calendar");
protected static BigDecimal AccessLevel = new BigDecimal(2);

/** Load Meta Data */
protected POInfo initPO (Properties ctx)
{
POInfo poi = POInfo.getPOInfo (ctx, Table_ID);
return poi;
}
public String toString()
{
StringBuffer sb = new StringBuffer ("X_C_Calendar[").append(getID()).append("]");
return sb.toString();
}
/** Set Calendar.
Accounting Calendar Name */
public void setC_Calendar_ID (int C_Calendar_ID)
{
set_ValueNoCheck ("C_Calendar_ID", new Integer(C_Calendar_ID));
}
/** Get Calendar.
Accounting Calendar Name */
public int getC_Calendar_ID() 
{
Integer ii = (Integer)get_Value("C_Calendar_ID");
if (ii == null) return 0;
return ii.intValue();
}
/** Set Description.
Optional short description of the record */
public void setDescription (String Description)
{
if (Description != null && Description.length() > 255)
{
log.warning("Length > 255 - truncated");
Description = Description.substring(0,254);
}
set_Value ("Description", Description);
}
/** Get Description.
Optional short description of the record */
public String getDescription() 
{
return (String)get_Value("Description");
}
/** Set Name.
Alphanumeric identifier of the entity */
public void setName (String Name)
{
if (Name == null) throw new IllegalArgumentException ("Name is mandatory");
if (Name.length() > 60)
{
log.warning("Length > 60 - truncated");
Name = Name.substring(0,59);
}
set_Value ("Name", Name);
}
/** Get Name.
Alphanumeric identifier of the entity */
public String getName() 
{
return (String)get_Value("Name");
}
public KeyNamePair getKeyNamePair() 
{
return new KeyNamePair(getID(), getName());
}
}
