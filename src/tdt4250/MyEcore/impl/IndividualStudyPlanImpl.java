/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.MyEcore.IndividualStudyPlan;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.SelectedSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.impl.IndividualStudyPlanImpl#getSelectedSemesters <em>Selected Semesters</em>}</li>
 *   <li>{@link tdt4250.MyEcore.impl.IndividualStudyPlanImpl#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualStudyPlanImpl extends MinimalEObjectImpl.Container implements IndividualStudyPlan {
	/**
	 * The cached value of the '{@link #getSelectedSemesters() <em>Selected Semesters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSemesters()
	 * @generated
	 * @ordered
	 */
	protected SelectedSemester selectedSemesters;

	/**
	 * The default value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected static final String RESULTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected String results = RESULTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualStudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyEcorePackage.Literals.INDIVIDUAL_STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedSemester getSelectedSemesters() {
		if (selectedSemesters != null && selectedSemesters.eIsProxy()) {
			InternalEObject oldSelectedSemesters = (InternalEObject)selectedSemesters;
			selectedSemesters = (SelectedSemester)eResolveProxy(oldSelectedSemesters);
			if (selectedSemesters != oldSelectedSemesters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS, oldSelectedSemesters, selectedSemesters));
			}
		}
		return selectedSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedSemester basicGetSelectedSemesters() {
		return selectedSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedSemesters(SelectedSemester newSelectedSemesters) {
		SelectedSemester oldSelectedSemesters = selectedSemesters;
		selectedSemesters = newSelectedSemesters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS, oldSelectedSemesters, selectedSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResults(String newResults) {
		String oldResults = results;
		results = newResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__RESULTS, oldResults, results));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				if (resolve) return getSelectedSemesters();
				return basicGetSelectedSemesters();
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__RESULTS:
				return getResults();
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
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				setSelectedSemesters((SelectedSemester)newValue);
				return;
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__RESULTS:
				setResults((String)newValue);
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
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				setSelectedSemesters((SelectedSemester)null);
				return;
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__RESULTS:
				setResults(RESULTS_EDEFAULT);
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
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				return selectedSemesters != null;
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__RESULTS:
				return RESULTS_EDEFAULT == null ? results != null : !RESULTS_EDEFAULT.equals(results);
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
		result.append(" (results: ");
		result.append(results);
		result.append(')');
		return result.toString();
	}

} //IndividualStudyPlanImpl
