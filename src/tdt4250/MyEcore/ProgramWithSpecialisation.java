/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program With Specialisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.MyEcore.ProgramWithSpecialisation#getProgramSpecialicationYear <em>Program Specialication Year</em>}</li>
 * </ul>
 *
 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation()
 * @model
 * @generated
 */
public interface ProgramWithSpecialisation extends Program {
	/**
	 * Returns the value of the '<em><b>Program Specialication Year</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.MyEcore.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Specialication Year</em>' containment reference list.
	 * @see tdt4250.MyEcore.MyEcorePackage#getProgramWithSpecialisation_ProgramSpecialicationYear()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getProgramSpecialicationYear();

} // ProgramWithSpecialisation
