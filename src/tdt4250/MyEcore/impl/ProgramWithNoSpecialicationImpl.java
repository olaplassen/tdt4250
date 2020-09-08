/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.Semester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program With No Specialication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl#getSemsters <em>Semsters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramWithNoSpecialicationImpl extends ProgramImpl implements ProgramWithNoSpecialication {
	/**
	 * The cached value of the '{@link #getSemsters() <em>Semsters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemsters()
	 * @generated
	 * @ordered
	 */
	protected Semester semsters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramWithNoSpecialicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.PROGRAM_WITH_NO_SPECIALICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester getSemsters() {
		return semsters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemsters(Semester newSemsters, NotificationChain msgs) {
		Semester oldSemsters = semsters;
		semsters = newSemsters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS, oldSemsters, newSemsters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemsters(Semester newSemsters) {
		if (newSemsters != semsters) {
			NotificationChain msgs = null;
			if (semsters != null)
				msgs = ((InternalEObject)semsters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS, null, msgs);
			if (newSemsters != null)
				msgs = ((InternalEObject)newSemsters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS, null, msgs);
			msgs = basicSetSemsters(newSemsters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS, newSemsters, newSemsters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS:
				return basicSetSemsters(null, msgs);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS:
				return getSemsters();
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS:
				setSemsters((Semester)newValue);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS:
				setSemsters((Semester)null);
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
			case MyEcorePackage.PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS:
				return semsters != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramWithNoSpecialicationImpl
