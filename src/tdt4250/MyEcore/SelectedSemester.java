/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.SelectedSemester#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.MyEcore.SelectedSemester#getSemesterName <em>Semester Name</em>}</li>
 *   <li>{@link tdt4250.MyEcore.SelectedSemester#getStudyPlan <em>Study Plan</em>}</li>
 *   <li>{@link tdt4250.MyEcore.SelectedSemester#getSelectableCourses <em>Selectable Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester()
 * @model
 * @generated
 */
public interface SelectedSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' reference.
	 * @see #setSemesters(Semester)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester_Semesters()
	 * @model
	 * @generated
	 */
	Semester getSemesters();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.SelectedSemester#getSemesters <em>Semesters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semesters</em>' reference.
	 * @see #getSemesters()
	 * @generated
	 */
	void setSemesters(Semester value);

	/**
	 * Returns the value of the '<em><b>Semester Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Name</em>' attribute.
	 * @see #setSemesterName(String)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester_SemesterName()
	 * @model
	 * @generated
	 */
	String getSemesterName();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.SelectedSemester#getSemesterName <em>Semester Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Name</em>' attribute.
	 * @see #getSemesterName()
	 * @generated
	 */
	void setSemesterName(String value);

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters <em>Selected Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(IndividualStudyPlan)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester_StudyPlan()
	 * @see tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters
	 * @model opposite="selectedSemesters" transient="false"
	 * @generated
	 */
	IndividualStudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.SelectedSemester#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(IndividualStudyPlan value);

	/**
	 * Returns the value of the '<em><b>Selectable Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selectable Courses</em>' containment reference.
	 * @see #setSelectableCourses(Course)
	 * @see tdt4250.MyEcore.MyEcorePackage#getSelectedSemester_SelectableCourses()
	 * @model containment="true"
	 * @generated
	 */
	Course getSelectableCourses();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.SelectedSemester#getSelectableCourses <em>Selectable Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selectable Courses</em>' containment reference.
	 * @see #getSelectableCourses()
	 * @generated
	 */
	void setSelectableCourses(Course value);

} // SelectedSemester
