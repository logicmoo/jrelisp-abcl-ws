/*
 * ReaderError.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ReaderError.java 11488 2008-12-27 10:50:33Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

public final class ReaderError extends StreamError
{
    public ReaderError(String message) throws ConditionThrowable
    {
        super(StandardClass.READER_ERROR);
        setFormatControl(message);
        setFormatArguments(NIL);
    }

    public ReaderError(String message, Stream stream) throws ConditionThrowable
    {
        super(StandardClass.READER_ERROR);
        setFormatControl(message);
        setFormatArguments(NIL);
        setStream(stream);
    }

    public ReaderError(LispObject initArgs) throws ConditionThrowable
    {
        super(StandardClass.READER_ERROR);
        initialize(initArgs);
    }

    @Override
    public LispObject typeOf()
    {
        return Symbol.READER_ERROR;
    }

    @Override
    public LispObject classOf()
    {
        return StandardClass.READER_ERROR;
    }

    @Override
    public LispObject typep(LispObject type) throws ConditionThrowable
    {
        if (type == Symbol.READER_ERROR)
            return T;
        if (type == StandardClass.READER_ERROR)
            return T;
        if (type == Symbol.PARSE_ERROR)
            return T;
        if (type == StandardClass.PARSE_ERROR)
            return T;
        return super.typep(type);
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
