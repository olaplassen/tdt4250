/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.MyEcore.Course;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.SemesterKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.CourseImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.CourseImpl#getFallOrAutumnCourse <em>Fall Or Autumn Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected float credit = CREDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected String level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFallOrAutumnCourse() <em>Fall Or Autumn Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallOrAutumnCourse()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterKind FALL_OR_AUTUMN_COURSE_EDEFAULT = SemesterKind.AUTUMN;

	/**
	 * The cached value of the '{@link #getFallOrAutumnCourse() <em>Fall Or Autumn Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFallOrAutumnCourse()
	 * @generated
	 * @ordered
	 */
	protected SemesterKind fallOrAutumnCourse = FALL_OR_AUTUMN_COURSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.COURSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(float newCredit) {
		float oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.COURSE__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(String newLevel) {
		String oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterKind getFallOrAutumnCourse() {
		return fallOrAutumnCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFallOrAutumnCourse(SemesterKind newFallOrAutumnCourse) {
		SemesterKind oldFallOrAutumnCourse = fallOrAutumnCourse;
		fallOrAutumnCourse = newFallOrAutumnCourse == null ? FALL_OR_AUTUMN_COURSE_EDEFAULT : newFallOrAutumnCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.COURSE__FALL_OR_AUTUMN_COURSE, oldFallOrAutumnCourse, fallOrAutumnCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyEcorePackage.COURSE__CODE:
				return getCode();
			case MyEcorePackage.COURSE__CREDIT:
				return getCredit();
			case MyEcorePackage.COURSE__LEVEL:
				return getLevel();
			case MyEcorePackage.COURSE__FALL_OR_AUTUMN_COURSE:
				return getFallOrAutumnCourse();
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
			case MyEcorePackage.COURSE__CODE:
				setCode((String)newValue);
				return;
			case MyEcorePackage.COURSE__CREDIT:
				setCredit((Float)newValue);
				return;
			case MyEcorePackage.COURSE__LEVEL:
				setLevel((String)newValue);
				return;
			case MyEcorePackage.COURSE__FALL_OR_AUTUMN_COURSE:
				setFallOrAutumnCourse((SemesterKind)newValue);
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
			case MyEcorePackage.COURSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case MyEcorePackage.COURSE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case MyEcorePackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case MyEcorePackage.COURSE__FALL_OR_AUTUMN_COURSE:
				setFallOrAutumnCourse(FALL_OR_AUTUMN_COURSE_EDEFAULT);
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
			case MyEcorePackage.COURSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case MyEcorePackage.COURSE__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case MyEcorePackage.COURSE__LEVEL:
				return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
			case MyEcorePackage.COURSE__FALL_OR_AUTUMN_COURSE:
				return fallOrAutumnCourse != FALL_OR_AUTUMN_COURSE_EDEFAULT;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", credit: ");
		result.append(credit);
		result.append(", level: ");
		result.append(level);
		result.append(", fallOrAutumnCourse: ");
		result.append(fallOrAutumnCourse);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
