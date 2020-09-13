/**
 */
package tdt4250.MyEcore.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import tdt4250.MyEcore.Course;
import tdt4250.MyEcore.CourseLevel;
import tdt4250.MyEcore.IndividualStudyPlan;
import tdt4250.MyEcore.MyEcoreFactory;
import tdt4250.MyEcore.MyEcorePackage;
import tdt4250.MyEcore.Program;
import tdt4250.MyEcore.ProgramWithNoSpecialication;
import tdt4250.MyEcore.ProgramWithSpecialisation;
import tdt4250.MyEcore.School;
import tdt4250.MyEcore.SelectedSemester;
import tdt4250.MyEcore.Semester;
import tdt4250.MyEcore.SemesterKind;
import tdt4250.MyEcore.Specialisation;
import tdt4250.MyEcore.Student;
import tdt4250.MyEcore.Year;
import tdt4250.MyEcore.util.MyEcoreValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyEcorePackageImpl extends EPackageImpl implements MyEcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programWithNoSpecialicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programWithSpecialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialisationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualStudyPlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedSemesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType courseCodeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see tdt4250.MyEcore.MyEcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyEcorePackageImpl() {
		super(eNS_URI, MyEcoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MyEcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyEcorePackage init() {
		if (isInited) return (MyEcorePackage)EPackage.Registry.INSTANCE.getEPackage(MyEcorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMyEcorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MyEcorePackageImpl theMyEcorePackage = registeredMyEcorePackage instanceof MyEcorePackageImpl ? (MyEcorePackageImpl)registeredMyEcorePackage : new MyEcorePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMyEcorePackage.createPackageContents();

		// Initialize created meta-data
		theMyEcorePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMyEcorePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MyEcoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMyEcorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyEcorePackage.eNS_URI, theMyEcorePackage);
		return theMyEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchool() {
		return schoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchool_ProgramsWithNoSpecialication() {
		return (EReference)schoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchool_SchoolName() {
		return (EAttribute)schoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchool_Students() {
		return (EReference)schoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchool_ProgramsWithSpecialications() {
		return (EReference)schoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgram() {
		return programEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_ProgramName() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgram_ProgramCreditRequirements() {
		return (EAttribute)programEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYear() {
		return yearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYear_Year() {
		return (EAttribute)yearEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYear_Specilisations() {
		return (EReference)yearEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getYear_Semsters() {
		return (EReference)yearEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramWithNoSpecialication() {
		return programWithNoSpecialicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramWithNoSpecialication_ProgramYear() {
		return (EReference)programWithNoSpecialicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramWithSpecialisation() {
		return programWithSpecialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramWithSpecialisation_ProgramSpecialicationYear() {
		return (EReference)programWithSpecialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialisation() {
		return specialisationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_Semesters() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialisation_Name() {
		return (EAttribute)specialisationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecialisation_NewSpecialication() {
		return (EReference)specialisationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_Year() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_ElectiveCourses() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemester_MandatoryCourses() {
		return (EReference)semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSemester_SemesterKind() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Credit() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Level() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_FallOrAutumnCourse() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Name() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_FirstName() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Id() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_School() {
		return (EReference)studentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_IndividualStudyPlan() {
		return (EReference)studentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_LastName() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudent_Email() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndividualStudyPlan() {
		return individualStudyPlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndividualStudyPlan_SelectedSemesters() {
		return (EReference)individualStudyPlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndividualStudyPlan_Results() {
		return (EAttribute)individualStudyPlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedSemester() {
		return selectedSemesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedSemester_Semesters() {
		return (EReference)selectedSemesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectedSemester_SemesterName() {
		return (EAttribute)selectedSemesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSemesterKind() {
		return semesterKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseLevel() {
		return courseLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCourseCode() {
		return courseCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyEcoreFactory getMyEcoreFactory() {
		return (MyEcoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		schoolEClass = createEClass(SCHOOL);
		createEReference(schoolEClass, SCHOOL__PROGRAMS_WITH_NO_SPECIALICATION);
		createEAttribute(schoolEClass, SCHOOL__SCHOOL_NAME);
		createEReference(schoolEClass, SCHOOL__STUDENTS);
		createEReference(schoolEClass, SCHOOL__PROGRAMS_WITH_SPECIALICATIONS);

		programEClass = createEClass(PROGRAM);
		createEAttribute(programEClass, PROGRAM__PROGRAM_NAME);
		createEAttribute(programEClass, PROGRAM__PROGRAM_CREDIT_REQUIREMENTS);

		yearEClass = createEClass(YEAR);
		createEAttribute(yearEClass, YEAR__YEAR);
		createEReference(yearEClass, YEAR__SPECILISATIONS);
		createEReference(yearEClass, YEAR__SEMSTERS);

		programWithNoSpecialicationEClass = createEClass(PROGRAM_WITH_NO_SPECIALICATION);
		createEReference(programWithNoSpecialicationEClass, PROGRAM_WITH_NO_SPECIALICATION__PROGRAM_YEAR);

		programWithSpecialisationEClass = createEClass(PROGRAM_WITH_SPECIALISATION);
		createEReference(programWithSpecialisationEClass, PROGRAM_WITH_SPECIALISATION__PROGRAM_SPECIALICATION_YEAR);

		specialisationEClass = createEClass(SPECIALISATION);
		createEReference(specialisationEClass, SPECIALISATION__SEMESTERS);
		createEAttribute(specialisationEClass, SPECIALISATION__NAME);
		createEReference(specialisationEClass, SPECIALISATION__NEW_SPECIALICATION);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__YEAR);
		createEReference(semesterEClass, SEMESTER__ELECTIVE_COURSES);
		createEReference(semesterEClass, SEMESTER__MANDATORY_COURSES);
		createEAttribute(semesterEClass, SEMESTER__SEMESTER_KIND);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__CREDIT);
		createEAttribute(courseEClass, COURSE__LEVEL);
		createEAttribute(courseEClass, COURSE__FALL_OR_AUTUMN_COURSE);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__NAME);
		createEAttribute(studentEClass, STUDENT__FIRST_NAME);
		createEAttribute(studentEClass, STUDENT__LAST_NAME);
		createEAttribute(studentEClass, STUDENT__EMAIL);
		createEAttribute(studentEClass, STUDENT__ID);
		createEReference(studentEClass, STUDENT__SCHOOL);
		createEReference(studentEClass, STUDENT__INDIVIDUAL_STUDY_PLAN);

		individualStudyPlanEClass = createEClass(INDIVIDUAL_STUDY_PLAN);
		createEReference(individualStudyPlanEClass, INDIVIDUAL_STUDY_PLAN__SELECTED_SEMESTERS);
		createEAttribute(individualStudyPlanEClass, INDIVIDUAL_STUDY_PLAN__RESULTS);

		selectedSemesterEClass = createEClass(SELECTED_SEMESTER);
		createEReference(selectedSemesterEClass, SELECTED_SEMESTER__SEMESTERS);
		createEAttribute(selectedSemesterEClass, SELECTED_SEMESTER__SEMESTER_NAME);

		// Create enums
		semesterKindEEnum = createEEnum(SEMESTER_KIND);
		courseLevelEEnum = createEEnum(COURSE_LEVEL);

		// Create data types
		courseCodeEDataType = createEDataType(COURSE_CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		programWithNoSpecialicationEClass.getESuperTypes().add(this.getProgram());
		programWithSpecialisationEClass.getESuperTypes().add(this.getProgram());

		// Initialize classes, features, and operations; add parameters
		initEClass(schoolEClass, School.class, "School", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchool_ProgramsWithNoSpecialication(), this.getProgramWithNoSpecialication(), null, "programsWithNoSpecialication", null, 0, -1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchool_SchoolName(), ecorePackage.getEString(), "schoolName", null, 0, 1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchool_Students(), this.getStudent(), this.getStudent_School(), "students", null, 0, -1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchool_ProgramsWithSpecialications(), this.getProgramWithSpecialisation(), null, "programsWithSpecialications", null, 0, -1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programEClass, Program.class, "Program", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgram_ProgramName(), ecorePackage.getEString(), "programName", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgram_ProgramCreditRequirements(), ecorePackage.getEInt(), "programCreditRequirements", null, 0, 1, Program.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yearEClass, Year.class, "Year", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getYear_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Specilisations(), this.getSpecialisation(), null, "specilisations", null, 0, -1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getYear_Semsters(), this.getSemester(), null, "semsters", null, 0, -1, Year.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programWithNoSpecialicationEClass, ProgramWithNoSpecialication.class, "ProgramWithNoSpecialication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramWithNoSpecialication_ProgramYear(), this.getYear(), null, "programYear", null, 0, -1, ProgramWithNoSpecialication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programWithSpecialisationEClass, ProgramWithSpecialisation.class, "ProgramWithSpecialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgramWithSpecialisation_ProgramSpecialicationYear(), this.getYear(), null, "programSpecialicationYear", null, 0, -1, ProgramWithSpecialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialisationEClass, Specialisation.class, "Specialisation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialisation_Semesters(), this.getSemester(), null, "semesters", null, 0, 2, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialisation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecialisation_NewSpecialication(), this.getSpecialisation(), null, "newSpecialication", null, 0, -1, Specialisation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_ElectiveCourses(), this.getCourse(), null, "electiveCourses", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSemester_MandatoryCourses(), this.getCourse(), null, "mandatoryCourses", null, 0, -1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_SemesterKind(), this.getSemesterKind(), "SemesterKind", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), this.getCourseCode(), "code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credit(), ecorePackage.getEFloat(), "credit", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Level(), ecorePackage.getEString(), "level", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_FallOrAutumnCourse(), this.getSemesterKind(), "fallOrAutumnCourse", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, Student.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, Student.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Email(), ecorePackage.getEString(), "email", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_School(), this.getSchool(), this.getSchool_Students(), "school", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudent_IndividualStudyPlan(), this.getIndividualStudyPlan(), null, "individualStudyPlan", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(individualStudyPlanEClass, IndividualStudyPlan.class, "IndividualStudyPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualStudyPlan_SelectedSemesters(), this.getSelectedSemester(), null, "selectedSemesters", null, 0, -1, IndividualStudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIndividualStudyPlan_Results(), ecorePackage.getEString(), "results", null, 0, 1, IndividualStudyPlan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedSemesterEClass, SelectedSemester.class, "SelectedSemester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectedSemester_Semesters(), this.getSemester(), null, "semesters", null, 0, 1, SelectedSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSelectedSemester_SemesterName(), ecorePackage.getEString(), "semesterName", null, 0, 1, SelectedSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(semesterKindEEnum, SemesterKind.class, "SemesterKind");
		addEEnumLiteral(semesterKindEEnum, SemesterKind.AUTUMN);
		addEEnumLiteral(semesterKindEEnum, SemesterKind.FALL);

		initEEnum(courseLevelEEnum, CourseLevel.class, "CourseLevel");
		addEEnumLiteral(courseLevelEEnum, CourseLevel.HIGHER_GRADE_LEVEL);
		addEEnumLiteral(courseLevelEEnum, CourseLevel.THIRD_YEAR_LEVEL);

		// Initialize data types
		initEDataType(courseCodeEDataType, String.class, "CourseCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "constraints", "semesterHasEnoughCredit"
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
			   "constraints", "correctCredit"
		   });
		addAnnotation
		  (studentEClass,
		   source,
		   new String[] {
			   "constraints", "nameCharacters"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (semesterEClass,
		   source,
		   new String[] {
			   "semesterHasEnoughCredit", "((self.electiveCourses->collect(e | e.credit)->sum()) + (self.mandatoryCourses->collect(e | e.credit)->sum())) >=30.0"
		   });
	}

} //MyEcorePackageImpl
