/**
 */
package tdt4250.MyEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.MyEcore.MyEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface MyEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MyEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250/model/my.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MyEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MyEcorePackage eINSTANCE = tdt4250.MyEcore.impl.MyEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.SchoolImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__PROGRAMS = 0;

	/**
	 * The feature id for the '<em><b>School Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__SCHOOL_NAME = 1;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__STUDENTS = 2;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.ProgramImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Program Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_CREDIT_REQUIREMENTS = 1;

	/**
	 * The feature id for the '<em><b>Program Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__PROGRAM_YEAR = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.YearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.YearImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getYear()
	 * @generated
	 */
	int YEAR = 2;

	/**
	 * The feature id for the '<em><b>Ordinary Programs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__ORDINARY_PROGRAMS = 0;

	/**
	 * The feature id for the '<em><b>Programs With Specialisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__PROGRAMS_WITH_SPECIALISATION = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR__YEAR = 2;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl <em>Program With No Specialication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgramWithNoSpecialication()
	 * @generated
	 */
	int PROGRAM_WITH_NO_SPECIALICATION = 3;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_NAME = PROGRAM__PROGRAM_NAME;

	/**
	 * The feature id for the '<em><b>Program Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_CREDIT_REQUIREMENTS = PROGRAM__PROGRAM_CREDIT_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Program Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR = PROGRAM__PROGRAM_YEAR;

	/**
	 * The feature id for the '<em><b>Semsters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS = PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program With No Specialication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION_FEATURE_COUNT = PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program With No Specialication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_NO_SPECIALICATION_OPERATION_COUNT = PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl <em>Program With Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgramWithSpecialisation()
	 * @generated
	 */
	int PROGRAM_WITH_SPECIALISATION = 4;

	/**
	 * The feature id for the '<em><b>Program Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION__PROGRAM_NAME = PROGRAM__PROGRAM_NAME;

	/**
	 * The feature id for the '<em><b>Program Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION__PROGRAM_CREDIT_REQUIREMENTS = PROGRAM__PROGRAM_CREDIT_REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Program Year</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION__PROGRAM_YEAR = PROGRAM__PROGRAM_YEAR;

	/**
	 * The feature id for the '<em><b>Specilisations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION__SPECILISATIONS = PROGRAM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program With Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION_FEATURE_COUNT = PROGRAM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Program With Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_WITH_SPECIALISATION_OPERATION_COUNT = PROGRAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.SpecialisationImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSpecialisation()
	 * @generated
	 */
	int SPECIALISATION = 5;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.SemesterImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 6;

	/**
	 * The feature id for the '<em><b>Elective Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVE_COURSES = 0;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Semester Credit Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_CREDIT_REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.CourseImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDIT = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.StudentImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = 4;

	/**
	 * The feature id for the '<em><b>School</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__SCHOOL = 5;

	/**
	 * The feature id for the '<em><b>Individual Study Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__INDIVIDUAL_STUDY_PLAN = 6;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.IndividualStudyPlanImpl <em>Individual Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.IndividualStudyPlanImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getIndividualStudyPlan()
	 * @generated
	 */
	int INDIVIDUAL_STUDY_PLAN = 9;

	/**
	 * The feature id for the '<em><b>Selected Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN__RESULTS = 1;

	/**
	 * The number of structural features of the '<em>Individual Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Individual Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.MyEcore.impl.SelectedSemesterImpl <em>Selected Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.MyEcore.impl.SelectedSemesterImpl
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSelectedSemester()
	 * @generated
	 */
	int SELECTED_SEMESTER = 10;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SEMESTER__SEMESTERS = 0;

	/**
	 * The feature id for the '<em><b>Semester Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SEMESTER__SEMESTER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Selected Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SEMESTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Selected Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_SEMESTER_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 11;


	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see tdt4250.MyEcore.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.MyEcore.School#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see tdt4250.MyEcore.School#getPrograms()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Programs();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.School#getSchoolName <em>School Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School Name</em>'.
	 * @see tdt4250.MyEcore.School#getSchoolName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_SchoolName();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.School#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Students</em>'.
	 * @see tdt4250.MyEcore.School#getStudents()
	 * @see #getSchool()
	 * @generated
	 */
	EReference getSchool_Students();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see tdt4250.MyEcore.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Program#getProgramName <em>Program Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Name</em>'.
	 * @see tdt4250.MyEcore.Program#getProgramName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Program#getProgramCreditRequirements <em>Program Credit Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Credit Requirements</em>'.
	 * @see tdt4250.MyEcore.Program#getProgramCreditRequirements()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_ProgramCreditRequirements();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Program#getProgramYear <em>Program Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Year</em>'.
	 * @see tdt4250.MyEcore.Program#getProgramYear()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_ProgramYear();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Year <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see tdt4250.MyEcore.Year
	 * @generated
	 */
	EClass getYear();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Year#getOrdinaryPrograms <em>Ordinary Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ordinary Programs</em>'.
	 * @see tdt4250.MyEcore.Year#getOrdinaryPrograms()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_OrdinaryPrograms();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Year#getProgramsWithSpecialisation <em>Programs With Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programs With Specialisation</em>'.
	 * @see tdt4250.MyEcore.Year#getProgramsWithSpecialisation()
	 * @see #getYear()
	 * @generated
	 */
	EReference getYear_ProgramsWithSpecialisation();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Year#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see tdt4250.MyEcore.Year#getYear()
	 * @see #getYear()
	 * @generated
	 */
	EAttribute getYear_Year();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.ProgramWithNoSpecialication <em>Program With No Specialication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program With No Specialication</em>'.
	 * @see tdt4250.MyEcore.ProgramWithNoSpecialication
	 * @generated
	 */
	EClass getProgramWithNoSpecialication();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.ProgramWithNoSpecialication#getSemsters <em>Semsters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semsters</em>'.
	 * @see tdt4250.MyEcore.ProgramWithNoSpecialication#getSemsters()
	 * @see #getProgramWithNoSpecialication()
	 * @generated
	 */
	EReference getProgramWithNoSpecialication_Semsters();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.ProgramWithSpecialisation <em>Program With Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program With Specialisation</em>'.
	 * @see tdt4250.MyEcore.ProgramWithSpecialisation
	 * @generated
	 */
	EClass getProgramWithSpecialisation();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.ProgramWithSpecialisation#getSpecilisations <em>Specilisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specilisations</em>'.
	 * @see tdt4250.MyEcore.ProgramWithSpecialisation#getSpecilisations()
	 * @see #getProgramWithSpecialisation()
	 * @generated
	 */
	EReference getProgramWithSpecialisation_Specilisations();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Specialisation <em>Specialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation</em>'.
	 * @see tdt4250.MyEcore.Specialisation
	 * @generated
	 */
	EClass getSpecialisation();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Specialisation#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semesters</em>'.
	 * @see tdt4250.MyEcore.Specialisation#getSemesters()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EReference getSpecialisation_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Specialisation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.MyEcore.Specialisation#getName()
	 * @see #getSpecialisation()
	 * @generated
	 */
	EAttribute getSpecialisation_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see tdt4250.MyEcore.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.MyEcore.Semester#getElectiveCourses <em>Elective Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elective Courses</em>'.
	 * @see tdt4250.MyEcore.Semester#getElectiveCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_ElectiveCourses();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Semester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mandatory Courses</em>'.
	 * @see tdt4250.MyEcore.Semester#getMandatoryCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_MandatoryCourses();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Semester#getSemesterCreditRequirements <em>Semester Credit Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Credit Requirements</em>'.
	 * @see tdt4250.MyEcore.Semester#getSemesterCreditRequirements()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterCreditRequirements();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.MyEcore.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.MyEcore.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Course#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see tdt4250.MyEcore.Course#getCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credit();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see tdt4250.MyEcore.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see tdt4250.MyEcore.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Student#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.MyEcore.Student#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Student#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see tdt4250.MyEcore.Student#getFirstName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Student#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see tdt4250.MyEcore.Student#getNumber()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Number();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Student#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.MyEcore.Student#getId()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Id();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.MyEcore.Student#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>School</em>'.
	 * @see tdt4250.MyEcore.Student#getSchool()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_School();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.Student#getIndividualStudyPlan <em>Individual Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual Study Plan</em>'.
	 * @see tdt4250.MyEcore.Student#getIndividualStudyPlan()
	 * @see #getStudent()
	 * @generated
	 */
	EReference getStudent_IndividualStudyPlan();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.Student#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see tdt4250.MyEcore.Student#getLastName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_LastName();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.IndividualStudyPlan <em>Individual Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Study Plan</em>'.
	 * @see tdt4250.MyEcore.IndividualStudyPlan
	 * @generated
	 */
	EClass getIndividualStudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters <em>Selected Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selected Semesters</em>'.
	 * @see tdt4250.MyEcore.IndividualStudyPlan#getSelectedSemesters()
	 * @see #getIndividualStudyPlan()
	 * @generated
	 */
	EReference getIndividualStudyPlan_SelectedSemesters();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.IndividualStudyPlan#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results</em>'.
	 * @see tdt4250.MyEcore.IndividualStudyPlan#getResults()
	 * @see #getIndividualStudyPlan()
	 * @generated
	 */
	EAttribute getIndividualStudyPlan_Results();

	/**
	 * Returns the meta object for class '{@link tdt4250.MyEcore.SelectedSemester <em>Selected Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected Semester</em>'.
	 * @see tdt4250.MyEcore.SelectedSemester
	 * @generated
	 */
	EClass getSelectedSemester();

	/**
	 * Returns the meta object for the containment reference '{@link tdt4250.MyEcore.SelectedSemester#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semesters</em>'.
	 * @see tdt4250.MyEcore.SelectedSemester#getSemesters()
	 * @see #getSelectedSemester()
	 * @generated
	 */
	EReference getSelectedSemester_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.MyEcore.SelectedSemester#getSemesterName <em>Semester Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Name</em>'.
	 * @see tdt4250.MyEcore.SelectedSemester#getSemesterName()
	 * @see #getSelectedSemester()
	 * @generated
	 */
	EAttribute getSelectedSemester_SemesterName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MyEcoreFactory getMyEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.SchoolImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__PROGRAMS = eINSTANCE.getSchool_Programs();

		/**
		 * The meta object literal for the '<em><b>School Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__SCHOOL_NAME = eINSTANCE.getSchool_SchoolName();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL__STUDENTS = eINSTANCE.getSchool_Students();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.ProgramImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Program Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_NAME = eINSTANCE.getProgram_ProgramName();

		/**
		 * The meta object literal for the '<em><b>Program Credit Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__PROGRAM_CREDIT_REQUIREMENTS = eINSTANCE.getProgram_ProgramCreditRequirements();

		/**
		 * The meta object literal for the '<em><b>Program Year</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__PROGRAM_YEAR = eINSTANCE.getProgram_ProgramYear();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.YearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.YearImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getYear()
		 * @generated
		 */
		EClass YEAR = eINSTANCE.getYear();

		/**
		 * The meta object literal for the '<em><b>Ordinary Programs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__ORDINARY_PROGRAMS = eINSTANCE.getYear_OrdinaryPrograms();

		/**
		 * The meta object literal for the '<em><b>Programs With Specialisation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YEAR__PROGRAMS_WITH_SPECIALISATION = eINSTANCE.getYear_ProgramsWithSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute YEAR__YEAR = eINSTANCE.getYear_Year();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl <em>Program With No Specialication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.ProgramWithNoSpecialicationImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgramWithNoSpecialication()
		 * @generated
		 */
		EClass PROGRAM_WITH_NO_SPECIALICATION = eINSTANCE.getProgramWithNoSpecialication();

		/**
		 * The meta object literal for the '<em><b>Semsters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_WITH_NO_SPECIALICATION__SEMSTERS = eINSTANCE.getProgramWithNoSpecialication_Semsters();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl <em>Program With Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.ProgramWithSpecialisationImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getProgramWithSpecialisation()
		 * @generated
		 */
		EClass PROGRAM_WITH_SPECIALISATION = eINSTANCE.getProgramWithSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Specilisations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_WITH_SPECIALISATION__SPECILISATIONS = eINSTANCE.getProgramWithSpecialisation_Specilisations();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.SpecialisationImpl <em>Specialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.SpecialisationImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSpecialisation()
		 * @generated
		 */
		EClass SPECIALISATION = eINSTANCE.getSpecialisation();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALISATION__SEMESTERS = eINSTANCE.getSpecialisation_Semesters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALISATION__NAME = eINSTANCE.getSpecialisation_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.SemesterImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Elective Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVE_COURSES = eINSTANCE.getSemester_ElectiveCourses();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY_COURSES = eINSTANCE.getSemester_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>Semester Credit Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_CREDIT_REQUIREMENTS = eINSTANCE.getSemester_SemesterCreditRequirements();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.CourseImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDIT = eINSTANCE.getCourse_Credit();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.StudentImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__FIRST_NAME = eINSTANCE.getStudent_FirstName();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NUMBER = eINSTANCE.getStudent_Number();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__ID = eINSTANCE.getStudent_Id();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__SCHOOL = eINSTANCE.getStudent_School();

		/**
		 * The meta object literal for the '<em><b>Individual Study Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDENT__INDIVIDUAL_STUDY_PLAN = eINSTANCE.getStudent_IndividualStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__LAST_NAME = eINSTANCE.getStudent_LastName();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.IndividualStudyPlanImpl <em>Individual Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.IndividualStudyPlanImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getIndividualStudyPlan()
		 * @generated
		 */
		EClass INDIVIDUAL_STUDY_PLAN = eINSTANCE.getIndividualStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Selected Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS = eINSTANCE.getIndividualStudyPlan_SelectedSemesters();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL_STUDY_PLAN__RESULTS = eINSTANCE.getIndividualStudyPlan_Results();

		/**
		 * The meta object literal for the '{@link tdt4250.MyEcore.impl.SelectedSemesterImpl <em>Selected Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.MyEcore.impl.SelectedSemesterImpl
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getSelectedSemester()
		 * @generated
		 */
		EClass SELECTED_SEMESTER = eINSTANCE.getSelectedSemester();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_SEMESTER__SEMESTERS = eINSTANCE.getSelectedSemester_Semesters();

		/**
		 * The meta object literal for the '<em><b>Semester Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_SEMESTER__SEMESTER_NAME = eINSTANCE.getSelectedSemester_SemesterName();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tdt4250.MyEcore.impl.MyEcorePackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //MyEcorePackage
