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
import tdt4250.MyEcore.Semester;
import tdt4250.MyEcore.Specialisation;
import tdt4250.MyEcore.Year;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getSpecilisations <em>Specilisations</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.YearImpl#getSemsters <em>Semsters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YearImpl extends MinimalEObjectImpl.Container implements Year {
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
	 * The cached value of the '{@link #getSpecilisations() <em>Specilisations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecilisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialisation> specilisations;

	/**
	 * The cached value of the '{@link #getSemsters() <em>Semsters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemsters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semsters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.YEAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.YEAR__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specialisation> getSpecilisations() {
		if (specilisations == null) {
			specilisations = new EObjectContainmentEList<Specialisation>(Specialisation.class, this, MyEcorePackage.YEAR__SPECILISATIONS);
		}
		return specilisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semester> getSemsters() {
		if (semsters == null) {
			semsters = new EObjectContainmentEList<Semester>(Semester.class, this, MyEcorePackage.YEAR__SEMSTERS);
		}
		return semsters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.YEAR__SPECILISATIONS:
				return ((InternalEList<?>)getSpecilisations()).basicRemove(otherEnd, msgs);
			case MyEcorePackage.YEAR__SEMSTERS:
				return ((InternalEList<?>)getSemsters()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.YEAR__YEAR:
				return getYear();
			case MyEcorePackage.YEAR__SPECILISATIONS:
				return getSpecilisations();
			case MyEcorePackage.YEAR__SEMSTERS:
				return getSemsters();
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
			case MyEcorePackage.YEAR__YEAR:
				setYear((Integer)newValue);
				return;
			case MyEcorePackage.YEAR__SPECILISATIONS:
				getSpecilisations().clear();
				getSpecilisations().addAll((Collection<? extends Specialisation>)newValue);
				return;
			case MyEcorePackage.YEAR__SEMSTERS:
				getSemsters().clear();
				getSemsters().addAll((Collection<? extends Semester>)newValue);
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
			case MyEcorePackage.YEAR__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case MyEcorePackage.YEAR__SPECILISATIONS:
				getSpecilisations().clear();
				return;
			case MyEcorePackage.YEAR__SEMSTERS:
				getSemsters().clear();
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
			case MyEcorePackage.YEAR__YEAR:
				return year != YEAR_EDEFAULT;
			case MyEcorePackage.YEAR__SPECILISATIONS:
				return specilisations != null && !specilisations.isEmpty();
			case MyEcorePackage.YEAR__SEMSTERS:
				return semsters != null && !semsters.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //YearImpl
