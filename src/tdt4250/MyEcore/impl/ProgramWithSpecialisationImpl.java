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
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.School;
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
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl#getSchool <em>School</em>}</li>
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
	public School getSchool() {
		if (eContainerFeatureID() != MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL) return null;
		return (School)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchool(School newSchool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchool, MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool(School newSchool) {
		if (newSchool != eInternalContainer() || (eContainerFeatureID() != MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL && newSchool != null)) {
			if (EcoreUtil.isAncestor(this, newSchool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchool != null)
				msgs = ((InternalEObject)newSchool).eInverseAdd(this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS, School.class, msgs);
			msgs = basicSetSchool(newSchool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL, newSchool, newSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return ((InternalEList<?>)getProgramSpecialicationYear()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
				return eInternalContainer().eInverseRemove(this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS, School.class, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return getProgramSpecialicationYear();
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				getProgramSpecialicationYear().clear();
				getProgramSpecialicationYear().addAll((Collection<? extends Year>)newValue);
				return;
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				getProgramSpecialicationYear().clear();
				return;
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
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
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR:
				return programSpecialicationYear != null && !programSpecialicationYear.isEmpty();
			case MyEcorePackage.PROGRAM_WITH_SPECIALISATION__SCHOOL:
				return getSchool() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithSpecialisationImpl
