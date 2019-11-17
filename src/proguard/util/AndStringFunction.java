/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.util;

/**
 * This StringFunction tests whether the first given StringFunction
 * returns not null, returning the result of the latter function if so,
 * or null otherwise.
 *
 * @author Eric Lafortune
 */
public class AndStringFunction implements StringFunction
{
    private final StringFunction stringFunction1;
    private final StringFunction stringFunction2;


    /**
     * Creates a new AndStringFunction with the two given string functions.
     */
    public AndStringFunction(StringFunction stringFunction1,
                             StringFunction stringFunction2)
    {
        this.stringFunction1 = stringFunction1;
        this.stringFunction2 = stringFunction2;
    }


    // Implementations for StringFunction.

    @Override
    public String transform(String string)
    {
        return stringFunction1.transform(string) == null ? null :
               stringFunction2.transform(string);
    }
}
