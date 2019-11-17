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
package proguard.classfile.visitor;

import proguard.classfile.Clazz;
import proguard.classfile.util.SimplifiedVisitor;

import java.util.Collection;

/**
 * This <code>ClassVisitor</code> collects the classes that it visits in the
 * given collection.
 *
 * @author Eric Lafortune
 */
public class ClassCollector
extends      SimplifiedVisitor
implements   ClassVisitor
{
    private final Collection<Clazz> collection;


    /**
     * Creates a new ClassCollector.
     * @param collection the <code>Collection</code> in which all classes will be collected.
     */
    public ClassCollector(Collection<Clazz> collection)
    {
        this.collection = collection;
    }


    // Implementations for ClassVisitor.

    @Override
    public void visitAnyClass(Clazz clazz)
    {
        collection.add(clazz);
    }
}
