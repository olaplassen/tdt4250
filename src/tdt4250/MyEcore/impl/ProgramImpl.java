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
import tdt4250.MyEcore.Program;
import tdt4250.MyEcore.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramImpl#getProgramName <em>Program Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramImpl#getProgramCreditRequirements <em>Program Credit Requirements</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.ProgramImpl#getProgramYear <em>Program Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramName() <em>Program Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramName()
	 * @generated
	 * @ordered
	 */
	protected String programName = PROGRAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramCreditRequirements() <em>Program Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCreditRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final float PROGRAM_CREDIT_REQUIREMENTS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProgramCreditRequirements() <em>Program Credit Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramCreditRequirements()
	 * @generated
	 * @ordered
	 */
	protected float programCreditRequirements = PROGRAM_CREDIT_REQUIREMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgramYear() <em>Program Year</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramYear()
	 * @generated
	 * @ordered
	 */
	protected Year programYear;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramName() {
		return programName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramName(String newProgramName) {
		String oldProgramName = programName;
		programName = newProgramName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM__PROGRAM_NAME, oldProgramName, programName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProgramCreditRequirements() {
		return programCreditRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramCreditRequirements(float newProgramCreditRequirements) {
		float oldProgramCreditRequirements = programCreditRequirements;
		programCreditRequirements = newProgramCreditRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM__PROGRAM_CREDIT_REQUIREMENTS, oldProgramCreditRequirements, programCreditRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Year getProgramYear() {
		return programYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramYear(Year newProgramYear, NotificationChain msgs) {
		Year oldProgramYear = programYear;
		programYear = newProgramYear;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM__PROGRAM_YEAR, oldProgramYear, newProgramYear);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramYear(Year newProgramYear) {
		if (newProgramYear != programYear) {
			NotificationChain msgs = null;
			if (programYear != null)
				msgs = ((InternalEObject)programYear).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM__PROGRAM_YEAR, null, msgs);
			if (newProgramYear != null)
				msgs = ((InternalEObject)newProgramYear).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyEcorePackage.PROGRAM__PROGRAM_YEAR, null, msgs);
			msgs = basicSetProgramYear(newProgramYear, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.PROGRAM__PROGRAM_YEAR, newProgramYear, newProgramYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.PROGRAM__PROGRAM_YEAR:
				return basicSetProgramYear(null, msgs);
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
			case MyEcorePackage.PROGRAM__PROGRAM_NAME:
				return getProgramName();
			case MyEcorePackage.PROGRAM__PROGRAM_CREDIT_REQUIREMENTS:
				return getProgramCreditRequirements();
			case MyEcorePackage.PROGRAM__PROGRAM_YEAR:
				return getProgramYear();
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
			case MyEcorePackage.PROGRAM__PROGRAM_NAME:
				setProgramName((String)newValue);
				return;
			case MyEcorePackage.PROGRAM__PROGRAM_CREDIT_REQUIREMENTS:
				setProgramCreditRequirements((Float)newValue);
				return;
			case MyEcorePackage.PROGRAM__PROGRAM_YEAR:
				setProgramYear((Year)newValue);
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
			case MyEcorePackage.PROGRAM__PROGRAM_NAME:
				setProgramName(PROGRAM_NAME_EDEFAULT);
				return;
			case MyEcorePackage.PROGRAM__PROGRAM_CREDIT_REQUIREMENTS:
				setProgramCreditRequirements(PROGRAM_CREDIT_REQUIREMENTS_EDEFAULT);
				return;
			case MyEcorePackage.PROGRAM__PROGRAM_YEAR:
				setProgramYear((Year)null);
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
			case MyEcorePackage.PROGRAM__PROGRAM_NAME:
				return PROGRAM_NAME_EDEFAULT == null ? programName != null : !PROGRAM_NAME_EDEFAULT.equals(programName);
			case MyEcorePackage.PROGRAM__PROGRAM_CREDIT_REQUIREMENTS:
				return programCreditRequirements != PROGRAM_CREDIT_REQUIREMENTS_EDEFAULT;
			case MyEcorePackage.PROGRAM__PROGRAM_YEAR:
				return programYear != null;
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
		result.append(" (programName: ");
		result.append(programName);
		result.append(", programCreditRequirements: ");
		result.append(programCreditRequirements);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
