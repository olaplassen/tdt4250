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
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.Program;
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
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getSchoolName <em>School Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SchoolImpl#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

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
	 * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudents()
	 * @generated
	 * @ordered
	 */
	protected Student students;

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
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this, MyEcorePackage.SCHOOL__PROGRAMS);
		}
		return programs;
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
	public Student getStudents() {
		return students;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudents(Student newStudents, NotificationChain msgs) {
		Student oldStudents = students;
		students = newStudents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.SCHOOL__STUDENTS, oldStudents, newStudents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudents(Student newStudents) {
		if (newStudents != students) {
			NotificationChain msgs = null;
			if (students != null)
				msgs = ((InternalEObject)students).eInverseRemove(this, MyEcorePackage.STUDENT__SCHOOL, Student.class, msgs);
			if (newStudents != null)
				msgs = ((InternalEObject)newStudents).eInverseAdd(this, MyEcorePackage.STUDENT__SCHOOL, Student.class, msgs);
			msgs = basicSetStudents(newStudents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SCHOOL__STUDENTS, newStudents, newStudents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.SCHOOL__STUDENTS:
				if (students != null)
					msgs = ((InternalEObject)students).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SCHOOL__STUDENTS, null, msgs);
				return basicSetStudents((Student)otherEnd, msgs);
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
			case MyEcorePackage.SCHOOL__PROGRAMS:
				return ((InternalEList<?>)getPrograms()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.SCHOOL__STUDENTS:
				return basicSetStudents(null, msgs);
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
			case MyEcorePackage.SCHOOL__PROGRAMS:
				return getPrograms();
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				return getSchoolName();
			case MyEcorePackage.SCHOOL__STUDENTS:
				return getStudents();
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
			case MyEcorePackage.SCHOOL__PROGRAMS:
				getPrograms().clear();
				getPrograms().addAll((Collection<? extends Program>)newValue);
				return;
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				setSchoolName((String)newValue);
				return;
			case MyEcorePackage.SCHOOL__STUDENTS:
				setStudents((Student)newValue);
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
			case MyEcorePackage.SCHOOL__PROGRAMS:
				getPrograms().clear();
				return;
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				setSchoolName(SCHOOL_NAME_EDEFAULT);
				return;
			case MyEcorePackage.SCHOOL__STUDENTS:
				setStudents((Student)null);
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
			case MyEcorePackage.SCHOOL__PROGRAMS:
				return programs != null && !programs.isEmpty();
			case MyEcorePackage.SCHOOL__SCHOOL_NAME:
				return SCHOOL_NAME_EDEFAULT == null ? schoolName != null : !SCHOOL_NAME_EDEFAULT.equals(schoolName);
			case MyEcorePackage.SCHOOL__STUDENTS:
				return students != null;
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
