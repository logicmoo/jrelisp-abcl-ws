/*
 * MacroObject.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: MacroObject.java,v 1.7 2004-10-22 15:51:38 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public final class MacroObject extends Functional
{
    private final LispObject name;
    private final LispObject expander;

    public MacroObject(LispObject name, LispObject expander)
    {
        this.name = name;
        this.expander = expander;
    }

    public int getFunctionalType()
    {
        return FTYPE_MACRO;
    }

    public LispObject getExpander()
    {
        return expander;
    }

    public LispObject execute(LispObject[] args) throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public LispObject execute() throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public LispObject execute(LispObject first, LispObject second)
        throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third)
        throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public LispObject execute(LispObject first, LispObject second,
                              LispObject third, LispObject fourth)
        throws ConditionThrowable
    {
        return signal(new UndefinedFunction(name));
    }

    public String writeToString()
    {
        return unreadableString("MACRO-OBJECT");
    }
}
