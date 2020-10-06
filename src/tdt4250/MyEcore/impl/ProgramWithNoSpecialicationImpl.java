/**
 */
package tdt4250.MyEcore.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.School;
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
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl#getSchool <em>School</em>}</li>
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
	public School getSchool() {
		if (eContainerFeatureID() != MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL) return null;
		return (School)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchool((School)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				return basicSetSchool(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				return eInternalContainer().eInverseRemove(this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION, School.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				return getSchool();
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				setSchool((School)newValue);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				setSchool((School)null);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SCHOOL:
				return getSchool() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithNoSpecialicationImpl
