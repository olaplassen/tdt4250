/**
 */
package tdt4250.programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getSemesterKind <em>Semester Kind</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getProgramYear <em>Program Year</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link tdt4250.programmes.ProgramSemester#getRootProgram <em>Root Program</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseTypeEqualsSemesterType'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseTypeEqualsSemesterType='if(self.specializations-&gt;size() &lt; 1)  then (self.electiveCourses-&gt;forAll(course | course.courseSemesterType.value == self.SemesterKind.value)) else (self.specializations-&gt;forAll(specialization | specialization.semsters-&gt;forAll(semester | semester.electiveCourses-&gt;forAll(course | (course.courseSemesterType.value == semester.SemesterKind.value)))) endif'"
 * @generated
 */
public interface ProgramSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.ProgramSemester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Semester Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.programmes.SemesterKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Kind</em>' attribute.
	 * @see tdt4250.programmes.SemesterKind
	 * @see #setSemesterKind(SemesterKind)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_SemesterKind()
	 * @model
	 * @generated
	 */
	SemesterKind getSemesterKind();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.ProgramSemester#getSemesterKind <em>Semester Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Kind</em>' attribute.
	 * @see tdt4250.programmes.SemesterKind
	 * @see #getSemesterKind()
	 * @generated
	 */
	void setSemesterKind(SemesterKind value);

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_MandatoryCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_ElectiveCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getElectiveCourses();

	/**
	 * Returns the value of the '<em><b>Program Year</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Year#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Year</em>' container reference.
	 * @see #setProgramYear(Year)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_ProgramYear()
	 * @see tdt4250.programmes.Year#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Year getProgramYear();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.ProgramSemester#getProgramYear <em>Program Year</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Year</em>' container reference.
	 * @see #getProgramYear()
	 * @generated
	 */
	void setProgramYear(Year value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.Specialization}.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Specialization#getSemesterSpecialization <em>Semester Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_Specializations()
	 * @see tdt4250.programmes.Specialization#getSemesterSpecialization
	 * @model opposite="semesterSpecialization" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Root Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Specialization#getSemsters <em>Semsters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Program</em>' container reference.
	 * @see #setRootProgram(Specialization)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgramSemester_RootProgram()
	 * @see tdt4250.programmes.Specialization#getSemsters
	 * @model opposite="semsters" transient="false"
	 * @generated
	 */
	Specialization getRootProgram();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.ProgramSemester#getRootProgram <em>Root Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Program</em>' container reference.
	 * @see #getRootProgram()
	 * @generated
	 */
	void setRootProgram(Specialization value);

} // ProgramSemester
