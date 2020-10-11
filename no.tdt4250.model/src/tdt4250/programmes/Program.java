/**
 */
package tdt4250.programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.Program#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.programmes.Program#getProgramYears <em>Program Years</em>}</li>
 *   <li>{@link tdt4250.programmes.Program#getSchool <em>School</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgram_Name()
	 * @model dataType="tdt4250.programmes.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Program Years</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.Year}.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.Year#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Years</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getProgram_ProgramYears()
	 * @see tdt4250.programmes.Year#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Year> getProgramYears();

	/**
	 * Returns the value of the '<em><b>School</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.School#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' container reference.
	 * @see #setSchool(School)
	 * @see tdt4250.programmes.ProgrammesPackage#getProgram_School()
	 * @see tdt4250.programmes.School#getPrograms
	 * @model opposite="programs" transient="false"
	 * @generated
	 */
	School getSchool();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Program#getSchool <em>School</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School</em>' container reference.
	 * @see #getSchool()
	 * @generated
	 */
	void setSchool(School value);

} // Program
