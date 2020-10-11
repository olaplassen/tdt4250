/**
 */
package tdt4250.programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.Year#getYear <em>Year</em>}</li>
 *   <li>{@link tdt4250.programmes.Year#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.programmes.Year#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='correctYearFormat'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 correctYearFormat='self.year.size() == 4 AND self.year.matches(\'[0-9]\')'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getYear_Year()
	 * @model
	 * @generated
	 */
	String getYear();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Year#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(String value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Program#getProgramYears <em>Program Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see tdt4250.programmes.ProgrammesPackage#getYear_Program()
	 * @see tdt4250.programmes.Program#getProgramYears
	 * @model opposite="programYears" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Year#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.ProgramSemester#getProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getYear_Semesters()
	 * @see tdt4250.programmes.ProgramSemester#getProgramYear
	 * @model opposite="ProgramYear" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

} // Year
