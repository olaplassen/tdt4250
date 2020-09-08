/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program With Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl#getSpecilisations <em>Specilisations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramWithSpecialisationImpl extends ProgramImpl implements ProgramWithSpecialisation {
	/**
	 * The cached value of the '{@link #getSpecilisations() <em>Specilisations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecilisations()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specilisations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramWithSpecialisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.PROGRAM_WITH_SPECIALISATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getSpecilisations() {
		return specilisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecilisations(Specialisation newSpecilisations, NotificationChain msgs) {
		Specialisation oldSpecilisations = specilisations;
		specilisations = newSpecilisations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS, oldSpecilisations, newSpecilisations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecilisations(Specialisation newSpecilisations) {
		if (newSpecilisations != specilisations) {
			NotificationChain msgs = null;
			if (specilisations != null)
				msgs = ((InternalEObject)specilisations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS, null, msgs);
			if (newSpecilisations != null)
				msgs = ((InternalEObject)newSpecilisations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS, null, msgs);
			msgs = basicSetSpecilisations(newSpecilisations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS, newSpecilisations, newSpecilisations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS:
				return basicSetSpecilisations(null, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS:
				return getSpecilisations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS:
				setSpecilisations((Specialisation)newValue);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS:
				setSpecilisations((Specialisation)null);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SPECILISATIONS:
				return specilisations != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithSpecialisationImpl
