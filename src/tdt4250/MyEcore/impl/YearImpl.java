/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getOrdinaryPrograms <em>Ordinary Programs</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getProgramsWithSpecialisation <em>Programs With Specialisation</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getYear <em>Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
	/**
	 * The cached value of the '{@link #getOrdinaryPrograms() <em>Ordinary Programs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinaryPrograms()
	 * @generated
	 * @ordered
	 */
	protected ProgramWithNoSpecialication ordinaryPrograms;

	/**
	 * The cached value of the '{@link #getProgramsWithSpecialisation() <em>Programs With Specialisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsWithSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected ProgramWithSpecialisation programsWithSpecialisation;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramWithNoSpecialication getOrdinaryPrograms() {
		return ordinaryPrograms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdinaryPrograms(ProgramWithNoSpecialication newOrdinaryPrograms, NotificationChain msgs) {
		ProgramWithNoSpecialication oldOrdinaryPrograms = ordinaryPrograms;
		ordinaryPrograms = newOrdinaryPrograms;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__ORDINARY_PROGRAMS, oldOrdinaryPrograms, newOrdinaryPrograms);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinaryPrograms(ProgramWithNoSpecialication newOrdinaryPrograms) {
		if (newOrdinaryPrograms != ordinaryPrograms) {
			NotificationChain msgs = null;
			if (ordinaryPrograms != null)
				msgs = ((InternalEObject)ordinaryPrograms).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.YEAR__ORDINARY_PROGRAMS, null, msgs);
			if (newOrdinaryPrograms != null)
				msgs = ((InternalEObject)newOrdinaryPrograms).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.YEAR__ORDINARY_PROGRAMS, null, msgs);
			msgs = basicSetOrdinaryPrograms(newOrdinaryPrograms, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__ORDINARY_PROGRAMS, newOrdinaryPrograms, newOrdinaryPrograms));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramWithSpecialisation getProgramsWithSpecialisation() {
		return programsWithSpecialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramsWithSpecialisation(ProgramWithSpecialisation newProgramsWithSpecialisation, NotificationChain msgs) {
		ProgramWithSpecialisation oldProgramsWithSpecialisation = programsWithSpecialisation;
		programsWithSpecialisation = newProgramsWithSpecialisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION, oldProgramsWithSpecialisation, newProgramsWithSpecialisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramsWithSpecialisation(ProgramWithSpecialisation newProgramsWithSpecialisation) {
		if (newProgramsWithSpecialisation != programsWithSpecialisation) {
			NotificationChain msgs = null;
			if (programsWithSpecialisation != null)
				msgs = ((InternalEObject)programsWithSpecialisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION, null, msgs);
			if (newProgramsWithSpecialisation != null)
				msgs = ((InternalEObject)newProgramsWithSpecialisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION, null, msgs);
			msgs = basicSetProgramsWithSpecialisation(newProgramsWithSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION, newProgramsWithSpecialisation, newProgramsWithSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.YEAR__ORDINARY_PROGRAMS:
				return basicSetOrdinaryPrograms(null, msgs);
			case MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION:
				return basicSetProgramsWithSpecialisation(null, msgs);
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
			case MyEcorePackage.YEAR__ORDINARY_PROGRAMS:
				return getOrdinaryPrograms();
			case MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION:
				return getProgramsWithSpecialisation();
			case MyEcorePackage.YEAR__YEAR:
				return getYear();
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
			case MyEcorePackage.YEAR__ORDINARY_PROGRAMS:
				setOrdinaryPrograms((ProgramWithNoSpecialication)newValue);
				return;
			case MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION:
				setProgramsWithSpecialisation((ProgramWithSpecialisation)newValue);
				return;
			case MyEcorePackage.YEAR__YEAR:
				setYear((Integer)newValue);
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
			case MyEcorePackage.YEAR__ORDINARY_PROGRAMS:
				setOrdinaryPrograms((ProgramWithNoSpecialication)null);
				return;
			case MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION:
				setProgramsWithSpecialisation((ProgramWithSpecialisation)null);
				return;
			case MyEcorePackage.YEAR__YEAR:
				setYear(YEAR_EDEFAULT);
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
			case MyEcorePackage.YEAR__ORDINARY_PROGRAMS:
				return ordinaryPrograms != null;
			case MyEcorePackage.YEAR__PROGRAMS_WITH_SPECIALISATION:
				return programsWithSpecialisation != null;
			case MyEcorePackage.YEAR__YEAR:
				return year != YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //YearImpl
