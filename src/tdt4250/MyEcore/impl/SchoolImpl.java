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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.School;
import tdt4250.MyEcore.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getProgramsWithNoSpecialication <em>Programs With No Specialication</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getSchoolName <em>School Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getProgramsWithSpecialications <em>Programs With Specialications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The cached value of the '{@link #getProgramsWithNoSpecialication() <em>Programs With No Specialication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsWithNoSpecialication()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramWithNoSpecialication> programsWithNoSpecialication;

	/**
	 * The default value of the '{@link #getSchoolName() <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchoolName() <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolName()
	 * @generated
	 * @ordered
	 */
	protected String schoolName = SCHOOL_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> students;

	/**
	 * The cached value of the '{@link #getProgramsWithSpecialications() <em>Programs With Specialications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramsWithSpecialications()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramWithSpecialisation> programsWithSpecialications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramWithNoSpecialication> getProgramsWithNoSpecialication() {
		if (programsWithNoSpecialication == null) {
			programsWithNoSpecialication = new EObjectContainmentEList<ProgramWithNoSpecialication>(ProgramWithNoSpecialication.class, this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION);
		}
		return programsWithNoSpecialication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchoolName(String newSchoolName) {
		String oldSchoolName = schoolName;
		schoolName = newSchoolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SCHOOL__SCHOOL_NAME, oldSchoolName, schoolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getStudents() {
		if (students == null) {
			students = new EObjectContainmentWithInverseEList<Student>(Student.class, this, MyEcorePackage.SCHOOL__STUDENTS, MyEcorePackage.STUDENT__SCHOOL);
		}
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProgramWithSpecialisation> getProgramsWithSpecialications() {
		if (programsWithSpecialications == null) {
			programsWithSpecialications = new EObjectContainmentEList<ProgramWithSpecialisation>(ProgramWithSpecialisation.class, this, MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS);
		}
		return programsWithSpecialications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.SCHOOL__STUDENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudents()).basicAdd(otherEnd, msgs);
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
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION:
				return ((InternalEList<?>)getProgramsWithNoSpecialication()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.SCHOOL__STUDENTS:
				return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS:
				return ((InternalEList<?>)getProgramsWithSpecialications()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION:
				return getProgramsWithNoSpecialication();
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				return getSchoolName();
			case MyEcorePackage.SCHOOL__STUDENTS:
				return getStudents();
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS:
				return getProgramsWithSpecialications();
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
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION:
				getProgramsWithNoSpecialication().clear();
				getProgramsWithNoSpecialication().addAll((Collection<? extends ProgramWithNoSpecialication>)newValue);
				return;
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				setSchoolName((String)newValue);
				return;
			case MyEcorePackage.SCHOOL__STUDENTS:
				getStudents().clear();
				getStudents().addAll((Collection<? extends Student>)newValue);
				return;
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS:
				getProgramsWithSpecialications().clear();
				getProgramsWithSpecialications().addAll((Collection<? extends ProgramWithSpecialisation>)newValue);
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
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION:
				getProgramsWithNoSpecialication().clear();
				return;
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				setSchoolName(SCHOOL_NAME_EDEFAULT);
				return;
			case MyEcorePackage.SCHOOL__STUDENTS:
				getStudents().clear();
				return;
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS:
				getProgramsWithSpecialications().clear();
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
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION:
				return programsWithNoSpecialication != null && !programsWithNoSpecialication.isEmpty();
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				return SCHOOL_NAME_EDEFAULT == null ? schoolName != null : !SCHOOL_NAME_EDEFAULT.equals(schoolName);
			case MyEcorePackage.SCHOOL__STUDENTS:
				return students != null && !students.isEmpty();
			case MyEcorePackage.SCHOOL__PROGRAMS_WITH_SPECIALICATIONS:
				return programsWithSpecialications != null && !programsWithSpecialications.isEmpty();
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
		result.append(" (schoolName: ");
		result.append(schoolName);
		result.append(')');
		return result.toString();
	}

} //SchoolImpl
