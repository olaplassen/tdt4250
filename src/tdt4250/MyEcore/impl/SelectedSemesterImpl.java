/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import tdt4250.MyEcore.Course;
import tdt4250.MyEcore.IndividualStudyPlan;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.SelectedSemester;
import tdt4250.MyEcore.Semester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.SelectedSemesterImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SelectedSemesterImpl#getSemesterName <em>Semester Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SelectedSemesterImpl#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.SelectedSemesterImpl#getSelectableCourses <em>Selectable Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedSemesterImpl extends MinimalEObjectImpl.Container implements SelectedSemester {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected Semester semesters;

	/**
	 * The default value of the '{@link #getSemesterName() <em>Semester Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterName()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMESTER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSemesterName() <em>Semester Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterName()
	 * @generated
	 * @ordered
	 */
	protected String semesterName = SEMESTER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectableCourses() <em>Selectable Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectableCourses()
	 * @generated
	 * @ordered
	 */
	protected Course selectableCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.SELECTED_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemesters() {
		if (semesters != null && semesters.eIsProxy()) {
			InternalEObject oldSemesters = (InternalEObject)semesters;
			semesters = (Semester)eResolveProxy(oldSemesters);
			if (semesters != oldSemesters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, oldSemesters, semesters));
			}
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester basicGetSemesters() {
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesters(Semester newSemesters) {
		Semester oldSemesters = semesters;
		semesters = newSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, oldSemesters, semesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemesterName() {
		return semesterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesterName(String newSemesterName) {
		String oldSemesterName = semesterName;
		semesterName = newSemesterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME, oldSemesterName, semesterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualStudyPlan getStudyPlan() {
		if (eContainerFeatureID() != MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN) return null;
		return (IndividualStudyPlan)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(IndividualStudyPlan newStudyPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyPlan, MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyPlan(IndividualStudyPlan newStudyPlan) {
		if (newStudyPlan != eInternalContainer() || (eContainerFeatureID() != MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN && newStudyPlan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject)newStudyPlan).eInverseAdd(this, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS, IndividualStudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN, newStudyPlan, newStudyPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course getSelectableCourses() {
		return selectableCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectableCourses(Course newSelectableCourses, NotificationChain msgs) {
		Course oldSelectableCourses = selectableCourses;
		selectableCourses = newSelectableCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES, oldSelectableCourses, newSelectableCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectableCourses(Course newSelectableCourses) {
		if (newSelectableCourses != selectableCourses) {
			NotificationChain msgs = null;
			if (selectableCourses != null)
				msgs = ((InternalEObject)selectableCourses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES, null, msgs);
			if (newSelectableCourses != null)
				msgs = ((InternalEObject)newSelectableCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES, null, msgs);
			msgs = basicSetSelectableCourses(newSelectableCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES, newSelectableCourses, newSelectableCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyPlan((IndividualStudyPlan)otherEnd, msgs);
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
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				return basicSetStudyPlan(null, msgs);
			case MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES:
				return basicSetSelectableCourses(null, msgs);
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
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				return eInternalContainer().eInverseRemove(this, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS, IndividualStudyPlan.class, msgs);
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
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				if (resolve) return getSemesters();
				return basicGetSemesters();
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME:
				return getSemesterName();
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				return getStudyPlan();
			case MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES:
				return getSelectableCourses();
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
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				setSemesters((Semester)newValue);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME:
				setSemesterName((String)newValue);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				setStudyPlan((IndividualStudyPlan)newValue);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES:
				setSelectableCourses((Course)newValue);
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
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				setSemesters((Semester)null);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME:
				setSemesterName(SEMESTER_NAME_EDEFAULT);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				setStudyPlan((IndividualStudyPlan)null);
				return;
			case MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES:
				setSelectableCourses((Course)null);
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
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				return semesters != null;
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME:
				return SEMESTER_NAME_EDEFAULT == null ? semesterName != null : !SEMESTER_NAME_EDEFAULT.equals(semesterName);
			case MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN:
				return getStudyPlan() != null;
			case MyEcorePackage.SELECTED_SEMESTER__SELECTABLE_COURSES:
				return selectableCourses != null;
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
		result.append(" (semesterName: ");
		result.append(semesterName);
		result.append(')');
		return result.toString();
	}

} //SelectedSemesterImpl
