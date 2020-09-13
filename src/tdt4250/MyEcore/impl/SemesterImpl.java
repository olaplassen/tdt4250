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
import tdt4250.MyEcore.Course;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.Semester;
import tdt4250.MyEcore.SemesterKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getSemesterKind <em>Semester Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
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
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * The default value of the '{@link #getSemesterKind() <em>Semester Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterKind()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterKind SEMESTER_KIND_EDEFAULT = SemesterKind.AUTUMN;

	/**
	 * The cached value of the '{@link #getSemesterKind() <em>Semester Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterKind()
	 * @generated
	 * @ordered
	 */
	protected SemesterKind semesterKind = SEMESTER_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.SEMESTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SEMESTER__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectContainmentEList<Course>(Course.class, this, MyEcorePackage.SEMESTER__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectContainmentEList<Course>(Course.class, this, MyEcorePackage.SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterKind getSemesterKind() {
		return semesterKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterKind(SemesterKind newSemesterKind) {
		SemesterKind oldSemesterKind = semesterKind;
		semesterKind = newSemesterKind == null ? SEMESTER_KIND_EDEFAULT : newSemesterKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SEMESTER__SEMESTER_KIND, oldSemesterKind, semesterKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				return ((InternalEList<?>)getElectiveCourses()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				return ((InternalEList<?>)getMandatoryCourses()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.SEMESTER__YEAR:
				return getYear();
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case MyEcorePackage.SEMESTER__SEMESTER_KIND:
				return getSemesterKind();
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
			case MyEcorePackage.SEMESTER__YEAR:
				setYear((Integer)newValue);
				return;
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case MyEcorePackage.SEMESTER__SEMESTER_KIND:
				setSemesterKind((SemesterKind)newValue);
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
			case MyEcorePackage.SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case MyEcorePackage.SEMESTER__SEMESTER_KIND:
				setSemesterKind(SEMESTER_KIND_EDEFAULT);
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
			case MyEcorePackage.SEMESTER__YEAR:
				return year != YEAR_EDEFAULT;
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case MyEcorePackage.SEMESTER__SEMESTER_KIND:
				return semesterKind != SEMESTER_KIND_EDEFAULT;
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
		result.append(", SemesterKind: ");
		result.append(semesterKind);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
