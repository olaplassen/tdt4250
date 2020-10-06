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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
	 * The cached value of the '{@link #getSelectedSemesters() <em>Selected Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectedSemester> selectedSemesters;

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
	public EList<SelectedSemester> getSelectedSemesters() {
		if (selectedSemesters == null) {
			selectedSemesters = new EObjectContainmentWithInverseEList<SelectedSemester>(SelectedSemester.class, this, MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS, MyEcorePackage.SELECTED_SEMESTER__STUDY_PLAN);
		}
		return selectedSemesters;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSelectedSemesters()).basicAdd(otherEnd, msgs);
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
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				return ((InternalEList<?>)getSelectedSemesters()).basicRemove(otherEnd, msgs);
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
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				return getSelectedSemesters();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyEcorePackage.INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS:
				getSelectedSemesters().clear();
				getSelectedSemesters().addAll((Collection<? extends SelectedSemester>)newValue);
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
				getSelectedSemesters().clear();
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
				return selectedSemesters != null && !selectedSemesters.isEmpty();
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
