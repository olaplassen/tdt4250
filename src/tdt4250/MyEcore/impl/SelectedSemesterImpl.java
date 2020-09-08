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
		}
		return super.eIsSet(featureID);
	}

} //SelectedSemesterImpl
