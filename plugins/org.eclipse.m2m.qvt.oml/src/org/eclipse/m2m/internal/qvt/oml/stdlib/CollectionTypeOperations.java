/*******************************************************************************
 * Copyright (c) 2014, 2015 S.Boyko and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sergey Boyko - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2m.internal.qvt.oml.stdlib;

import java.util.Collection;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QVTOEnvironment;
import org.eclipse.m2m.internal.qvt.oml.ast.env.QvtOperationalEvaluationEnv;
import org.eclipse.m2m.internal.qvt.oml.evaluator.ModuleInstance;
import org.eclipse.ocl.expressions.CollectionKind;
import org.eclipse.ocl.types.OCLStandardLibrary;
import org.eclipse.ocl.util.CollectionUtil;
import org.eclipse.ocl.util.TypeUtil;


public class CollectionTypeOperations extends AbstractContextualOperations {

	public static final String AS_SET_NAME = "asSet"; //$NON-NLS-1$
	public static final String AS_ORDERED_SET_NAME = "asOrderedSet"; //$NON-NLS-1$
	public static final String AS_SEQUENCE_NAME = "asSequence"; //$NON-NLS-1$
	public static final String AS_BAG_NAME = "asBag"; //$NON-NLS-1$
	public static final String FLATTEN_NAME = "flatten"; //$NON-NLS-1$
	
	private static final CallHandler AS_SET = new CallHandler() {
		
		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
			if(source instanceof Collection<?>) {
				return CollectionUtil.asSet((Collection<?>) source);
			}
			return CallHandlerAdapter.getInvalidResult(evalEnv);
		}
	};	
			
	private static final CallHandler AS_ORDERED_SET = new CallHandler() {
		
		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
			if(source instanceof Collection<?>) {
				return CollectionUtil.asOrderedSet((Collection<?>) source);
			}
			return CallHandlerAdapter.getInvalidResult(evalEnv);
		}
	};	
			
	private static final CallHandler AS_SEQUENCE = new CallHandler() {
		
		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
			if(source instanceof Collection<?>) {
				return CollectionUtil.asSequence((Collection<?>) source);
			}
			return CallHandlerAdapter.getInvalidResult(evalEnv);
		}
	};	
			
	private static final CallHandler AS_BAG = new CallHandler() {
		
		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
			if(source instanceof Collection<?>) {
				return CollectionUtil.asBag((Collection<?>) source);
			}
			return CallHandlerAdapter.getInvalidResult(evalEnv);
		}
	};	
			
	private static final CallHandler FLATTEN = new CallHandler() {
		
		public Object invoke(ModuleInstance module, Object source, Object[] args, QvtOperationalEvaluationEnv evalEnv) {
			if(source instanceof Collection<?>) {
				return CollectionUtil.flatten((Collection<?>) source);
			}
			return CallHandlerAdapter.getInvalidResult(evalEnv);
		}
	};	
			

	private CollectionTypeOperations(AbstractQVTStdlib library, EClassifier targetType) {
		super(library, targetType);		
	}

	public static AbstractContextualOperations[] getAllOperations(AbstractQVTStdlib library) {
		QVTOEnvironment environment = library.getEnvironment();
		return new AbstractContextualOperations[] {
			new CollectionTypeOperations(library, environment.getOCLStandardLibrary().getCollection()),
		};		
	}	
	
	@Override
	protected OperationProvider[] getOperations() {
		OCLStandardLibrary<EClassifier> oclStdlib = getStdlib().getEnvironment().getOCLStandardLibrary();
		return new OperationProvider[] {
				new OperationProvider(AS_SET, AS_SET_NAME, oclStdlib.getSet()),
				new OperationProvider(AS_ORDERED_SET, AS_ORDERED_SET_NAME, oclStdlib.getOrderedSet()),
				new OperationProvider(AS_SEQUENCE, AS_SEQUENCE_NAME, oclStdlib.getSequence()),
				new OperationProvider(AS_BAG, AS_BAG_NAME, oclStdlib.getBag()),
				new OperationProvider(FLATTEN, FLATTEN_NAME, 
						TypeUtil.resolveCollectionType(getStdlib().getEnvironment(), CollectionKind.COLLECTION_LITERAL, oclStdlib.getT2())),
		};
	}
}
