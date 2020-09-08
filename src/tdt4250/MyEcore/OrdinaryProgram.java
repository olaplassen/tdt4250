/**
 */
package tdt4250.MyEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinary Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.OrdinaryProgram#getSemsters <em>Semsters</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getOrdinaryProgram()
 * @model
 * @generated
 */
public interface OrdinaryProgram extends Program {
	/**
	 * Returns the value of the '<em><b>Semsters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semsters</em>' containment reference.
	 * @see #setSemsters(Semester)
	 * @see tdt4250.MyEcore.MyEcorePackage#getOrdinaryProgram_Semsters()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemsters();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.OrdinaryProgram#getSemsters <em>Semsters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semsters</em>' containment reference.
	 * @see #getSemsters()
	 * @generated
	 */
	void setSemsters(Semester value);

} // OrdinaryProgram
