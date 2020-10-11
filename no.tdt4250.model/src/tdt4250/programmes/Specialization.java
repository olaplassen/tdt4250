/**
 */
package tdt4250.programmes;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.programmes.Specialization#getSpecializesIn <em>Specializes In</em>}</li>
 *   <li>{@link tdt4250.programmes.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.programmes.Specialization#getSemsters <em>Semsters</em>}</li>
 *   <li>{@link tdt4250.programmes.Specialization#getSemesterSpecialization <em>Semester Specialization</em>}</li>
 * </ul>
 *
 * @see tdt4250.programmes.ProgrammesPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Specializes In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes In</em>' reference.
	 * @see #setSpecializesIn(Program)
	 * @see tdt4250.programmes.ProgrammesPackage#getSpecialization_SpecializesIn()
	 * @model
	 * @generated
	 */
	Program getSpecializesIn();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Specialization#getSpecializesIn <em>Specializes In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes In</em>' reference.
	 * @see #getSpecializesIn()
	 * @generated
	 */
	void setSpecializesIn(Program value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.programmes.ProgrammesPackage#getSpecialization_Name()
	 * @model dataType="tdt4250.programmes.Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semsters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.programmes.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.ProgramSemester#getRootProgram <em>Root Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semsters</em>' containment reference list.
	 * @see tdt4250.programmes.ProgrammesPackage#getSpecialization_Semsters()
	 * @see tdt4250.programmes.ProgramSemester#getRootProgram
	 * @model opposite="rootProgram" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemsters();

	/**
	 * Returns the value of the '<em><b>Semester Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.programmes.ProgramSemester#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Specialization</em>' container reference.
	 * @see #setSemesterSpecialization(ProgramSemester)
	 * @see tdt4250.programmes.ProgrammesPackage#getSpecialization_SemesterSpecialization()
	 * @see tdt4250.programmes.ProgramSemester#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	ProgramSemester getSemesterSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.programmes.Specialization#getSemesterSpecialization <em>Semester Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Specialization</em>' container reference.
	 * @see #getSemesterSpecialization()
	 * @generated
	 */
	void setSemesterSpecialization(ProgramSemester value);

} // Specialization
