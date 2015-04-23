/**
 */
package org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.xtext.basecs.impl.ElementRefCSImpl;
import org.eclipse.ocl.xtext.basecs.util.BaseCSVisitor;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingExtensionKindCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ScopedNameCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.util.QVTOperationalCSVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Extension CS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingExtensionCSImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.qvto.examples.xtext.qvtoperationalcs.impl.MappingExtensionCSImpl#getMappingIdentifiers <em>Mapping Identifiers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingExtensionCSImpl extends ElementRefCSImpl implements MappingExtensionCS {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final MappingExtensionKindCS KIND_EDEFAULT = MappingExtensionKindCS.DISJUNCTS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected MappingExtensionKindCS kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMappingIdentifiers() <em>Mapping Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<ScopedNameCS> mappingIdentifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingExtensionCSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QVTOperationalCSPackage.Literals.MAPPING_EXTENSION_CS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingExtensionKindCS getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MappingExtensionKindCS newKind) {
		MappingExtensionKindCS oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QVTOperationalCSPackage.MAPPING_EXTENSION_CS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScopedNameCS> getMappingIdentifiers() {
		if (mappingIdentifiers == null) {
			mappingIdentifiers = new EObjectContainmentEList<ScopedNameCS>(ScopedNameCS.class, this, QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS);
		}
		return mappingIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS:
				return ((InternalEList<?>)getMappingIdentifiers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__KIND:
				return getKind();
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS:
				return getMappingIdentifiers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__KIND:
				setKind((MappingExtensionKindCS)newValue);
				return;
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS:
				getMappingIdentifiers().clear();
				getMappingIdentifiers().addAll((Collection<? extends ScopedNameCS>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS:
				getMappingIdentifiers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__KIND:
				return kind != KIND_EDEFAULT;
			case QVTOperationalCSPackage.MAPPING_EXTENSION_CS__MAPPING_IDENTIFIERS:
				return mappingIdentifiers != null && !mappingIdentifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <R> R accept(BaseCSVisitor<R> visitor) {
		return (R) ((QVTOperationalCSVisitor<?>)visitor).visitMappingExtensionCS(this);
	}

} //MappingExtensionCSImpl
