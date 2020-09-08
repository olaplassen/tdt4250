/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters <em>Selected Semesters</em>}</li>
 *   <li>{@link tdt4250.MyEcore.IndividualStudyPlan#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getIndividualStudyPlan()
 * @model
 * @generated
 */
public interface IndividualStudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Selected Semesters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Semesters</em>' reference.
	 * @see #setSelectedSemesters(SelectedSemester)
	 * @see tdt4250.MyEcore.MyEcorePackage#getIndividualStudyPlan_SelectedSemesters()
	 * @model
	 * @generated
	 */
	SelectedSemester getSelectedSemesters();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters <em>Selected Semesters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Semesters</em>' reference.
	 * @see #getSelectedSemesters()
	 * @generated
	 */
	void setSelectedSemesters(SelectedSemester value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' attribute.
	 * @see #setResults(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getIndividualStudyPlan_Results()
	 * @model
	 * @generated
	 */
	String getResults();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.IndividualStudyPlan#getResults <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' attribute.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(String value);

} // IndividualStudyPlan
