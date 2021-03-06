/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2010, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.test.annotations.lob;
import java.io.Serializable;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.SerializableTypeDescriptor;
import org.hibernate.type.descriptor.sql.LongVarbinaryTypeDescriptor;

/**
 * A type that maps JDBC {@link java.sql.Types#LONGVARBINARY LONGVARBINARY} and {@link Serializable}.
 * </p>
 * TODO : this should really have access to the actual Serializable class so we have access to the proper classloader
 * 
 * @author Strong Liu
 */
public class SerializableToImageType extends AbstractSingleColumnStandardBasicType<Serializable> {
	public static final PrimitiveCharacterArrayTextType INSTANCE = new PrimitiveCharacterArrayTextType();

	public SerializableToImageType() {
		super( LongVarbinaryTypeDescriptor.INSTANCE, new SerializableTypeDescriptor<Serializable>( Serializable.class ) );
	}

	public String getName() {
		// todo name these annotation types for addition to the registry
		return null;
	}
}
