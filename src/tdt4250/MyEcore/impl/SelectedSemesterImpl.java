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
 * </ul>
 *
 * @generated
 */
public class SelectedSemesterImpl extends MinimalEObjectImpl.Container implements SelectedSemester {
	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference.
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
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesters(Semester newSemesters, NotificationChain msgs) {
		Semester oldSemesters = semesters;
		semesters = newSemesters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, oldSemesters, newSemesters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemesters(Semester newSemesters) {
		if (newSemesters != semesters) {
			NotificationChain msgs = null;
			if (semesters != null)
				msgs = ((InternalEObject)semesters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, null, msgs);
			if (newSemesters != null)
				msgs = ((InternalEObject)newSemesters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, null, msgs);
			msgs = basicSetSemesters(newSemesters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.SELECTED_SEMESTER__SEMESTERS, newSemesters, newSemesters));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				return basicSetSemesters(null, msgs);
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
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTERS:
				return getSemesters();
			case MyEcorePackage.SELECTED_SEMESTER__SEMESTER_NAME:
				return getSemesterName();
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
