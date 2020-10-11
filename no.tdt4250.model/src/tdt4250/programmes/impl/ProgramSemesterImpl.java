/**
 */
package tdt4250.programmes.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.programmes.Course;
import tdt4250.programmes.ProgramSemester;
import tdt4250.programmes.ProgrammesPackage;
import tdt4250.programmes.SemesterKind;
import tdt4250.programmes.Specialization;
import tdt4250.programmes.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getSemesterKind <em>Semester Kind</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.programmes.impl.ProgramSemesterImpl#getRootProgram <em>Root Program</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSemesterImpl extends MinimalEObjectImpl.Container implements ProgramSemester {
	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final String YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected String year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemesterKind() <em>Semester Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterKind()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterKind SEMESTER_KIND_EDEFAULT = SemesterKind.AUTMN;

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
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

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
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammesPackage.Literals.PROGRAM_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(String newYear) {
		String oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAM_SEMESTER__YEAR, oldYear, year));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAM_SEMESTER__SEMESTER_KIND, oldSemesterKind, semesterKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectContainmentEList<Course>(Course.class, this, ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectContainmentEList<Course>(Course.class, this, ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getProgramYear() {
		if (eContainerFeatureID() != ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR) return null;
		return (Year)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(Year newProgramYear, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramYear, ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramYear(Year newProgramYear) {
		if (newProgramYear != eInternalContainer() || (eContainerFeatureID() != ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR && newProgramYear != null)) {
			if (EcoreUtil.isAncestor(this, newProgramYear))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, ProgrammesPackage.YEAR__SEMESTERS, Year.class, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR, newProgramYear, newProgramYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this, ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS, ProgrammesPackage.SPECIALIZATION__SEMESTER_SPECIALIZATION);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getRootProgram() {
		if (eContainerFeatureID() != ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM) return null;
		return (Specialization)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootProgram(Specialization newRootProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRootProgram, ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootProgram(Specialization newRootProgram) {
		if (newRootProgram != eInternalContainer() || (eContainerFeatureID() != ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM && newRootProgram != null)) {
			if (EcoreUtil.isAncestor(this, newRootProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRootProgram != null)
				msgs = ((InternalEObject)newRootProgram).eInverseAdd(this, ProgrammesPackage.SPECIALIZATION__SEMSTERS, Specialization.class, msgs);
			msgs = basicSetRootProgram(newRootProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM, newRootProgram, newRootProgram));
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
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramYear((Year)otherEnd, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRootProgram((Specialization)otherEnd, msgs);
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
			case ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return ((InternalEList<?>)getMandatoryCourses()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return ((InternalEList<?>)getElectiveCourses()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				return basicSetRootProgram(null, msgs);
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
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return eInternalContainer().eInverseRemove(this, ProgrammesPackage.YEAR__SEMESTERS, Year.class, msgs);
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				return eInternalContainer().eInverseRemove(this, ProgrammesPackage.SPECIALIZATION__SEMSTERS, Specialization.class, msgs);
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
			case ProgrammesPackage.PROGRAM_SEMESTER__YEAR:
				return getYear();
			case ProgrammesPackage.PROGRAM_SEMESTER__SEMESTER_KIND:
				return getSemesterKind();
			case ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear();
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return getSpecializations();
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				return getRootProgram();
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
			case ProgrammesPackage.PROGRAM_SEMESTER__YEAR:
				setYear((String)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__SEMESTER_KIND:
				setSemesterKind((SemesterKind)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				setProgramYear((Year)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				setRootProgram((Specialization)newValue);
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
			case ProgrammesPackage.PROGRAM_SEMESTER__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__SEMESTER_KIND:
				setSemesterKind(SEMESTER_KIND_EDEFAULT);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				setProgramYear((Year)null);
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				setRootProgram((Specialization)null);
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
			case ProgrammesPackage.PROGRAM_SEMESTER__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
			case ProgrammesPackage.PROGRAM_SEMESTER__SEMESTER_KIND:
				return semesterKind != SEMESTER_KIND_EDEFAULT;
			case ProgrammesPackage.PROGRAM_SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case ProgrammesPackage.PROGRAM_SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case ProgrammesPackage.PROGRAM_SEMESTER__PROGRAM_YEAR:
				return getProgramYear() != null;
			case ProgrammesPackage.PROGRAM_SEMESTER__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case ProgrammesPackage.PROGRAM_SEMESTER__ROOT_PROGRAM:
				return getRootProgram() != null;
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
		result.append(" (Year: ");
		result.append(year);
		result.append(", SemesterKind: ");
		result.append(semesterKind);
		result.append(')');
		return result.toString();
	}

} //ProgramSemesterImpl
