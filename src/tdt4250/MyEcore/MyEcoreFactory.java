/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.MyEcore.MyEcorePackage
 * @generated
 */
public interface MyEcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyEcoreFactory eINSTANCE = tdt4250.MyEcore.impl.MyEcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>School</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>School</em>'.
	 * @generated
	 */
	School createSchool();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	Year createYear();

	/**
	 * Returns a new object of class '<em>Program With No Specialication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program With No Specialication</em>'.
	 * @generated
	 */
	ProgramWithNoSpecialication createProgramWithNoSpecialication();

	/**
	 * Returns a new object of class '<em>Program With Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program With Specialisation</em>'.
	 * @generated
	 */
	ProgramWithSpecialisation createProgramWithSpecialisation();

	/**
	 * Returns a new object of class '<em>Specialisation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation</em>'.
	 * @generated
	 */
	Specialisation createSpecialisation();

	/**
	 * Returns a new object of class '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semester</em>'.
	 * @generated
	 */
	Semester createSemester();

	/**
	 * Returns a new object of class '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course</em>'.
	 * @generated
	 */
	Course createCourse();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	Student createStudent();

	/**
	 * Returns a new object of class '<em>Individual Study Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Study Plan</em>'.
	 * @generated
	 */
	IndividualStudyPlan createIndividualStudyPlan();

	/**
	 * Returns a new object of class '<em>Selected Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selected Semester</em>'.
	 * @generated
	 */
	SelectedSemester createSelectedSemester();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MyEcorePackage getMyEcorePackage();

} //MyEcoreFactory
