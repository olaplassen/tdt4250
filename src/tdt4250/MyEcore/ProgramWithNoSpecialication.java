/**
 */
package tdt4250.MyEcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With No Specialication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getSemsters <em>Semsters</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication()
 * @model
 * @generated
 */
public interface ProgramWithNoSpecialication extends Program {
	/**
	 * Returns the value of the '<em><b>Semsters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semsters</em>' containment reference.
	 * @see #setSemsters(Semester)
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithNoSpecialication_Semsters()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemsters();

	/**
	 * Sets the value of the '{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getSemsters <em>Semsters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semsters</em>' containment reference.
	 * @see #getSemsters()
	 * @generated
	 */
	void setSemsters(Semester value);

} // ProgramWithNoSpecialication
