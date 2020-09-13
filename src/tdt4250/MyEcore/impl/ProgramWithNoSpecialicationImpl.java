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
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program With No Specialication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl#getProgramYear <em>Program Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramWithNoSpecialicationImpl extends ProgramImpl implements ProgramWithNoSpecialication {
	/**
	 * The cached value of the '{@link #getProgramYear() <em>Program Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramYear()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> programYear;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramWithNoSpecialicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.PROGRAM_WITH_NO_SPECIALICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getProgramYear() {
		if (programYear == null) {
			programYear = new EObjectContainmentEList<Year>(Year.class, this, MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR);
		}
		return programYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR:
				return ((InternalEList<?>)getProgramYear()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR:
				return getProgramYear();
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR:
				getProgramYear().clear();
				getProgramYear().addAll((Collection<? extends Year>)newValue);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR:
				getProgramYear().clear();
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR:
				return programYear != null && !programYear.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithNoSpecialicationImpl
