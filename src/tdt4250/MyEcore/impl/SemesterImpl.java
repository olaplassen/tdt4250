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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SemesterImpl#getSemesterCreditRequirements <em>Semester Credit Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
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
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected Course mandatoryCourses;

	/**
	 * The default value of the '{@link #getSemesterCreditRequirements() <em>Semester Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCreditRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final float SEMESTER_CREDIT_REQUIREMENTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSemesterCreditRequirements() <em>Semester Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCreditRequirements()
	 * @generated
	 * @ordered
	 */
	protected float semesterCreditRequirements = SEMESTER_CREDIT_REQUIREMENTS_EDEFAULT;

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
	public Course getMandatoryCourses() {
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryCourses(Course newMandatoryCourses, NotificationChain msgs) {
		Course oldMandatoryCourses = mandatoryCourses;
		mandatoryCourses = newMandatoryCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.SEMESTER__MANDATORY_COURSES, oldMandatoryCourses, newMandatoryCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryCourses(Course newMandatoryCourses) {
		if (newMandatoryCourses != mandatoryCourses) {
			NotificationChain msgs = null;
			if (mandatoryCourses != null)
				msgs = ((InternalEObject)mandatoryCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SEMESTER__MANDATORY_COURSES, null, msgs);
			if (newMandatoryCourses != null)
				msgs = ((InternalEObject)newMandatoryCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SEMESTER__MANDATORY_COURSES, null, msgs);
			msgs = basicSetMandatoryCourses(newMandatoryCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SEMESTER__MANDATORY_COURSES, newMandatoryCourses, newMandatoryCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSemesterCreditRequirements() {
		return semesterCreditRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterCreditRequirements(float newSemesterCreditRequirements) {
		float oldSemesterCreditRequirements = semesterCreditRequirements;
		semesterCreditRequirements = newSemesterCreditRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SEMESTER__SEMESTER_CREDIT_REQUIREMENTS, oldSemesterCreditRequirements, semesterCreditRequirements));
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
				return basicSetMandatoryCourses(null, msgs);
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
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case MyEcorePackage.SEMESTER__SEMESTER_CREDIT_REQUIREMENTS:
				return getSemesterCreditRequirements();
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
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				setMandatoryCourses((Course)newValue);
				return;
			case MyEcorePackage.SEMESTER__SEMESTER_CREDIT_REQUIREMENTS:
				setSemesterCreditRequirements((Float)newValue);
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
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				setMandatoryCourses((Course)null);
				return;
			case MyEcorePackage.SEMESTER__SEMESTER_CREDIT_REQUIREMENTS:
				setSemesterCreditRequirements(SEMESTER_CREDIT_REQUIREMENTS_EDEFAULT);
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
			case MyEcorePackage.SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case MyEcorePackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null;
			case MyEcorePackage.SEMESTER__SEMESTER_CREDIT_REQUIREMENTS:
				return semesterCreditRequirements != SEMESTER_CREDIT_REQUIREMENTS_EDEFAULT;
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
		result.append(" (semesterCreditRequirements: ");
		result.append(semesterCreditRequirements);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
