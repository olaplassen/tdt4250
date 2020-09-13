/**
 */
package tdt4250.MyEcore.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program With Specialisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl#getProgramSpecialicationYear <em>Program Specialication Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramWithSpecialisationImpl extends ProgramImpl implements ProgramWithSpecialisation {
	/**
	 * The cached value of the '{@link #getProgramSpecialicationYear() <em>Program Specialication Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSpecialicationYear()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> programSpecialicationYear;
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
	public EList<Year> getProgramSpecialicationYear() {
		if (programSpecialicationYear == null) {
			programSpecialicationYear = new EObjectContainmentEList<Year>(Year.class, this, MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR);
		}
		return programSpecialicationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return ((InternalEList<?>)getProgramSpecialicationYear()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return getProgramSpecialicationYear();
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				getProgramSpecialicationYear().clear();
				getProgramSpecialicationYear().addAll((Collection<? extends Year>)newValue);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				getProgramSpecialicationYear().clear();
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return programSpecialicationYear != null && !programSpecialicationYear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithSpecialisationImpl
